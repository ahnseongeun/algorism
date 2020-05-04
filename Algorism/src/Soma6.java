import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soma6 {

	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int n=Integer.parseInt(input.readLine());
		StringTokenizer st;
		int arr[][]=new int[n+1][n+1];
		for(int i=1;i<=n;i++)
		{
			st=new StringTokenizer(input.readLine());
			arr[1][i]=Integer.parseInt(st.nextToken());
			arr[2][i]=Integer.parseInt(st.nextToken());
		}
		for(int i=1;i<=n;i++)
		{
			int s=arr[1][i];
			int count=0;
			//int e=arr[2][i];
			for(int j=1;j<=n;j++)
			{
				if(s>arr[1][j]&&s<arr[2][j])
				{
					count++;
				}
			}
			sb.append(count+"\n");
		}
		System.out.println(sb);
		// TODO Auto-generated method stub

	}

}
