import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_9465 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(input.readLine());
		int arr[][]=new int[2][100001];
		int dp[][]=new int[2][100001];
		
		for(int k=0;k<n;k++)
		{
			int num=Integer.parseInt(input.readLine());
			for(int i=0;i<2;i++)
			{
				StringTokenizer st=new StringTokenizer(input.readLine());
				for(int j=1;j<=num;j++)
				{	
					arr[i][j]=Integer.parseInt(st.nextToken());
					
				}
			}
		dp[0][0]=dp[1][0]=0;
		dp[0][1]=arr[0][1];
		dp[1][1]=arr[1][1];
		for(int i=2;i<=num;i++)
		{
			dp[0][i]=Math.max(dp[1][i-1],dp[1][i-2])+arr[0][i];
			dp[1][i]=Math.max(dp[0][i-1],dp[0][i-2])+arr[1][i];
			//output.write(String.valueOf(dp[0][i])+" "+String.valueOf(dp[1][i])+"\n");
		}
		output.write(String.valueOf(Math.max(dp[0][num],dp[1][num])+"\n"));
		//output.write(dp[0][1]+" "+dp[1][num]+"\n");
		}
		output.close();
			// TODO Auto-generated method stub

	}

}
