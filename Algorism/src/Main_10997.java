import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_10997 {
	private static char[][] dp;
	private static int count=0;
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(input.readLine());
		
		dp=new char[4*n-1][4*(n-1)+1];
		
		for(int i=0;i<4*n-1;i++)
		{
			for(int j=0;j<4*(n-1)+1;j++)
			  dp[i][j]=' ';
		}
	
		
		int a= 2*n-1;
		int b= 2*(n-1);
		
		if(n==1)
		{
			System.out.println("*");
		}
		else
		{
		 int start=2;
		 int end=4*(n-1)-1;
		recur_star1(n,start,end,a,b);
		for(int i=0;i<4*n-1;i++)
		{
			for(int j=0;j<4*(n-1)+1;j++)
			{
			if(i==1)
			{
				output.write(dp[i][0]);
				break;
				
			}
			else
			{
				output.write(dp[i][j]);
				
			}
			
			}
			output.write('\n');
		
		}
		
		}
		output.flush();
		// TODO Auto-generated method stub
	}
	private static void recur_star1(int n,int s,int e,int a,int b) 
	{ //n=3ÀÌ°ם start=0.end= 9
		
	   if(n==2)
	   {
		   dp[a][b]=dp[a+1][b]='*'; 
		   dp[a-1][b]=dp[a-1][b+1]=dp[a-1][b+2]='*';
		   dp[a][b+2]=dp[a+1][b+2]=dp[a+2][b+2]='*';
		   for(int i=-2;i<3;i++)
			   dp[a+3][b+i]='*';
		   for(int i=-2;i<3;i++)
			   dp[a+i][b-2]='*';
		   for(int i=-2;i<3;i++)
			   dp[a-3][b+i]='*';
		   return;
			   
	   }
	   else
	   {
		 dp[s][e]=dp[s][e+1]='*';
		 for(int i=0;i<(4*(n-1)-1);i++)
			   dp[s+1+i][e+1]='*';
		 for(int i=4*(n-1)+count;i>=count;i--)
			   dp[s+4*(n-1)][i]='*';
		  for(int i=0;i<(4*(n-1)+1);i++)
			 dp[s-1+i][e-(4*(n-1)-1)]='*';
		 for(int i=0;i<(4*(n-1)+1);i++)
			 dp[s-2][e-(4*(n-1)-1)+i]='*';
		
	   }
	   count+=2;
	    recur_star1(n-1,s+2,e-2,a,b);
		
	}
	
}
