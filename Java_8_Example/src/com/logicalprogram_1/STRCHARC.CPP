#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
int a,j=0,j1=0,j2=0,t=0;
char *str1;
char *temp1,*temp2,*temp3;
printf("\nEnter String:");
gets(str1);
for(int i=1;str1[i]!='\0';i++);
for(a=0;str1[a]!='\0';a++)
{
	if(str1[a]>='0'&&str1[a]<='9')
	{
		  temp1[j1]=str1[a];
		 j1++;
	}
	else if(str1[a]=='a'||str1[a]=='e'||str1[a]=='a'||str1[a]=='o'||str1[a]=='u')
	{
		temp2[j2]=str1[a];
		  j2++;
	}
	else
	{
		 temp3[j]=str1[a];
		 j++;
	}
}
temp1[j1]='\0';
temp2[j2]='\0';
temp3[j]='\0';
printf("\nconstants occure : %d times------------> %s",i-(j1+j2),temp3);
printf("\nNumber occure    : %d times------------> %s",j1,temp1);
printf("\nvovals occure    : %d times------------> %s",j2,temp2);

getch();
}