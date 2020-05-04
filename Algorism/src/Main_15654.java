import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_15654 {
		static int n;
		static int m;
		static int arr[];
		static boolean visited[];
		static StringBuilder sb=new StringBuilder();
		static void search(int index,int a[]) throws Exception
		{
			if(index==m+1)
			{
				for(int i=1;i<index;i++)
					sb.append(a[i]+" ");
				sb.append("\n");
				return;
			}
			for(int i=1;i<=n;i++)
			{
				if(visited[i]==false)
				{
					visited[i]=true;
					a[index]=arr[i];
					search(index+1,a);
					visited[i]=false;
				}
					
			}
		}

	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(input.readLine());
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		st=new StringTokenizer(input.readLine());
		int a[]=new int[m+1];
		arr=new int[n+1];
		for(int i=1;i<=n;i++)
			arr[i]=Integer.parseInt(st.nextToken());
		Arrays.sort(arr);
		visited=new boolean[n+1];
		for(int i=1;i<=n;i++)
			visited[i]=false;
		search(1,a);
		System.out.println(sb);
		// TODO Auto-generated method stub

	}

}
