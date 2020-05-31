#include <iostream>
int main() 
{
  int x,re;
  std::cin>>x;
  while(x!=0)
  {
    re=re*10+x%10;
    x=x/10;
  }
  std::cout<<re;
	return 0;
}