#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
int count=0;
char *str;
char *vl="aeiou";
printf("\nEnter String : ");
gets(str);
for(int j=0;vl[j]!='\0';j++)
{
	for(int i=0;str[i]!='\0';i++)
	{
		if(vl[j]==str[i])
		{
			count++;
			break;
		}
	}
}
printf("\nNumber of Unique Vovals are : %d",count);
getch();
}