#include<conio.h>
#include<stdio.h>
void removeDuplicate(char *str);
void main()
{
clrscr();
char *str;
printf("Enter String:");
gets(str);
removeDuplicate(str);
printf("\n string is : %s",str);
getch();
}
void removeDuplicate(char *str)//remove duplicate characters from a string,so that each character in a string is not repeating
{
    int count,flag,t=0;
	char ch;

	for(int i=0;str[i]!='\0';i++)
	{
		//count=0;
		//flag=0;
		for(int j=i+1;str[j]!='\0';j++)
		{
			for(int k=0;ch[k]==str[i];k++)
			{
				flag=1;
			}
			if(str[i]==str[j]&&flag!=1)
			{
			//count++;
			//flag=1;
			}
		}
		ch[i]=str[i];
		//if(flag==1&&count>=0)
		{
		 //	printf("\n %c : is occured %d times ",str[i],count);
		}

	}


}