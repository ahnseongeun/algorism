import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main_13549{ //queue를 이용한 구현
		static int visited[];
		static ArrayList<Integer> result=new ArrayList<Integer>();
		static int bfs(int arr[],int n,int m) {
			Queue<Integer> q=new LinkedList<Integer>();
			Queue<Integer> next_q=new LinkedList<Integer>();
			int count=0;
			q.add(n);
			visited[n]=1;
			while(!q.isEmpty()) 
			{
				int i=q.poll();
				if(i==m)
				{
					result.add(count);
				}
				if(i<=50000&&visited[i*2]==0)
				{
					visited[i*2]=1;
					q.add(i*2);
				}
				if(i<100000&&visited[i+1]==0)
				{
					visited[i+1]=1;
					next_q.add(i+1);
				}
				if(i>=1&&visited[i-1]==0)
				{
					visited[i-1]=1;
					next_q.add(i-1);
				}
				if(q.isEmpty())
				{
					q=next_q;
					next_q= new LinkedList<Integer>(); 
					count++;
				}
				
			}
			Collections.sort(result);
			return result.get(0);
		}
	
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(input.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		int arr[]=new int[100001];
		visited=new int[100001];
		System.out.println(bfs(arr,n,m));
		
		// TODO Auto-generated method stub

	}

}
