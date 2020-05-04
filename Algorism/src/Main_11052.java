import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_11052 {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int num= Integer.parseInt(input.readLine()); //2
		String str=input.readLine();
		int[] dp=new int[1001];
		int[] p=new int[num+1];
		int count=1;
		for(int i=0;i<1001;i++)
		{
			dp[i]=0;
		
		}
		for(int i=0;i<num;i++)
		{
		    p[i]=Integer.parseInt(str.split(" ")[i]);		
		}
		
		
		
		
		dp[0]=p[0];
		dp[1]=Math.max((2*p[0]),p[1]);
		for(int j=2;j<num;j++)
		{
			dp[j]=(j+1)*p[0];
			for(int k=0;k<j;k++)
			{
				if(j-count!=0)
				{
					int a=dp[(j-count-1)]+p[count];
					dp[j]=Math.max(dp[j],a);
					count++;
				}
				else
				{
					
					dp[j]=Math.max(dp[j],p[count]);
					count=1;
					break;
				}
				
			}
			
		}
		
		System.out.println(dp[num-1]);
		
		
	}
}
