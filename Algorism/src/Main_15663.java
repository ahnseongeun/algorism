import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main_15663 {
		static int result[];
		static int arr[];
		static boolean visited[];
		static StringBuilder sb=new StringBuilder();
		static int n;
		static int m;
		static void search(int index)
		{
			if(index==m+1)
			{
				for(int i=1;i<index;i++)
					sb.append(result[i]+" ");
				sb.append("\n");
				return;
			}
			int before=-1;
			for(int i=1;i<=n;i++)
			{
				if(visited[i]==false&&before!=arr[i])
				{
					before=arr[i];
					visited[i]=true;
					result[index]=arr[i];
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
		st=new StringTokenizer(input.readLine());
		arr=new int[n+1];
		visited= new boolean[n+1];
		result=new int[m+1];
		for(int i=1;i<=n;i++)
			arr[i]=Integer.parseInt(st.nextToken());
		Arrays.sort(arr);
		search(1);
		System.out.println(sb);
	}

}
