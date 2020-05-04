import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_9461 {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(input.readLine());
		long dp[]=new long[101];
		dp[0]=0;
		dp[1]=1;
		dp[2]=1;
		dp[3]=1;
		for(int i=4;i<=100;i++)
			dp[i]=dp[i-2]+dp[i-3];
		for(int i=1;i<=n;i++)
		{
			int num=Integer.parseInt(input.readLine());
			output.write(String.valueOf(dp[num])+"\n");
		}
		output.close();
		
		// TODO Auto-generated method stub

	}

}
