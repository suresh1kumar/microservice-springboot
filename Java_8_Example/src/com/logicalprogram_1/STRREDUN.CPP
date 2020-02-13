#include<conio.h>
#include<stdio.h>
void strremoveredundency(char *str);
void main()
{
clrscr();

char *str;
printf("\nEnter Strin : ");
gets(str);
printf("String is : %s",str);
strremoveredundency(str);
getch();
}
void strremoveredundency(char *str)
{
	char *temp;

	for(int i=0,j=1,k=0;str[i]!='\0';i++)
	{
		if(str[i]==str[j])
		{
			j++;
			continue;
		}
		else
		{
			temp[k]=str[i];
			j++;
			k++;
		}
	}
	temp[j]='\0';
	printf("\nString without Redundency is : %s",temp);
}