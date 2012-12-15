#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <string.h>
#include <fcntl.h>

int main(void)
{
	int iPipe[2], pid = -1;

	if(pipe(iPipe) != 0 )
	{
		perror("Opening Pipe 1 failed");
		return -1;
	}

	if((pid = fork()) < 0)
	{
		// Error
		perror("fork call failed");
		return -1;
	}
	else if (pid == 0)
	{
		// Child process
		close(iPipe[0]); // Close the reader end of Pipe1

		// Duplicate stdout of the process to enable the process op not write to the output device
//		fcntl(iPipe[1], F_DUPFD, 1);
		dup2(iPipe[1], 1);
		close(iPipe[1]);

		execlp("ls", "ls", NULL);
	}
	else
	{
		//Parent Process
		close(iPipe[1]); // Close the writer end of Pipe 1

//		fcntl(iPipe[0], F_DUPFD, 0);
		dup2(iPipe[0], 0);
		close(iPipe[0]);
		execlp("wc", "wc", NULL);
	}

	return 0;
}

