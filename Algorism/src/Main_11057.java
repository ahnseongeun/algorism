import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_11057 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(input.readLine());
		int dp[][]=new int[n+1][10];
		for(int i=0;i<10;i++)
			dp[0][i]=1;
		for(int i=1;i<=n;i++)
		{
			dp[i][0]=1;
			for(int j=1;j<10;j++)
			{
				dp[i][j]=(dp[i-1][j]+dp[i][j-1])%10007;
			}
		}
		output.write(String.valueOf(dp[n][9]));
		output.close();
		// TODO Auto-generated method stub
	}

}
