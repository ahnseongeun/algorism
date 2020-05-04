import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11048 {
	static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(input.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		int arr[][]=new int[n+1][m+1];
		int dp[][]=new int[n+1][m+1];
		for(int i=1;i<=n;i++)
		{
			st=new StringTokenizer(input.readLine());
			for(int j=1;j<=m;j++)
			{
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		dp[1][1]=arr[1][1];
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				int a=0; int b=0; int c=0;
				a=dp[i][j-1]+arr[i][j];
				b=dp[i-1][j]+arr[i][j];
				c=dp[i-1][j-1]+arr[i][j];
				dp[i][j]=Math.max(Math.max(a, b), c);
			}
		}
		System.out.println(dp[n][m]);
		// TODO Auto-generated method stub

	}

}
