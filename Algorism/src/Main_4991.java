import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_4991 {
		static StringBuilder sb=new StringBuilder();
		static ArrayList<int[]> list;
		static ArrayList<Integer> list1;
		static int x;
		static int y;
		static int min;
		static int num;
		static char arr[][]; 
		static int board[][]; //10*10
		static boolean visited[][]; //방문배열 최대 400개밖에안된다. 
		static boolean visit[];
		static int target;
		static int dx[]= {0,0,-1,1};
		static int dy[]= {-1,1,0,0};
		static int bfs(int y1,int x1,int ty,int tx) {
			Queue<int[]> q=new LinkedList<int[]>();
			int count=0;
			q.add(new int[] {y1,x1,0});
			visited[y1][x1]=true;
			while(!q.isEmpty()) {
				int a[]=q.poll();
				if(a[0]==ty&&a[1]==tx)
				{
					return a[2];
				}
				for(int i=0;i<=3;i++)
				{
					int ny=a[0]+dy[i]; int nx=a[1]+dx[i]; count=a[2];
					
					if(ny<0||nx<0||ny>(y-1)||nx>(x-1))
						continue;
					if(visited[ny][nx]==true||arr[ny][nx]=='x')
						continue;
					if(arr[ny][nx]=='*')
					{
						visited[ny][nx]=true;
						arr[ny][nx]='.';
						q.add(new int[] {ny,nx,count+1});
					}else{
						visited[ny][nx]=true;
						q.add(new int[] {ny,nx,count+1});
					}
				}
			}
			return -1;
		}
		static void dfs(int count) {
			if(count==num) {
				int sum=0;
				int previous=0;
				int next=0;
				for(int i=0;i<num;i++)
				{
					if(i==0) {
					previous=list1.get(i);
					sum+=board[previous][previous];
					}else {
						next=list1.get(i);
						sum+=board[next][previous];
						previous=next;
					}
				}
				
				if(sum<min)
					min=sum;
				return;
			}
			for(int i=0;i<num;i++)
			{
				if(visit[i]==false) {
				visit[i]=true;
				list1.add(i);
				dfs(count+1);
				list1.remove(list1.size()-1);
				visit[i]=false;
				}
			}
			
		}
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
		StringTokenizer st=new StringTokenizer(input.readLine());
		x=Integer.parseInt(st.nextToken());
		y=Integer.parseInt(st.nextToken());
		if(x==0&&y==0)
			break;
		arr=new char[y][x];
		visited=new boolean[y][x];
		list=new ArrayList<int[]>();
		target=0;
		min=Integer.MAX_VALUE;
		//result=0;
		int y1=0,x1=0;
		for(int i=0;i<y;i++)
		{
			String str=input.readLine();
			for(int j=0;j<x;j++)
			{
				arr[i][j]=str.charAt(j);
				if(arr[i][j]=='o')
				{
					y1=i;x1=j;
				}
				if(arr[i][j]=='*')
				{
					list.add(new int[] {i,j});
					target++;
				}
			}
		}
		board=new int[target][target];
		for(int i=0;i<list.size();i++)
		{
			for(int j=0;j<list.size();j++)
			{
				if(i==j)
				{
					int a[]=list.get(i);
					board[i][i]=bfs(y1,x1,a[0],a[1]);
					if(board[i][i]==-1)
					{
						min=-1;
						break;
					}
					visited=new boolean[y][x];
				}else {
					if(board[i][j]==0) {
					int a[]=list.get(i);
					int b[]=list.get(j);
					board[i][j]=bfs(a[0],a[1],b[0],b[1]);
					board[j][i]=board[i][j];
					visited=new boolean[y][x];
					}
				}
			}
		}
		if(min!=-1) {
		num=list.size();
		list1=new ArrayList<Integer>();
		visit=new boolean[list.size()];
		dfs(0);
		}
		/*
		for(int i=0;i<list.size();i++)
		{
			for(int j=0;j<list.size();j++)
			{
				sb.append(board[i][j]+" ");
			}
			sb.append("\n");
		}
		*/
		//System.out.println(sb);
		sb.append(min+"\n");
		}
		System.out.println(sb);
		// TODO Auto-generated method stub

	}

}
