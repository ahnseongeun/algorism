import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_11722 {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(input.readLine());
		int arr[]=new int[n+1];
		int dp[]=new int[n+1];
		StringTokenizer st=new StringTokenizer(input.readLine());
		for(int i=1;i<=n;i++)
		{
			arr[i]=Integer.parseInt(st.nextToken());
			dp[i]=1;
		}
		
		//2중포문사용하면 금방푼다.
		int max=1;
		for(int i=n-1;i>=1;i--)
		{
			for(int j=n;j>i;j--)
			{
				if(arr[i]>arr[j]&&dp[i]<dp[j]+1)
					dp[i]=dp[j]+1;
			}
			if(dp[i]>=max)
				max=dp[i];
		}
		output.write(String.valueOf(max));
		output.close();
		
			
		// TODO Auto-generated method stub
/*
 10
14 566 32 1 6 34 2 9 13 2
4 5 4 1 3 3 1 2 2 1 
 */
	}

}
