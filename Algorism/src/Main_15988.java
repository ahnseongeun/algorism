import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_15988 {
		static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(input.readLine());
		int dp[]=new int[1000001];
		dp[1]=1;dp[2]=2;dp[3]=4;
		for(int i=4;i<=1000000;i++)
		{
			dp[i]+=((dp[i-1]+dp[i-2])%1000000009+dp[i-3])%1000000009;
		}
		for(int i=1;i<=n;i++)
		{
			int num=Integer.parseInt(input.readLine());
			sb.append(dp[num]+"\n");
		}
		System.out.println(sb);
		
		// TODO Auto-generated method stub

	}

}
