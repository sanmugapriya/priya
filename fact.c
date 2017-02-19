#include <stdio.h>
int main() {
int n,i,fact=1;
printf("enter the factorial number");
scanf("%d",&n);
if(n<0)
printf("negative number cant find");
else
for(i=1;i<=n;i++)
{
    fact=fact*i;
}
printf("\nfactorial is %d",fact);
	return 0;
}
