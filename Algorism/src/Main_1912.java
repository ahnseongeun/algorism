import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1912 {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int num= Integer.parseInt(input.readLine()); //2
		String[] str=  input.readLine().split(" ");
		int[] arr=new int[num+1];
		long[] dp=new long[100001];
		
		for(int i=1;i<=num;i++)
		{
			arr[i]=Integer.parseInt(str[i-1]);
		}
		
		long sum=0;
		int count=1;
	    for(int i=1;i<=num;i++)
	    {
		   if(arr[i]>0)
		   {
			   sum+=arr[i];
			   dp[count]=sum;
			   count++;
		   }
		   else
		   {
			   sum+=arr[i];
			   if(sum>=0)
			   {
				   dp[count]=sum;
				   count++;
			   }
			   else
			   {
				   sum=0;
				   dp[count]=arr[i];
		    		//System.out.println(count+": "+dp[count]);
		    		++count;
			   }
				
		   }
	    }
	    
	    long max=dp[1];
	    //System.out.print(dp[1]+" ");
	    for(int i=2;i<count;i++)
		{
			//System.out.print(dp[i]+"  ");
			if(max<dp[i]&&dp[i]!=0)
				max=dp[i];
			if((arr[i-1]==0)&&max<0)
			{
				max=0;
			}
				
		}
		System.out.println(max);
	    
	    
	}
}
