#include<iostream>

using namespace std;

int main()
{
	int a,b,c,d;

	a = 5;
	b = 3;

	cout<<"\n"<<a<<" + "<<b<<" = "<<a+b;
	cout<<"\n"<<a<<" - "<<b<<" = "<<a-b;
	cout<<"\n"<<a<<" * "<<b<<" = "<<a*b;
	cout<<"\n"<<a<<" / "<<b<<" = "<<(float)a/b;
	cout<<"\n"<<a<<" % "<<b<<" = "<<a%b;

	a =  5;
	c = a++;
	d = ++a;

	cout<<"\n\n "<<a<<"\n "<<c<<"\n "<<d<<"\n "<<a--<<"\n "<<++a<<"\n "<<--a;

	return 0;
}
