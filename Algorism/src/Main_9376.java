import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_9376 {
	static StringBuilder sb = new StringBuilder();
	static int num;
	static int n, m;
	static char arr[][];
	static int dx[]= {0,0,-1,1};//»óÇÏÁÂ¿ì
	static int dy[]= {-1,1,0,0};
	static int visited1[][];
	static int visited2[][];
	static int visited3[][];
	static void bfs(int a1,int b1) { 
		Queue<int[]> q=new LinkedList<int[]>();
		int count=0;
		q.add(new int[] {a1,b1,count});
		while(!q.isEmpty()) {
			int a[]=q.poll();
			int y=a[0];
			int x=a[1];
			count=a[2];
			for(int i=0;i<=3;i++)
			{
			
				if(x+dx[i]==t2&&y+dy[i]==t1)
				{
					visited[y+dy[i]][x+dx[i]]=i;
					q.add(new int[] {y+dy[i],x+dx[i],count+1});
				}
			
				if(x+dx[i]<1||x+dx[i]>m||y+dy[i]<1||y+dy[i]>n)
					continue;
				
				if(arr[y+dy[i]][x+dx[i]]=='*'||arr[y+dy[i]][x+dx[i]]=='$'||visited[y+dy[i]][x+dx[i]]!=-1)
					continue;
				
					visited[y+dy[i]][x+dx[i]]=i;
					q.add(new int[] {y+dy[i],x+dx[i],count+1});
					
			}
		}
		
	}


	public static void main(String[] args) throws Exception {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		num = Integer.parseInt(input.readLine());
		for (int k = 1; k <= num; k++) {
			StringTokenizer st = new StringTokenizer(input.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			int a1=0,b1=0,a2=0,b2=0,c=0,t1=0,t2=0;
			arr = new char[n + 1][m + 1];
			visited=new int[n+1][m+1];
			for(int i=0;i<=n;i++)
			Arrays.fill(visited[i], -1);
			int min=99999;
			for (int i = 1; i <= n; i++) {
				String str = input.readLine();
				for (int j = 1; j <= m; j++) {
					arr[i][j] = str.charAt(j - 1);
					if(arr[i][j]=='$'&&c==0)
					{
						a1=i;b1=j;c=1;
						arr[i][j]='.';
					}
					if(arr[i][j]=='$'&&c==1)
					{
						a2=i;b2=j;
						arr[i][j]='.';
					}
					if(i==1||j==1||i==n||j==m)
						if(arr[i][j]!='*')
						{
							t1=i;
							t2=j;
						}
							
						
				}
			}
			list= new LinkedList<int[]>();
			bfs(a2,b2,t1,t2);
			for(int w1=0;w1<list.size();w1++)
			{
				int aa[]=list.get(w1);
				if(min>aa[2])
					min=aa[2];
			}
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=m;j++)
				{
					sb.append(visited[i][j]);
				}
				sb.append("\n");
			}
			sb.append("\n");
			result+=min;
			min=99999;
			list= new LinkedList<int[]>();
			System.out.println(result);
			/*
			visited=new int[n+1][m+1];
			for(int i=0;i<=n;i++)
			Arrays.fill(visited[i], -1);
			*/
			sb.append("\n\n\n\n\n");
			bfs(a1,b1,t1,t2);
			System.out.println("sdf");
			System.out.println(list.size());
			for(int w1=0;w1<list.size();w1++)
			{
				int aa[]=list.get(w1);
				if(min>aa[2])
					min=aa[2];
			}
			result+=min;
			System.out.println(result);
			//System.out.println(total);
			System.out.println(sb);
		}
		// TODO Auto-generated method stub

	}

}
