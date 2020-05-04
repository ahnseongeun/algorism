import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_15664 {
		static StringBuilder sb=new StringBuilder();
		static int arr[];
		static int a[];
		static boolean visited[];
		static int n;
		static int m;
		static void search(int index)
		{
			if(index==m+1)
			{
				for(int i=1;i<index;i++)
					sb.append(a[i]+" ");
				sb.append("\n");
				return;
			}
			int before=-1;
			for(int i=index;i<=n;i++)
			{
				if(index>1&&arr[i]<a[index-1])
					continue;
				if(visited[i]==false&&before!=arr[i])
				{
					before=arr[i];
					visited[i]=true;
					a[index]=arr[i];
					search(index+1);
					visited[i]=false;
				}
			}
		}
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(input.readLine());
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		arr=new int[n+1];
		visited=new boolean[n+1];
		a=new int[m+1];
		st=new StringTokenizer(input.readLine());
		for(int i=1;i<=n;i++)
			arr[i]=Integer.parseInt(st.nextToken());
		Arrays.sort(arr);
		search(1);
		System.out.println(sb);
		// TODO Auto-generated method stub

	}

}
