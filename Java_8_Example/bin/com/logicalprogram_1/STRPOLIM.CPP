#include<conio.h>
#include<stdio.h>
void strpolim(char *str);
void strcopy(char *,char *);
void strreverce(char *str);
void main()
{
clrscr();
char *str;
printf("\nEnter String : ");
gets(str);
strpolim(str);
getch();
}
void strpolim(char *str)
{
char *temp;
strcopy(temp,str);
strreverce(temp);
int flage=0,i=0;
	while(str[i]!='\0')
	{
		if(str[i]!=temp[i])
		{
			flage=1;
			break;
		}
		i++;
	}

	if(flage==0)
		printf("\nString is polimdrom");
	else
	     printf("\nString is not polimdrom");
}
void strcopy(char *temp,char *str)
{
	while(*str!='\0')
	{
		*temp=*str;
		str++;
		temp++;
	}
	*temp='\0';
}
void strreverce(char *temp)
{
	char ch;
	for(int l=0;temp[l]!='\0';l++);
	for(int j=0;j<l/2;j++)
	{
		ch=temp[j];
		temp[j]=temp[l-j-1];
		temp[l-j-1]=ch;
	}
}