import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_2167 {

	public static void main(String[] args) throws IOException {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		int n1=0,n2 = 0,n3=0,n4=0;
		StringTokenizer st=new StringTokenizer(input.readLine());
		int n= Integer.parseInt(st.nextToken());
		int m= Integer.parseInt(st.nextToken());
		int arr[][]=new int[n+1][m+1];
		for(int i=1;i<=n;i++)
		{
			st=new StringTokenizer(input.readLine());
			for(int j=1;j<=m;j++)
			{
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		int k=Integer.parseInt(input.readLine());
		int dp[]=new int[k+1];
		for(int i=1;i<=k;i++)
		{
			st=new StringTokenizer(input.readLine());
			for(int j=1;j<=4;j++)
			{
			   if(j==1)
			   {
				   n1=Integer.parseInt(st.nextToken());
			   }
			   else if(j==2)
			   {
				   n2=Integer.parseInt(st.nextToken());
			   }
			   else if(j==3)
			   {
				   n3=Integer.parseInt(st.nextToken());
			   }
			   else
			   {
				   n4=Integer.parseInt(st.nextToken());
			   }
			}
			int sum=0;
			for(int x=n2;x<=n4;x++)
			{
				for(int y=n1;y<=n3;y++)
				{
					sum+=arr[y][x];
				}
			}
			dp[i]=sum;
		}
		
		for(int i=1;i<dp.length;i++)
		{
			System.out.println(dp[i]);
		}
		// TODO Auto-generated method stub

	}

}
