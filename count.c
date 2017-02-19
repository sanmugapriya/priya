#include <stdio.h>

int main() {
    int count=0,a;
    
    printf("enter the integer");
    scanf("%d",&a);
    while(a!=0)
    {
        a/=10;
        count++;
    }
    printf("\nno of digit is%d",count);
    return 0;
}
