#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
char *mainstr;
char *substr;
int flage=0,j=0,pos=0;
printf("\nEnter Main String :");
gets(mainstr);

printf("\nEnter Sub String :");
gets(substr);
for(int sublen=0;substr[sublen]!='\0';sublen++);
for(int i=0;mainstr[i]!='\0';i++)
{
	if(substr[j]==mainstr[i])
	{
		pos=i+1;
		flage++;
		j++;
	}
}
if(flage==sublen)
{
printf("\nString is found at %d to %d position",pos-sublen,pos);
}
else
{
printf("\nString is Not found");
}
getch();
}