import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_15651 {
		static int n;
		static int m;
		static boolean visited[];
		static StringBuilder sb=new StringBuilder();
		static void search(int index,int arr[])
		{
			if(index==m+1)
			{
				for(int i=1;i<index;i++)
				sb.append(arr[i]+" ");
				sb.append("\n");
				return;
			}
			for(int i=1;i<=n;i++)
			{
				if(visited[i]==false)
				{
					arr[index]=i;
					search(index+1,arr);
				}
			}
			
		}
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(input.readLine());
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		int arr[]=new int[m+1];
		visited=new boolean[n+1];
		search(1,arr);
		System.out.println(sb);
		// TODO Auto-generated method stub

	}

}
