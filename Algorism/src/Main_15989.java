import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_15989 {
		static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(input.readLine());
		int dp[][]=new int[10001][4];
		dp[1][1]=1;
		dp[2][1]=1;dp[2][2]=1;
		dp[3][1]=1;dp[3][2]=1;dp[3][3]=1;
		for(int i=4;i<=10000;i++)
		{
			dp[i][1]+=dp[i-1][1];
			dp[i][2]+=dp[i-2][1]+dp[i-2][2];
			dp[i][3]+=dp[i-3][1]+dp[i-3][2]+dp[i-3][3];
		}
		for(int i=1;i<=n;i++)
		{
			int num=Integer.parseInt(input.readLine());
			sb.append(dp[num][1]+dp[num][2]+dp[num][3]+"\n");
		}
		System.out.println(sb);
		

	}

}
