#include<iostream>
using namespace std;
int main()

{

float x1,x2,x3,y1,y2,y3,x,y;

std::cin>>x1;

std::cin>>y1;

std::cin>>x2;

std::cin>>y2;

std::cin>>x3;

std::cin>>y3;

x=(x1 + x2 + x3)/3;

y=(y1 + y2 + y3)/3;

std::cout<<x<<"\n"<< y;

return 0;

}