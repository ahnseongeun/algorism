import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;


public class Main_1158 {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String str= input.readLine();
		 int n= Integer.parseInt(str.split(" ")[0]);
		 int k= Integer.parseInt(str.split(" ")[1]);
		 
		 LinkedList<Integer> list=new LinkedList<Integer>();
		 ArrayList<Integer> arr = new ArrayList<Integer>();
		 String a=", ";
		 Integer[] arr1=new Integer[n];
		 for(int i=0;i<n;i++)
		 {
			 list.add(i+1);
			 
		 }
		 int tmp=0;
		  while(!list.isEmpty()) {  //이거 중요함.
	            tmp = (tmp+k-1)%list.size();
	            arr.add(list.remove(tmp));
	        }
		  System.out.print("<");
		  for(int i=0;i<n;i++)
		  {
			  if(i!=n-1)
			  System.out.print(arr.get(i)+a);
			  else
				  System.out.print(arr.get(i));
		  }
		  System.out.println(">");
		  
		
		/*
		 //System.out.println(list);
		 int count=2;
		 for(int j=0;j<n;j++)
		 {
			 //System.out.println(count);
			 if(count<7)
			 {
				 //System.out.println(list.remove(count));
				 //System.out.println(list);
				// System.out.println(            count);
				 
				 
				 System.out.print( list.remove(count));
				 //list.remove(count);
				 count=count+k-1;
				
			 }
			 else
			 {
				 
				 count=count%7;
				// System.out.println(list);
				 //arr[j]=list.get(count);
				System.out.print( list.remove(count));
				 //list.remove(count);
				
				 count=count+k-1;
				
				
			 }
		
		 }
		 
		 for(int i=0;i<n;i++)
		 {
			 System.out.print(arr[i]);
		 }
		 
		*/
		 
		 
		 
		
		input.close();
		// TODO Auto-generated method stub

	}

}
