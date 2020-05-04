import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Binary_sort{
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(input.readLine()); //2
	    String[] str= input.readLine().split(" ");
	    int[] arr=new int[n+1];
	    for(int i=1;i<=n;i++)
	    {
	    	arr[i]= Integer.parseInt(str[i-1]);
	    }
		
	    for(int i=2;i<=n;i++)
	    {
	    	int key= arr[i]; int high=i; int low=1;
	    	while(low<high)
	    	{
	    		int mid=(low+high)/2;
	    		if(key>=arr[mid])
	    		{
	    			low=mid+1;
	    		}
	    		else 
	    		{
	    			high=mid;
	    		}
	    	}
	    	for(int j=i;j>low;j--)
	    	{
	    		int temp=arr[j];
	    		arr[j]=arr[j-1];
	    		arr[j-1]= temp;
	    	}
	    }
	    	for(int k=1;k<=n;k++)
	    	{
	    		System.out.print(arr[k]+"   ");
	    	}
	    
	    
	    
		
		
		
	}
}
