import java.util.*;

class pal
{
	public static void main (String[] args) 
	{int r=0,rev=0;
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int temp=n;
     while(n>0)
     {
         int a=n%10;
          rev=(rev*10)+a;
         n=n/10;
         
     }
     if(temp==rev)
     System.out.println("number is palindrome");
     else
     System.out.println("number is not palindrome");
	}
}
