import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;



public class Main_1260 {
	static int n;
	static LinkedList<Integer>[] list;
	static boolean visited[];
	static StringBuilder sb;
	static void dfs(int start) { //���̴� ���
		if(visited[start]==true)
		{
			return;
		}
		visited[start]=true;
		sb.append(start+" ");
		for(int next:list[start]) { //list�� �ִ� ���� �ϳ��� ���
			dfs(next);
		}
		
	}
	static void bfs(int start) { //���̴� ť
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(start);
		while(!q.isEmpty())
		{
			start=q.poll();
			if(visited[start]==true)
				continue;
			visited[start]=true;
			sb.append(start+" ");
			for(int next:list[start])
				q.add(next);
		}
	}
		
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(input.readLine());
		sb=new StringBuilder();
		n=Integer.parseInt(st.nextToken()); //��� ��
		int m=Integer.parseInt(st.nextToken()); // ���� ��
		int start=Integer.parseInt(st.nextToken()); // ������ġ
		
		list=new LinkedList[n+1]; //�迭 �ʱ�ȭ
		visited=new boolean[n+1];
		
		for(int i=0;i<=n;i++) //linkedlist�� ���� �ʱ�ȭ
		{
			list[i]=new LinkedList<Integer>();
			visited[i]=false;
		}	
		for(int i=0;i<m;i++)
		{
			st=new StringTokenizer(input.readLine());
			int value=Integer.parseInt(st.nextToken());
			int next=Integer.parseInt(st.nextToken());
			list[value].add(next);
			list[next].add(value);
			//Collections.sort(list[value]);
			//Collections.sort(list[next]);
		}
		dfs(start);
		for(int i=0;i<=n;i++)
			visited[i]=false;
		sb.append("\n");
		bfs(start);
		System.out.println(sb);
		// TODO Auto-generated method stub

	}

}
