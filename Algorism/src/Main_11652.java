import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class node_30 implements Comparable<node_30>{
	int i;
	BigInteger a;
	node_30(int i,BigInteger a)
	{
		this.i=i;
		this.a=a;
	}
	@Override
	public int compareTo(node_30 o) {
		return o.i-this.i;
		// TODO Auto-generated method stub
	}
}
public class Main_11652 {
	

	public static void main(String[] args) throws Exception, IOException {
		 BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
	     int n=Integer.parseInt(input.readLine());
	     ArrayList<BigInteger> list=new ArrayList<BigInteger>();
	     ArrayList<node_30> count=new ArrayList<node_30>();
	    // BigInteger arr[]=new BigInteger[n+1];
	     for(int i=1;i<=n;i++)
	     {
	    	 list.add(new BigInteger(input.readLine()));
	    	// arr[i]= new BigInteger(input.readLine());
	     }
	     int count1=1;
	     
	     Collections.sort(list);
	   
	     for(int i=1;i<n;i++)
	     {
		         if(list.get(i-1).equals(list.get(i))) 
		    	{
		    		count1++;
		    		//System.out.println(count1);
		    		if(i==n-1)
			        {
			        	node_30 node=new node_30(count1,list.get(i-1));
			        	count.add(node);
			        	//System.out.println("i"+node.a);
			        }
		    	}
		    	else
		    	{
		    		node_30 node=new node_30(count1,list.get(i-1));
		    		//System.out.println("i"+node.a);
		    		count.add(node);
		    		count1=1;
		    	}
		        
	     }
	     if(n==1)
	    	 System.out.println(list.get(0));
	     else {
	     Collections.sort(count);
	     System.out.println(count.get(0).a);
	     }
	     //System.out.println(String.valueOf(count.get(3).a));

		// TODO Auto-generated method stub

	}

}
