#include <stdio.h>

int main(int argc, char const *argv[])
{
	int *p;
	int *q;

	int a = 5;

	p = &a;

	q = p;

	printf("before q: %p\n",q);

	p = NULL;

	printf("before p: %p\n",q);

	return 0;
}