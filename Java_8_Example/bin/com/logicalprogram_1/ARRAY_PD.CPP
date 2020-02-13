#include<stdio.h>
#include<conio.h>
void main()
{
clrscr();
int a[5];

printf("\nEnter 5 Elements:\n");
for(int i=0;i<5;i++)
scanf("%d",&a[i]);

printf("\nElements are :\n");
for(i=0;i<5;i++)
printf("%4d",a[i]);

/*int p;
printf("\nEnter Position :");
scanf("%d",&p);

for(i=p-1;i<5;i++)
{
a[i]=a[i+1];
} */
int e,flag=0;
printf("\nEnter Element :");
scanf("%d",&e);
int c=0;
for(int j=0;j<5;j++)
{
	if(e==a[i]);
	{
		flag=1;    c=j;
	}
}

if(flag==1)
printf("\nElement found at : %d pos",c);
else
printf("\nElement not found at");

printf("\nElements are :\n");
for(i=0;i<4;i++)
printf("%4d",a[i]);
getch();
}