#include<iostream>
using namespace std;
int main()
{
  int x,y,z,t,d,i;
  std::cin>>x>>y>>z;
  if( (x<y && x>z) || (x>y && x<z))
    t=x;
   else if((y<x && y>z) || (y>x && y<z))
     t=y;
  else
    t=z;
  std::cout<<"The treasure is in box which has number "<<t<<"\n";
  for (int i = 1; i <= x; ++i)
  {
        if (x% i == 0 && y % i ==0 && z%i==0) 
        {
            d = i;
        }
    }
  std::cout<<"The code to open the box is "<<d;
}