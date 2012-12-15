#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define TABSPACE 8
#define BUFSIZE 1024

int detab(void);
int strrep(char* ptrLine, char* sourStr, char*newStr);

int main(int argc, char *argv[])
{
	int iRetVal = detab();

	printf("Replaced %d occurences\n", (iRetVal<0)?0:iRetVal);
	return iRetVal;
}

int detab(void)
{
	FILE *fpin, *fpout;
	char strFileName[BUFSIZE],*ptrTempFile, strLine[BUFSIZE], strNewStr[TABSPACE + 1]=" ";
	int iOccur = 0;

	memset(strNewStr, ' ', TABSPACE);
	strNewStr[TABSPACE + 1] = '\0';

	memset(strLine, 0, BUFSIZE);

	printf("Enter the name of the file to detab: ");
	fgets(strFileName, BUFSIZE, stdin);
	strtok(strFileName, "\n");

	ptrTempFile = (char*)calloc(strlen(strFileName)+2, sizeof(char));
	if(!ptrTempFile)
	{
		perror("Memory allocation failed:");
		return -1;
	}

	sprintf(ptrTempFile, "%s%c", strFileName, '1');

	fpin = fopen(strFileName, "r");
	if (!fpin)
	{
		perror("Input file open error");
		return -2;
	}

	fpout = fopen(ptrTempFile, "w");
	if(!fpout)
	{
		perror("Output file open error");
		return -3;
	}

	while(fgets(strLine, BUFSIZE, fpin))
	{
		iOccur += strrep(strLine, "\t", strNewStr);
		if(fputs(strLine, fpout) < 0 )
		{
			perror("File write error");
			return -4;
		}
	}

	return iOccur;
}

int strrep(char *ptrLine, char *sourStr, char *newStr)
{
	int iOccur = 0;
	char *strTemp = (char *)calloc(strlen(ptrLine) + 1, sizeof(char));
	char *ptrDummy = (char*) NULL;

	strncpy(strTemp, ptrLine, strlen(ptrLine));
	memset(ptrLine, 0, strlen(ptrLine) + 1);

	ptrDummy = strtok(strTemp, sourStr);
	if(ptrDummy == NULL)
	{
		strncpy(ptrLine, strTemp, strlen(strTemp));
	}
	else
	{
		do
		{
			iOccur++;
			!ptrLine?sprintf(ptrLine, "%s%s", newStr, ptrDummy):sprintf(ptrLine, "%s%s%s", ptrLine, newStr, ptrDummy);
		}while(ptrDummy = strtok(NULL, sourStr));
	}

	return iOccur;
}

