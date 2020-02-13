#include<stdio.h>
#include<conio.h>
void arraysort(int a[],int size);
void main()
{
clrscr();
int a[5];
printf("\nEnter 5 Elements:\n");
for(int i=0;i<5;i++)
scanf("%d",&a[i]);
arraysort(a,5);
getch();
}
void arraysort(int a[],int size)
{
int t;
	for(int i=0;i<size;i++)
	{
		for(int j=0;j<=5;j++)
		{
			if(a[i]<a[j])
			{
				t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
	}

printf("\nElements are :\n");
for(i=0;i<5;i++)
printf("%4d",a[i]);
}