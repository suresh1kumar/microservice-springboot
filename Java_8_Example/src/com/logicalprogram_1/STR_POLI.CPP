#include<conio.h>
#include<stdio.h>
void strpolim(char *);
void strcopy(char *,char *)  ;
void strreverce(char *);
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
int flage=0;
	strcopy(temp,str);
	strreverce(temp);
	for(int i=0;str[i]!='\0';i++)
	{
		if(str[i]!=temp[i])
		flage=1;
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
    temp++;
    str++;
  }
  *temp='\0';
}
void strreverce(char *temp)
{
  int l;
  char c;
  for(l=0;temp[l]!='\0';l++);
  for(int i=0;i<l/2;i++)
  {
     c=temp[i];
     temp[i]=temp[l-i-1];
     temp[l-i-1]=c;
  }
}
