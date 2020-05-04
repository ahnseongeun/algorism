import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_2293 {
		static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(input.readLine());
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		int arr[]=new int[n+1]; //������ ��ġ�� ��Ƶα�
		int dp[][]=new int[k+1][k+1];
		for(int i=1;i<=n;i++)
		{
			arr[i]=Integer.parseInt(input.readLine());
			dp[0][arr[i]]=1;
		}
		for(int i=1;i<=k;i++) //���⼭ ������������ �����ϸ� �ذ�Ǵµ�...
		{
			for(int j=1;j<=n;j++)
			{
				for(int t=1;t<=n;t++)
				{
					if(arr[j]>=arr[t]&&i-arr[j]>=0)
					dp[i][arr[j]]+=dp[i-arr[j]][t];
				}
			}
		}
		int sum=0;
		for(int i=1;i<=k;i++)
		{
			sum+=dp[k][i];
		}
		
		System.out.println(sum);
		// TODO Auto-generated method stub

	}

}
