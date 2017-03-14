import java.util.*;
class prime
{
	public static void main (String[] args) throws java.lang.Exception
	{int flag=0;
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int m=n/2;
	for(int i=2;i<=m;i++)
	{
	    if(n%2==0)
	    System.out.println("not prime");
	    flag=0;
	    break;
	    
	}
	if(flag==0)
	
	    System.out.println("number is prime");
	}
	}
