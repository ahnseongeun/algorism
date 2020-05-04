import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_9095 {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int num= Integer.parseInt(input.readLine()); //2
		
		int[] dp=new int[11];
		dp[1]=1;
		dp[2]=2;
		dp[3]=4;
		for(int i=4;i<dp.length;i++)
		{
			dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
		}
		for(int i=0;i<num;i++)
		{
			int num1= Integer.parseInt(input.readLine()); //2	
		   System.out.println(dp[num1]);
		}
		input.close();
	}
}
