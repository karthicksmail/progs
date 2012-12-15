#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define TABSPACE 8
#define BUFSIZE 1024

int entab(void);

int main(int argc, char *argv[])
{
	int iRetVal = entab();

	printf("Replaced %d occurences\n", (iRetVal<0)?0:iRetVal);
	return iRetVal;
}

int entab(void)
{
	
