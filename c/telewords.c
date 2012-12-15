#include <stdio.h>
#include <string.h>

int main(void)
{
	char teleno[20] = {0};
	char teleword[20][5] = {{0}};
	char wordlength[20] = {0};
	int i = 0, j = 0;

	printf("Enter the telephone number: ");
	scanf("%s", teleno);

	for (i = 0; i < strlen(teleno); i++)
	{
		switch(teleno[i] - 48)
		{
			case 0:
				strcpy(teleword[i], " ");
				break;
			case 1:
				strcpy(teleword[i], ".,'");
				break;
			case 2:
				strcpy(teleword[i], "abc");
				break;
			case 3:
				strcpy(teleword[i], "def");
				break;
			case 4:
				strcpy(teleword[i], "ghi");
				break;
			case 5:
				strcpy(teleword[i], "jkl");
				break;
			case 6:
				strcpy(teleword[i], "mno");
				break;
			case 7:
				strcpy(teleword[i], "pqrs");
				break;
			case 8:
				strcpy(teleword[i], "tuv");
				break;
			case 9:
				strcpy(teleword[i], "wxyz");
				break;
			default:
				printf("%d is not a number\n", teleno[i] - 48);
				exit(0);
		}
	}

	printf("The telephone number is %s\n", teleno);
	printf("The length is %d\n", strlen(teleno));

	for(j = 0; j < 4; i++)
	{
		for(i = 0; i < strlen(teleno); i++)
		{
			printf("%d\t%d\t%c\n", i, j, teleword[i][j]);
		}
//		printf("\n");
	}
}
