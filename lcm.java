import java.util.*;

class lcm
{
	public static void main (String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n1=in.nextInt();
		int n2=in.nextInt();
		int lcm=LCM(n1,n2);
		System.out.println(lcm);
	}
	public static int LCM(int a,int b)
	{
	    return a*b/GCF(a,b);
	}
		public static int GCF(int a,int b)
		{
		    if(b==0)
		    {
		    return a;
		    }
		    else
		    {
		        return(GCF(b,a%b));
		    }
		}
	
		
	
}
