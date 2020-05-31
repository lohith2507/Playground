
#include <iostream>

using namespace std;

int main()

{
  int i=0,n=1,a[3];
  float score;
  while(i<3)
  {
    std::cin>>n;
    if(n<0)
    {
      score -= 1;
      break;
    }
    else if(n%2 == 0)
      score -= 0.5;
    else
    {
      n=a[i];
      score += 1;
        i++;
    }

   }
  std::cout<<score;
  return 0;

}
