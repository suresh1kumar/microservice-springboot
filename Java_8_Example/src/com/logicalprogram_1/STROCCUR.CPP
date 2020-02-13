#include<conio.h>
#include<stdio.h>
void stroccurance(char *);
void strupper(char *);
void strsort(char *);
void main()
{
clrscr();
char *str;
printf("\nEnter String : ");
gets(str);
puts(str);
stroccurance(str);
getch();
}
void stroccurance(char *str)
{
	strupper(str);
	puts(str);
	strsort(str);
	puts(str);

	int count,flag;
	char ch;
	for(int i=0;str[i]!='\0';i++)
	{
		count=0;
		flag=0;
		for(int j=0;str[j]!='\0';j++)
		{
		     if(str[i]==str[j]&&ch!=str[i])
		     {
			count++;
			flag=1;
		     }
		}
		if(flag==1&&count>=0)
		{
			printf("\n %c : is occured %d times ",str[i],count);
		}
		ch=str[i];
	}

}
void strupper(char *str)
{
	for(int i=0;str[i]!='\0';i++)
	{
		if(str[i]>='a'&&str[i]<='z')
		{
			str[i]-=32;
		}
	}
}
void strsort(char *str)
{
char ch;
	for(int i=0;str[i]!='\0';i++)
	{
		for(int j=0;str[j]!='\0';j++)
		{
		     if(str[i]<str[j])
		     {
			ch=str[i];
			str[i]=str[j];
			str[j]=ch;
		     }
		}

	}
}