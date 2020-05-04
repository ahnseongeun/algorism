import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;



public class Main_13913 {
		static StringBuilder sb=new StringBuilder();
		static int n;
		static int m;
		static int t=0;
		static Queue<int[]> q=new LinkedList<int[]>();
		static int visited[];
		static void bfs() {
			
			int count=0;
			q.add(new int[]{n,count});
			visited[n]=n; /////////////////////////
			while(!q.isEmpty())
			{
				int[] arr=q.poll();
				int index=arr[0];
				count=arr[1];
				//System.out.println(index);
				if(m==index)
				{
					t=count;
					break;
				}
					if(index<=50000&&visited[index*2]==-1)	
					{
						visited[index*2]=index;
						q.add(new int[] {index*2,count+1});
					}
				
					if(index<100000&&visited[index+1]==-1)
					{
						visited[index+1]=index;
						q.add(new int[] {index+1,count+1});
					}
					if(index>1&&visited[index-1]==-1)
					{
						visited[index-1]=index;
						q.add(new int[] {index-1,count+1});
					}
			}
			
			
		}
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(input.readLine());
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		if(n>=m)
		{
			System.out.println(n-m);
			for(int i=n;i>=m;i--)
				sb.append(i+" ");
			System.out.println(sb);
		}else
		{
		visited=new int[100001];
		Arrays.fill(visited, -1);
		bfs();
		System.out.println(t);
		int idx=m;
		int arr[]=new int[t+1];
		for(int i=t;i>=1;i--)
		{
			arr[i]=visited[idx];
			idx=visited[idx];
		}
		for(int i=1;i<=t;i++)
		{
			sb.append(arr[i]+" ");
		}
		sb.append(m);
		System.out.println(sb);
		}
		// TODO Auto-generated method stub

	}

}
