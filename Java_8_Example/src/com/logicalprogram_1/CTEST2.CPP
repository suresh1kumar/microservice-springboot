#include<conio.h>
#include<stdio.h>
#include<iostream.h>
class A
{
int x,y;
public:
A(int xx)
{
x=++xx;
}
void display()
{
cout<<--x;
}
};
void main()
{
clrscr();
A a(45);
a.display();
int *p=(int*)&a;
*p=23;
a.display();
getch();
}