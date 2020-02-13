#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
int a,j=0,j1=0,j2=0;
char *str1;
printf("\nEnter String:");
gets(str1);

for(a=0;str1[a]!='\0';a++)
{
	if(str1[a]=='a'||str1[a]=='e'||str1[a]=='a'||str1[a]=='o'||str1[a]=='u')
	{
		  j2++;
	}

	else if((str1[a]>='a'&&str1[a]>='z')||(str1[a]>='A'&&str1[a]>='Z'))
	{
		j++;
	}

	else if(str1[a]>='0'&&str1[a]<='9')
	{
		 j1++;
	}
}
printf("\n Constants occure : %d times",j);
printf("\nNumber occure: %d times",j1);
printf("\nVovals occure : %d times",j2);
getch();
}