import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10844 {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(input.readLine()); //2
	   int[][] dp=new int[101][10];
	   	long sum=0;
	   for(int i=1;i<=9;i++)
	   {
		   
		   dp[1][i]=1;
	   }
	   
	   for(int i=2;i<=n;i++)
	   {
		   for(int j=1;j<=9;j++)
		   {
			   if(j==1)
			   {
                   
				  if(i==2)
                  {
				   dp[2][1]=2;
                  }
                   else
                   {
                    dp[i][j]=(dp[i-2][j]+dp[i-1][j+1])%1000000000;
                   }
			   }
			   else if(j==9)
			   {
				   dp[i][j]=dp[i-1][j-1]%1000000000;
				   
			   }
			   else
			   {
				   dp[i][j]=(dp[i-1][j-1]+dp[i-1][j+1])%1000000000;
			   }
		   }
	   }
	
		for(int i=1;i<=9;i++)
		{
			sum+=dp[n][i];
		}
		/*
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=9;j++)
			{
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}
		*/
		sum=sum%1000000000;
		System.out.println(sum);
	}
}
