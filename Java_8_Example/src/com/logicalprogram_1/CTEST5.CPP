#include<conio.h>
#include<iostream.h>
#include<stdio.h>
#include<string.h>
class A
{
char s[50];
char t[50];
public:
	A(char *s1)
	{
		strcpy(s,s1);
	}

	int afun()
	{
		int i=0,j=0;
		while(*(s+i))
		{
			if(*(s+i++)==' ')
			*(t+j++)=*(s+i);
		}
	*(t+j)=0;
	return strlen(t);
	}

};
void main()
{
clrscr();
char txt[]="welcome to sathyatech.com";
A a(txt);
cout<<a.afun();
getch();
}