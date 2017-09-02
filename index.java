import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	  Scanner in=new Scanner(System.in);
	  int length=in.nextInt();
	  int arr[]=new int[length];
	  for(int index=0;index<length;index++)
	  {
	      arr[index]=in.nextInt();
	  }
	  for(int index=0;index<length;index++)
	  {
	      if(arr[index]==index)
	      {
	          System.out.print(arr[index]+" ");
	      }
	  }
	}
}
