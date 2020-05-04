import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_2156 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(input.readLine());
		int arr[]=new int[n+1];
		int dp[]=new int[n+1];
		for(int i=1;i<=n;i++)
		{
			arr[i]=Integer.parseInt(input.readLine());
		}
		arr[0]=0;
		dp[0]=0;
		dp[1]=arr[1];
		if(n>1)
		{
		dp[2]=arr[1]+arr[2];
		int max=dp[2];
		for(int i=3;i<=n;i++)
		{
			if(Math.max(dp[i-2]+arr[i], dp[i-3]+arr[i-1]+arr[i])>=dp[i-1])
				dp[i]=Math.max(dp[i-2]+arr[i], dp[i-3]+arr[i-1]+arr[i]);
			else
				dp[i]=dp[i-1];
			if(dp[i]>max)
				max=dp[i];
		}
		output.write(String.valueOf(max));
		}
		else
		output.write(String.valueOf(dp[1]));
		output.close();
	
		// TODO Auto-generated method stub

	}

}
