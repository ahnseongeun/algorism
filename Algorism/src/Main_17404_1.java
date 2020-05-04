import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_17404_1 {
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(input.readLine());
		int dp[][]=new int[n+1][4];
		int arr[][]=new int[n+1][4];
		for(int i=1;i<=n;i++)
		{
			StringTokenizer st=new StringTokenizer(input.readLine());
			arr[i][1]=Integer.parseInt(st.nextToken());
			arr[i][2]=Integer.parseInt(st.nextToken());
			arr[i][3]=Integer.parseInt(st.nextToken());
		}
		
		int inf=1000*n+1;
		int result=1000001;
		for(int j=1;j<=3;j++)
		{
			for(int k=1;k<=3;k++)
			{
				if(j==k) dp[1][k]=arr[1][k]; //선택적 초기값 설정
				else dp[1][k]=inf;
			}
			
				for(int i=2;i<=n;i++)
				{
					dp[i][1]+=Math.min(dp[i-1][2], dp[i-1][3])+arr[i][1];
					dp[i][2]+=Math.min(dp[i-1][1], dp[i-1][3])+arr[i][2];
					dp[i][3]+=Math.min(dp[i-1][1], dp[i-1][2])+arr[i][3];
				}
				
			for(int k=1;k<=3;k++)
			{
				if(j==k) continue;
				result=Math.min(result,dp[n][k]);
			}
		}
		
		System.out.println(result);
		
		
	}
	

		// TODO Auto-generated method stub

	

}
