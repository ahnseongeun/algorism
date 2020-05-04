import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_practice{
	public static int Max(int n,int arr[])
	{
		int max=arr[0];
		for(int i=1;i<=n;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
	}

	public static void main(String[] args) throws IOException {
		//BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		//int n= Integer.parseInt(input.readLine()); //2
	    //String[] str= input.readLine().split(" ");
	    //int[] arr=new int[n+1];
	    int a=1000;
	    for(int i=1;i<=1000;i++)
	    {
	      System.out.print("1000"+" ");
	    }
	    /*
	    for(int i=1;i<=n;i++)
	    {
	    	arr[i]= Integer.parseInt(str[i-1]);
	    }
	    */
	    
	    
	    
	    
		
	    //	System.out.println(Max(n,arr));
	    
	    
	    
		
	}
}

