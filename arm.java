import java.util.*;

class arm
{
	public static void main (String[] args) 
	{int r=0,rev=0;
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int temp=n;
     while(n>0)
     {
         int a=n%10;
          rev=rev+a*a*a;
         n=n/10;
         
     }
     if(temp==rev)
     System.out.println("number is armstrong");
     else
     System.out.println("number is not armstrong");
	}
}
