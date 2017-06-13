import java.util.*;

class hcf
{
	public static void main (String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n1=in.nextInt();
		int n2=in.nextInt();
		int gcf=GCF(n1,n2);
		System.out.println(gcf);
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
