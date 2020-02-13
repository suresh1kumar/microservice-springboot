#include<stdio.h>
#include<conio.h>
void strpolimdrom(char * str);
void strcopy(char * ,char *);
void main()
{
	clrscr();
	char *str;
	printf("\nEnter String:");
	gets(str);
	printf("String is : %s ",str);
	strpolimdrom(str);
	getch();
}

void strpolimdrom(char * str)
{
	char *temp;int count=0;
	strcopy(temp,str);

	for(int i=0;str[i]!='\0';i++)
	{
		if(str[i]==temp[i])
		{
		count++;
		}
	}
	for(int l=0;str[i]!='\0';l++);
	if(l==count)
	{
	printf("\nPolimdrom");
	}
	else
	{
	printf("\nnot polimdrom");
	}
}
void strcopy(char *temp,char *str)
{
	while(*str!='\0')
	{
		*temp=*str;
		temp++;
		str++;
	}
	*temp='\0';
}