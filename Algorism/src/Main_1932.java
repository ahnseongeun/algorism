import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_1932 {
		
	public static void main(String[] args) throws IOException {
		BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(input.readLine());
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		int n= Integer.parseInt(st.nextToken());
		int[][] arr=new int[n+1][n+1];
		int dp[][]=new int[n+1][n+1];
		int max=0;
		
		for (int i = 1; i <= n; i++) 
		{
			st = new StringTokenizer(input.readLine().trim());
			for (int j = 1; j <= i; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dp[1][0]=0;
		dp[1][1]=arr[1][1];
		for(int i=2;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				dp[i][j]= Math.max(dp[i - 1][j], dp[i - 1][j - 1]) + arr[i][j];
			}
		}
		max=dp[n][1];
		for(int i=2;i<dp[n].length;i++)
		{
			if(dp[n][i]>max)
				max=dp[n][i];
		}
		/*
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=2*i;j++)
			{
			
			}
			output.newLine();
		}
		*/
		output.write(String.valueOf(max));
		
		output.flush();
		output.close();
		// TODO Auto-generated method stub

	}

}
