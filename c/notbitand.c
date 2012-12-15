#include <stdio.h>

int main(void)
{
	int i = 123;
	printf("%d\n", i);
	printf("%d\n", i&1);
	printf("%d\n", ~(i));
	printf("%d\n", !(i&1));
	getchar();
	return 0;
}
