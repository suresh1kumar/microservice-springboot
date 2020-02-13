#include<conio.h>
#include<iostream.h>
#include<stdio.h>
class A
{
int x,y;
	public:
	A(int xx=10,int yy=10)
	{
		x=xx;
		y=yy;
	}
	void show()
	{
		cout<<x*y;
	}
};
class B
{
	private:
		A obja;
	public:
	B(int xx,int yy):obja(xx,yy)
	{
		obja.show();
	}
};
void main()
{
clrscr();
B b(10,20);
getch();
}