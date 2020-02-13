#include<conio.h>
#include<string.h>
#include<stdio.h>
void strcopy(char *,char *)  ;
void main()
{
clrscr();
char *str1;
printf("\nEnter String : ");
gets(str1);
char *str2;
printf("\nEnter String : ");
gets(str2);
strcopy(str1,str2);
printf("\nstr1+str2 = ");
puts(str1);
getch();
}
void strcopy(char *dest,char *src)
{
int l=strlen(dest);
dest=dest+l;
  while(*src!='\0')
  {
  *dest=*src;
  dest++;
  src++;
  }
  *dest='\0';
}
