#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
int count=0;
char *str;
printf("\nEnter String : ");
gets(str);
char c;
for(int i=0;str[i]!='\0';i++)
{
	for(int j=0;str[j]!='\0';j++)
	{
		if(str[i]==str[j]&&c!=str[i])
		{
			count++;
			break;
		}
	}
	c=str[i];
}
printf("\nNumber of Unique constant are : %d",count);
getch();
}