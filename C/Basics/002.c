#include<stdio.h>

int main()
{
	int a,b,c,d;

	a = 5;
	b = 3;

	printf("\n %d + %d = %d \n",a,b,a+b);
	printf("\n %d - %d = %d \n",a,b,a-b);
	printf("\n %d * %d = %d \n",a,b,a*b);
	printf("\n %d / %d = %f \n",a,b,(float)a/b);
	printf("\n %d \% % %d = %d \n",a,b,a%b);


	a = 5;
	c = a++;
	d = ++a;

	printf("\n\n\n%d \n %d\n\n %d \n %d",a++,c,--d,a);


/*	a1=a;
	b1=b;

	printf("\n %d++ = %d \t ++%d = %d",a1,a++,b1,++b);
	printf("\n %d-- = %d \t --%d = %d",a1,a--,b1,--b);

	*/


	return 0;
}

