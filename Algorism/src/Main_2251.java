import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;


public class Main_2251 {
		static StringBuilder sb=new StringBuilder();
		static ArrayList<Integer> list=new ArrayList<Integer>();
		static boolean visited[][][];
		static void bfs(int a,int b,int c)
		{
			Queue<int []> q=new LinkedList<int[]>();
			int count=0;
			q.add(new int[] {0,0,c});
			while(!q.isEmpty()) {
				int arr[]=q.poll();
				int x=arr[0]; int y=arr[1]; int z=arr[2];
				if(visited[x][y][z]==true) //중복이 있니?
					continue;
				visited[x][y][z]=true;
				if(x==0) //a물통에 안들어 있으면 c의 물통 값 넣기
				{
					list.add(z);
				}
				//c->b
				y+=z;
				z=0;
				if(y>b)
				{
					z+=(y-b);
					y-=z;
				}
				q.add(new int[] {x,y,z});
				x=arr[0]; y=arr[1]; z=arr[2];
				//b->c
				z+=y;
				y=0;
				if(z>c)
				{
					y+=(z-c);
					z-=y;
				}
				q.add(new int[] {x,y,z});
				x=arr[0]; y=arr[1]; z=arr[2];
				
				//a->c
				z+=x;
				x=0;
				if(z>c)
				{
					x+=(z-c);
					z-=x;
				}
				q.add(new int[] {x,y,z});
				x=arr[0]; y=arr[1]; z=arr[2];
				
				//c->a
				x+=z;
				z=0;
				if(x>a)
				{
					z+=(x-a);
					x-=z;
				}
				q.add(new int[] {x,y,z});
				x=arr[0]; y=arr[1]; z=arr[2];
				//a->b
				y+=x;
				x=0;
				if(y>b)
				{
					x+=(y-b);
					y-=x;
				}
				q.add(new int[] {x,y,z});
				x=arr[0]; y=arr[1]; z=arr[2];
				//b->a
				x+=y;
				y=0;
				if(x>a)
				{
					y+=(x-a);
					x-=y;
				}
				q.add(new int[] {x,y,z});
				x=arr[0]; y=arr[1]; z=arr[2];
				
			}
			
		}
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(input.readLine());
		int a=0; int b=0; int c=0;
		a=Integer.parseInt(st.nextToken());
		b=Integer.parseInt(st.nextToken());
		c=Integer.parseInt(st.nextToken());
		visited=new boolean[201][201][201];
		bfs(a,b,c);
		Collections.sort(list);
		for(int n:list)
			sb.append(n+" ");
		System.out.println(sb);
		// TODO Auto-generated method stub

	}

}
