#include<iostream>
int main()
{
  int x,y,t,i=1,s=0,d;
  std::cin>>x>>y;
  t=x+y;
  for(i=1;i<(x+y);i++)
  {
    d=(x+y)%i;
    if(d==0)
      s=s+i;
    
  }
  if(t==s)
    std::cout<<"They can read the message";
  else
    std::cout<<"They can't read the message";
}