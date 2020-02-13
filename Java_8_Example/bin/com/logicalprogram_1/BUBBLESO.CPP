#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
int a[5];
int i,j,t;
printf("\nEnter Array:\n");
for(i=0;i<5;i++)
{
scanf("\n%d",&a[i]);
}
for(i=0;i<5;i++)
{
	for(j=i+1;j<5;j++)
	{
		if(a[i]>a[j])
		{
			t=a[j];
			a[j]=a[i];
			a[i]=t;
		}
	}
}
for(i=0;i<5;i++)
{
printf("\n%d",a[i]);
}
getch();
}