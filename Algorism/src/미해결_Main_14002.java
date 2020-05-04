import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
O(NlogN)에 LIS의 최대 길이를 구하는 알고리즘을 통해서는 정확한 LIS 배열을 구할 수 없다는 것을 처음 알았습니다. -> 최장 길이는 알수 있다.
*/
public class 미해결_Main_14002 {
	 	static int best=0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int n=Integer.parseInt(input.readLine());
		int arr[]=new int[n+1];
		int dp[]=new int[n+1];
		int instance[]=new int[n+1]; //임시 배열
		StringTokenizer st=new StringTokenizer(input.readLine());
		for(int i=1;i<=n;i++)
			arr[i]=Integer.parseInt(st.nextToken());
		Arrays.fill(dp, 1);
		
		for(int i=2;i<=n;i++)
		{
			for(int j=1;j<i;j++)
			{
				if(arr[i]>arr[j])
				{
					if(dp[i]<=dp[j])
					{
						instance[i]=j;
						dp[i]=dp[j]+1;
					}
				}
			}
		}
		int max=dp[1];
		int index=1;
		for(int i=2;i<=n;i++)
			if(dp[i]>=max)
			{
				max=dp[i];
				index=i;
			}
		System.out.println(dp[index]);
		while(true)
		{
			sb.insert(0, arr[index]+" ");
			index=instance[index];
			if(index==0)
				break;
		}
		/*		
		for(int i=1;i<=n;i++)
			output.write(String.valueOf(dp[i])+" ");
		output.write("\n");
		for(int i=1;i<=n;i++)
			output.write(String.valueOf(instance[i])+" ");
		*/
		System.out.println(sb);
		// TODO Auto-generated method stub

	}

}
