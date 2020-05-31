#include<iostream>
int main()
{
  long int x,c=0;
  std::cin>>x;
  do
  {
    c=c+1;
    x=x/10;
  }while(x!=0);
  std::cout<<c;
    
}