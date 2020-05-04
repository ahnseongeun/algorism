import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

import sun.awt.image.ImageWatched.Link;


//문제점 같은길을 갈때 다른 경로를 거쳐온 것을 해결하지 못했다.
public class Main_12851{
		static StringBuilder sb=new StringBuilder();
		static int n;
		static int m;
		static int t=0;
		static int c=0;
		static Queue<int[]> q=new LinkedList<int[]>();
		static int visited[];
		static int max=Integer.MAX_VALUE;
		static void bfs() {
			int count=0;
			q.add(new int[]{n,count});
			while(!q.isEmpty())
			{
				int[] arr=q.poll();
				int index=arr[0]; //현재 방문 인덱스
				count=arr[1]; //깊이 수
				visited[index]=index;
				//System.out.println(count);
				if(count>max)
					continue;
				if(m==index)
				{
					t=count;
					c++;
					max=count;
				}
				if (index <= 50000&&!(visited[index*2]!=-1)) {
					//visited[index*2]=index;
					q.add(new int[] { index * 2, count + 1 });
					
				}
				if (index > 1&&!(visited[index-1]!=-1)) {
					//visited[index-1]=index;
					q.add(new int[] { index - 1, count + 1 });
					
				}
				
				if (index < 100000&&!(visited[index+1]!=-1)) {
					//visited[index+1]=index;
					q.add(new int[] { index + 1, count + 1 });
					
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
			System.out.println(1);
		}else
		{
		visited=new int[100001];
		Arrays.fill(visited, -1);
		bfs();
		System.out.println(t);
		System.out.println(c);
		//System.out.println(visited[m]);
		
		}
		// TODO Auto-generated method stub

	}

}
