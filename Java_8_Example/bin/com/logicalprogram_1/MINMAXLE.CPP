#include<conio.h>
#include<stdio.h>
void strMinMaxCount(char *,char);
void main()
{
clrscr();
char *str="nandram";
char ch;
printf("\nEnter String : ");
gets(str);

printf("\nEnter char:");
scanf("%c",&ch);
printf("\nString is : %s",str);
printf("\nCharacter is : %c",ch);
strMinMaxCount(str,ch);
getch();
}
void strMinMaxCount(char *str,char ch)
{
	int min=0,max=0,flage=0,flage2=0;
	for(int i=0;str[i]!='\0';i++)
	{
		if(str[i]==ch&& flage>=1)
		{
			flage++;
			max=i;
			flage2=0;
		}
		if(str[i]==ch && flage==0)
		{
			min=i;
			flage=1;
		}
	}
	if(flage==0)
	{
		printf("\n%c : is not a part of given string ",ch);
	}
	else if(flage2==0&&flage==1)
	{
		printf("\nMin length of %c is : %d",ch,++min);
		printf("\nMax length of %c is : %d",ch,min);

	}
	else
	{
		printf("\nMin length of %c is : %d",ch,++min);
		printf("\nMax length of %c is : %d",ch,++max);

	}
}