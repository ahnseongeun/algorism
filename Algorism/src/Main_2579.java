import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_2579 {

	public static void main(String[] args) throws IOException {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(input.readLine());
		int arr[]=new int[n+1];
		int dp[]=new int[n+1];
		dp[0]=0;
		for(int i=1;i<=n;i++)
		{
			arr[i]=Integer.parseInt(input.readLine());
		}
		
		dp[1]=arr[1];
		dp[2]=arr[2]+dp[1];
		
		for(int i=3;i<=n;i++)
		{
			if(dp[i-3]+arr[i-1]+arr[i]<dp[i-2]+arr[i])
			{
				dp[i]=dp[i-2]+arr[i];
			}
			else
			{
				dp[i]=dp[i-3]+arr[i-1]+arr[i];
						
			}
		}
		
			output.write(String.valueOf(dp[n]));
		output.close();
		
		// TODO Auto-generated method stub

	}

}
