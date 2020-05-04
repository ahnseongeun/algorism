import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1260_1 {
	static int n;
	static StringBuilder sb;
	static boolean visited[];
	static void dfs(int start,LinkedList<Integer> list[])  //넓이 우선
	{
		if(!visited[start])
			return;
		visited[start]=false;
		sb.append(start+" ");
		for(int i=0;i<list[start].size();i++)
			dfs(list[start].get(i),list);
		//for(int next:list[start])
			//dfs(next,list);
		
	}
	static void bfs(int start,LinkedList<Integer> list[])
	{
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(start);
		while(!q.isEmpty())
		{
			start=q.poll();
			if(!visited[start])
				continue;
			visited[start]=false;
			sb.append(start+" ");
			for(int i=0;i<list[start].size();i++)
			{
				q.add(list[start].get(i));
				//bfs(list[start].get(i),list);
			}
		}
	}
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(input.readLine());
		n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		int start=Integer.parseInt(st.nextToken());
		visited=new boolean[n+1];
		sb=new StringBuilder();
		//배열 및 각 리스트 초기화
		LinkedList<Integer> list[]=new LinkedList[n+1];
		for(int i=0;i<=n;i++)
		{
			visited[i]=true;
			list[i]=new LinkedList<Integer>();
		}
		
		for(int i=0;i<m;i++)
		{
			st=new StringTokenizer(input.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			list[a].add(b);
			list[b].add(a);
			Collections.sort(list[a]);
			Collections.sort(list[b]);
		}
		dfs(start,list);
		for(int i=0;i<=n;i++)
			visited[i]=true;
		sb.append("\n");
		bfs(start,list);
		System.out.println(sb);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
