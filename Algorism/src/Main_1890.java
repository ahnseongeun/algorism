import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1890 {
		static StringBuffer sb=new StringBuffer();
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(input.readLine());
		int arr[][]=new int[n][n];
		int dp[][]=new int[n][n];
		StringTokenizer st;
		for(int i=0;i<n;i++)
		{
			st=new StringTokenizer(input.readLine());
			for(int j=0;j<n;j++)
			{
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<n;j++)
			{
				if(i==n-1&&j==n-1)
					continue;
				
				if(i==0&&j==0) 
				{
					int num=arr[i][j];
					if(num+i<n)
						dp[i+num][j]++;
					if(num+j<n)
						dp[i][j+num]++;
				}else {
					int num=arr[i][j];
					if(num+i<n)
						dp[i+num][j]+=dp[i][j];
					if(num+j<n)
						dp[i][j+num]+=dp[i][j];
				}
			}
		}
		/*
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<n;j++)
			{
				sb.append(dp[i][j]);
			}
			sb.append("\n");
		}
		System.out.println(sb);
		*/
		System.out.println(dp[n-1][n-1]);
		// TODO Auto-generated method stub

	}

}
