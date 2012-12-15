#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <string.h>

int main(void)
{
	int iPipe1[2], iPipe2[2], pid = -1, iBufLen = -1;
	char *ptrMsg = (char*)malloc(sizeof(char)*BUFSIZ);

	if(pipe(iPipe1) != 0 )
	{
		perror("Opening Pipe 1 failed");
		return -1;
	}

	if(pipe(iPipe2) != 0 )
	{
		perror("Opening Pipe 2 failed");
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
		close(iPipe1[0]); // Close the reader end of Pipe1
		close(iPipe2[1]); // Close the writer end of Pipe2

		iBufLen = read(iPipe2[0], ptrMsg, BUFSIZ);
		if(iBufLen < 0)
		{
			perror("Child Process: Read Error");
			return -1;
		}
		else
		{
			printf("Child Process has read %d bytes\n", iBufLen);
			printf("Parent told Child: %s\n", ptrMsg);
		}

		strcpy(ptrMsg, "Hello Parent");
		iBufLen = write(iPipe1[1], ptrMsg, BUFSIZ);
		if(iBufLen < 0)
		{
			perror("Child Process: Write Error");
			return -1;
		}
		else
		{
			printf("Child Process has written %d bytes to Parent (%d)\n", iBufLen, getppid());
		}
	}
	else
	{
		//Parent Process
		close(iPipe1[1]); // Close the writer end of Pipe 1
		close(iPipe2[0]); // Close the reader end of Pipe 2

		strcpy(ptrMsg, "Hello Child");
		iBufLen = write(iPipe2[1], ptrMsg, BUFSIZ);
		if(iBufLen < 0)
		{
			perror("Parent Process: Write Error");
			return -1;
		}
		else
		{
			printf("Parent process has written %d bytes to Child %d\n", iBufLen, pid);
		}

		iBufLen = read(iPipe1[0], ptrMsg, BUFSIZ);
		if(iBufLen < 0)
		{
			perror("Parent Process: Read Error");
			return -1;
		}
		else
		{
			printf("Parent Process has read %d bytes\n", iBufLen);
			printf("Child told Parent: %s\n", ptrMsg);
		}
	}

	return 0;
}


