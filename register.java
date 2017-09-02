import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	  Scanner in=new Scanner(System.in);
	  int length=in.nextInt();
	  Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
	  for(int index=0;index<length;index++)
	  {
	      int n=in.nextInt();
	      if(hm.containsKey(n))
	      {
	          hm.put(n,hm.get(n)+1);
	      }
	      else
	      hm.put(n,1);
	  }
	  System.out.println(hm);
	  for(Map.Entry m:hm.entrySet())
	  {
	      int k=(int)m.getValue();
	      if(k>1)
	      System.out.print(m.getKey()+" ");
	  }
	}
}
