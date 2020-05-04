import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_2294 {

	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(input.readLine());
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		int arr[]=new int[n+1];
		int dp[]=new int[k+1];
		boolean visited[]=new boolean[k+1];
		for(int i=1;i<=n;i++)
			arr[i]=Integer.parseInt(input.readLine());
		for(int i=1;i<=k;i++)
		{
			int min=10001;
			for(int j=1;j<=n;j++)
			{
				
				if(i-arr[j]>=0&&visited[i-arr[j]]==false) 
				{
					if(min>dp[i-arr[j]])
						min=dp[i-arr[j]];
				}
			}
			if(min!=10001)
				dp[i]+=(min+1);
			else
				visited[i]=true;
			//System.out.println(i+" "+dp[i]+" "+visited[i]);
		}
		if(dp[k]==0)
			System.out.println(-1);
		else
			System.out.println(dp[k]);
		// TODO Auto-generated method stub

	}

}
