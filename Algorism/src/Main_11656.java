import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_11656 {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String str=input.readLine();
		String[] arr=new String[str.length()];
		
		for(int i=0;i<str.length();i++)
		{
			arr[i]= str.substring(i, str.length());
		    //System.out.println(arr[i]);
		}
		Arrays.sort(arr);
	    for(String arr1:arr)
	    {
	    	System.out.println(arr1);
	    }
		
		
			/*
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
											
	      	   if(arr[j]==arr1[count])
	      	  {
	      		for(int k=j;k<str.length();k++)
	      		{
	      			System.out.print(arr[k]);
	      			
	      		}
	      		System.out.println();
	      		
	      		
	          }
	      
				
			}
			 count++; 
			
		}
		*/
		input.close();
		// TODO Auto-generated method stub

	}
}
