import java.util.*;
class Reverse {
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int r=0,a;
		while(num>0)
		{
		    a=num%10;
		    r=(r*10)+a;
		    num=num/10;
		}
		System.out.println(r);
	}
}
