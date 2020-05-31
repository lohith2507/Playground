#include<iostream>
using namespace std;
int main()
{
  int n,c=0;
  std::cin>>n;
  while(n!=1)
  {
    std::cout<<n<<"\n";
    if(n%2==0)
      n=n/2;
    else
      n=3*n+1;
    c++;
  }
  std::cout<<n<<"\n"<<c;
}