import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1965 {

	public static void main(String[] args) throws IOException {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(input.readLine());
		StringTokenizer st=new StringTokenizer(input.readLine());
		int arr[]=new int[n+1];
		int dp[]=new int[n+1];
		int max=1;
		Arrays.fill(dp, 1);
		
		for(int i=1;i<=n;i++)
		{
			arr[i]=Integer.parseInt(st.nextToken());
			max=1;
			for(int j=1;j<=i;j++)
			{
				if(arr[j]<arr[i])
				{
					if(max<=dp[j])
					{
						max=dp[j];
						dp[i]=max+1;
					}
					
				}
				/*
				if(arr[j]<arr[i]&&dp[i]<dp[j]+1)
				{
					dp[i]=dp[j]+1;
				}
			   */
			}
			System.out.print(dp[i]+" ");
		}
		//System.out.println(max);
		int Max=0;
		for(int i=1;i<=n;i++)
		{
			if(Max<dp[i])
			{
				Max=dp[i];
			}
		}
		System.out.println("\n"+Max);
		
		
		// TODO Auto-generated method stub

	}

}
