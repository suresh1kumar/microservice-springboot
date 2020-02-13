#include<conio.h>
#include<stdio.h>
void strsort(char *str);
void stroccurence(char *str);
void main()
{
clrscr();
char *str;
printf("\nEnter String :");
gets(str);
strsort(str);
stroccurence(str);
getch();
}
void strsort(char *str)
{
char c;
	for(int i=0;str[i]!='\0';i++)
	{
		for(int j=0;str[j]!='\0';j++)
		{
			if(str[i]<str[j])
			{
				c=str[i];
				str[i]=str[j];
				str[j]=c;
			}
		}
	}
printf("sort string is :%s",str);
}
void stroccurence(char *str)
{
	char c;
	int count=0;
		for(int i=0;str[i]!='\0';i++)
		{
			if(str[i]==str[i+1]&&str[i]!=c)
				continue;
			str[j]=str[i];
				j++;
		}
		if(count>0)
		printf("\n%c occur %d times",str[i],count);
		c=str[i];
		count=0;
	}
}