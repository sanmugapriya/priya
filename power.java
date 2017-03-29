import java.util.*;
import static java.lang.Math.pow;

class power{
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the n value");
		double n=in.nextDouble();
		System.out.println("enter the power number");
		double p=in.nextDouble();
		Double powe=Math.pow(n,p);
		System.out.println(powe);
	}
}
