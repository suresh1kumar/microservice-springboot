#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
char *str1;
char *str2;
int count=0;

printf("\nEnter First String :");
gets(str1);
printf("\nEnter Second String :");
gets(str2);

for(int s1len=0;str1[s1len]!='\0';s1len++);
for(int s2len=0;str2[s2len]!='\0';s2len++);

if(s1len<s2len)
	printf("\nstring2 is greater");
else if(s1len>s2len)
	printf("\nstring1 is greater");
else
{
	for(int i=0;i<s1len;i++)
	{
		if(str1[i]==str2[i])
		count++;
	}
	if(count==s1len)
	printf("\nBoth are same")      ;
	else
	printf("\nBoth are not same")   ;
}
getch();
}