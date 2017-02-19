#include <stdio.h>

int main() {
int a,b,c;
printf("enter a b c value");
scanf("%d%d%d",&a,&b,&c);
if(a>b&&a>c)
printf("\n%d is largest number",a);
if(b>a&&b>c)
printf("\n%d is largest number",b);
if(c>a&&c>b)
printf("\n%dis largest number",c);
	return 0;
}
