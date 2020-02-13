#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
int i=1,j,n=5,c=1,m;
	while(i<=n)
	{
		j=1;
		c=i;
		m=n;
		 while(j<=i)
		 {
			printf("%3d",c);
			c=c+(--m);
			j++;
		 }
	printf("\n");
	i++;
	}
getch();
}