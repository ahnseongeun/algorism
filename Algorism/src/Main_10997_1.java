import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_10997_1 {
	private static char[][] dp;
	private static int count=0;
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(input.readLine());
		//int count1=2*(n-2);
		if(n==1)
		{
			
		}
		else
		{
		dp=new char[8*n-3][4*n-3];
		for(int i=0;i<8*n-3;i++)
		{
			if(i==1)
			{
				dp[i][0]=' ';
			}
			else
			{
			for(int j=0;j<4*n-3;j++)
			  dp[i][j]=' ';
			}
		}
		}
		int a= 4*n-2;
		int b= 2*(n-1);
		
		if(n==1)
		{
			System.out.println("*");
		}
		else
		{
		 int start=4;
		 int end=4*(n-1)-1;
		recur_star1(n,start,end,a,b);
		for(int i=0;i<8*n-3;i++)
		{
			output.write(dp[i]);
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
		   dp[a][b]=dp[a+2][b]='*'; 
		   dp[a-2][b]=dp[a-2][b+1]=dp[a-2][b+2]='*';
		   dp[a][b+2]=dp[a+2][b+2]=dp[a+4][b+2]='*';
		   for(int i=-2;i<3;i++)
			   dp[a+6][b+i]='*';
		   for(int i=-4;i<6;i+=2)
			   dp[a+i][b-2]='*';
		   for(int i=-2;i<3;i++)
			   dp[a-6][b+i]='*';
		   return;
			   
	   }
	   else
	   {
		 dp[s][e]=dp[s][e+1]='*';
		 for(int i=0;i<2*(4*(n-1)-1);i+=2)
			   dp[s+2+i][e+1]='*';
		 for(int i=4*(n-1)+count;i>=count;i--)
			 dp[s+8*(n-1)][i]='*';
		 for(int i=0;i<2*(4*(n-1)+1);i+=2)
			 dp[s-2+i][e-(4*(n-1)-1)]='*';
		 for(int i=0;i<(4*(n-1)+1);i++)
			 dp[s-4][e-(4*(n-1)-1)+i]='*';
	   }
	   count+=2;
	    recur_star1(n-1,s+4,e-2,a,b);
		
	}
	
}
