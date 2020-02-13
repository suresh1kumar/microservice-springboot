#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
char *mstr;
char *sstr;
int count=0,j=0,f=0;
printf("\nEnter Main string :");
gets(mstr) ;
printf("\nEnter sub string :");
gets(sstr) ;

for(int sl=0;sstr[sl]!='\0';sl++);

for(int i=0;mstr[i]!='\0';i++)
{

		while(mstr[i]==sstr[j])
		{
			count++;
			j++;
		}
}
if(count==sl)
printf("\nstring is found");
else
printf("\nstring is not found");
getch();
}