import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_2133 {
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(input.readLine());
		int dp[]=new int[n+1];
		dp[1]=0;
		if(n>1)
		dp[2]=3;
		for(int i=3;i<=n;i++)
		{
			if(i%2!=0)
			{
				dp[i]=0;
			}
			else
			{
				
				dp[i]+=dp[i-2]*3+2;
				for(int j=i;j>4;j-=2)
				{
					dp[i]+=2*dp[j-4];	
				}
				
			}
			
		}
		
		output.write(String.valueOf(dp[n]));
		output.close();

	}

}
