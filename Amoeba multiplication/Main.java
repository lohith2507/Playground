#include<iostream>
using namespace std;
int main()
{
  int n,f=0,g=1,t,x,s=0;
  std::cin>>n;
  for(int i=1;i<=n-5;i++)
  {
    t=f+g;
    f=g;
    g=t;
    x=f+g;
    s=s+x;
  }
  std::cout<<s+3;
  
}