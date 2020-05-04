import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_2293_solve {

	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(input.readLine());
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		int arr[]=new int[n+1]; //동전의 가치를 담아두기
		int dp[]=new int[k+1];
		for(int i=1;i<=n;i++)
			arr[i]=Integer.parseInt(input.readLine());
		dp[0]=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=arr[i];j<=k;j++)
			{
				dp[j]+=dp[j-arr[i]];
			}
		}
		System.out.println(dp[k]);
		

	}

}
