import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_2225 {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(input.readLine());
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		int dp[][]=new int[n+1][k+1];
		for(int i=1;i<=n;i++)
			dp[i][1]=1;
		for(int i=2;i<=k;i++)
			dp[1][i]=i;
		for(int i=2;i<=n;i++)
			for(int j=2;j<=k;j++)
				dp[i][j]=(dp[i][j-1]+dp[i-1][j])%1000000000;
		System.out.println(dp[n][k]);
			
		// TODO Auto-generated method stub

	}

}
