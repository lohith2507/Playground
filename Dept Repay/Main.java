#include<iostream>
using namespace std;
int main()
{
  int x,y,z,t,u;
  std::cin>>x>>y>>z;
  t=(x*y*z)/100;
  u=x+t;
  std::cout<<float((x*y*z)/100)<<"\n";
  std::cout<<float((x+t))<<"\n";
  std::cout<<float((t*0.02))<<"\n";
  std::cout<<float((u-t*0.02));
}