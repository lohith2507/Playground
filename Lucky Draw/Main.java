#include<iostream>
int main()
{
  int n,i=1,c=0;
  std::cin>>n;
  for(i=1;i<=n;i++)
  {
    if(n%i==0)
      c++;
  }
  if(c==2)
    std::cout<<"Eligible";
  else
    std::cout<<"Not eligible";
}