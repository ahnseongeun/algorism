import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10942 {
		static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(input.readLine());
		int arr[]=new int[n+1];
		int[][] dp=new int[n+1][n+1];
		StringTokenizer st=new StringTokenizer(input.readLine());
		for(int i=1;i<=n;i++)
			arr[i]=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(input.readLine());
		for(int i=1;i<=m;i++)
		{
			st=new StringTokenizer(input.readLine());
			int start=Integer.parseInt(st.nextToken());
			int end=Integer.parseInt(st.nextToken());
			int s=start;
			int e=end;
			while(true) {
				if(s>e||dp[s][e]==1)
				{
					sb.append("1\n");
					dp[start][end]=1;
					break;
				}else {
					if(arr[s]==arr[e])
					{
						s++;
						e--;
					}else {
						sb.append("0\n");
						break;
					}
				}
				
			}
		}
		System.out.println(sb);
		// TODO Auto-generated method stub

	}

}
