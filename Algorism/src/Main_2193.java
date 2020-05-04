import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2193 {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int num= Integer.parseInt(input.readLine()); //2
		long[] dp=new long[num+1];
		
		for(int i=1;i<=num;i++)
		{
			if(i<3)
			{
				dp[i]=1;
			}
			else
			{
				dp[i]=dp[i-1]+dp[i-2];
			}
		}
		input.close();
		System.out.println(dp[num]);
	}
}
