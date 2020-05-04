import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_11058 {
		static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(input.readLine());
		long dp[]=new long[101];
		dp[1]=1;dp[2]=2;dp[3]=3;dp[4]=4;dp[5]=5;dp[6]=6;
		for(int i=7;i<=100;i++)
		{
			dp[i]=dp[i-1]-1;
			for(int j=1;j<i-3;j++)
			{
				if(dp[i-(j+2)]*(j+1)>dp[i])
					dp[i]=dp[i-(j+2)]*(j+1);
			}
		}
		System.out.println(dp[n]);
		// TODO Auto-generated method stub

	}

}
