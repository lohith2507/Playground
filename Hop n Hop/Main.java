#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int x,y,p,q,s;
  std::cin>>x>>y;
  p=(x-3)*(x-3);
  q=(y-4)*(y-4);
  s=p+q;
  std::cout<<int(sqrt(s));
}