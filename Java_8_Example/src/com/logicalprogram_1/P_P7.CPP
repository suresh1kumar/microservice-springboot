#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
int i,j,n=5,t=0;
char s[5]={'a','e','i','o','u'};
for(i=1;i<=n;i++)
{
	for(j=i;j<n;j++)
	printf("  ");

	for(j=1;j<=2*i-1;j++)
	{
		if(t<=4)
		printf("%2c",s[t]);
		else
		{
		t=0 ;
		printf("%2c",s[t]);
		}
		t++;
	}
printf("\n");
}
getch();
}