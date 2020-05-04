import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_11054 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(input.readLine());
		int arr[]=new int[n+1];
		int dp[]=new int[n+1];
		int dp1[]=new int[n+1];
		dp[1]=1;
		dp1[n]=1;
		StringTokenizer st=new StringTokenizer(input.readLine());
		for(int i=1;i<=n;i++)
		{
			arr[i]=Integer.parseInt(st.nextToken());
			//output.write(String.valueOf(arr[i])+" ");
			dp[i]=1;
			dp1[i]=1;
		}
		for(int i=2;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
					if(arr[i]>arr[j]&&dp[i]<dp[j]+1)
					{
						dp[i]=dp[j]+1;
					}
			}
		}
		for(int i=n-1;i>=1;i--)
		{
			for(int j=n;j>=i;j--)
			{
					if(arr[i]>arr[j]&&dp1[i]<dp1[j]+1)
					{
						dp1[i]=dp1[j]+1;
					}
			}
		}
		/*
		output.write("\n가장 길게 증가하는 수: ");
		for(int i=1;i<=n;i++)
		{
			output.write(String.valueOf(dp[i])+" ");
		}
		output.write("\n가장 길게 감소하는 수:");
		for(int i=1;i<=n;i++)
		{
			output.write(String.valueOf(dp1[i])+" ");
		}
		output.write("\n합산");
		*/
		int max=1;
		for(int i=1;i<=n;i++)
		{
			dp[i]+=dp1[i]-1;
			if(max<dp[i])
			{
				max=dp[i];
			}
			//output.write(String.valueOf(dp[i])+" ");
		}
		
		output.write(String.valueOf(max));
	     output.close();
		// TODO Auto-generated method stub

	}

}
