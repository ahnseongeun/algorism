import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_11726 {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int num= Integer.parseInt(input.readLine()); 
		int[] dp=new int[1001];
	    dp[1]=1;
	    dp[2]=2;
		for(int i=3;i<dp.length;i++)
		{
			dp[i]=dp[i-1]+dp[i-2];
		}
		System.out.println(dp[num]%10007);
		input.close();
		
		
	}
}
