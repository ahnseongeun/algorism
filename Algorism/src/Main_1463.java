import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1463 {
	 static int min(int a,int b) {
		if(a>b)
		{
			return b;
		}
		else
			return a;
		 // TODO Auto-generated method stub
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(input.readLine());
		int[] dp=new int[1000001];
		dp[1]=0;
		for(int i=2;i<dp.length;i++)
		{
			dp[i]= dp[i-1]+1;
			if(i%3==0) 
				dp[i]= min(dp[i/3]+1,dp[i]);
			if(i%2==0) 
				dp[i]= min(dp[i/2]+1,dp[i]);
		}
		
	System.out.println(dp[num]);
	}

	
}
