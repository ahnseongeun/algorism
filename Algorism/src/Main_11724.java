import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_11724 {
			static int count;
			static int n;
			static boolean visited[];
		public static void dfs(int start,ArrayList<Integer> list[])
		{
			if(visited[start]==true)// count++ 시킬 조건
				return;
			visited[start]=true;
			for(int i=0;i<list[start].size();i++)
			{
				int next=list[start].get(i);
				if(visited[next-1]==false)
					dfs(next-1,list);
			}
		}

	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(input.readLine());
		n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		ArrayList<Integer> list[]=new ArrayList[n];
		visited=new boolean[n]; 
		
		for(int i=0;i<n;i++) {
			list[i]=new ArrayList<Integer>();
			visited[i]=false; //0으로 초기화
		}
		
		for(int i=1;i<=m;i++)
		{
			st=new StringTokenizer(input.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			list[a-1].add(b);
			list[b-1].add(a);
		}
		for(int i=0;i<n;i++)
		{
			if(visited[i]==false)
			{
			   dfs(i,list);
			   count++;
			}
		}
		System.out.println(count);
		// TODO Auto-generated method stub

	}

}
