import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_6087 {
		static StringBuilder sb=new StringBuilder();
		static char arr[][];
		static int visited[][];
		static int dx[]= {0,0,-1,1}; //상하좌우
		static int dy[]= {-1,1,0,0};
		static int n;
		static int m;
		static int total=-1;
		static int c=0;
		static void bfs(int start_x,int start_y,int target_x,int target_y) {
			Deque<int []> q=new LinkedList<int[]>();
			int count=0;
			int x=start_x; //x 위치
			int y=start_y; //y 위치
			int dir=0;
			visited[y][x]=0;
			q.add(new int[] {x,y,count,dir});
			//visited[y][x]=count;
			
			while(!q.isEmpty()) {
				int a[]=q.poll();
				x=a[0]; y=a[1]; count=a[2];
				if(x==target_x&&y==target_y)
				{
					total=count;
					break;
				}
			
				for(int i=0;i<=3;i++) //상하좌우
				{
					int nx=x; int ny=y;
					while(true)
					{
						nx+=dx[i]; ny+=dy[i];
						if(nx<0||ny<0||nx>m-1||ny>n-1)
							break;
						if(arr[ny][nx]=='*')
							break;
						if(visited[ny][nx]==-1) {
						visited[ny][nx]=count;
						q.add(new int[] {nx,ny,count+1});
						
						}
						
					}
				}
					
			}
			
			
		}
	public static void main(String[] args) throws Exception{
		  BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		  StringTokenizer st=new StringTokenizer(input.readLine());
		  m=Integer.parseInt(st.nextToken());
		  n=Integer.parseInt(st.nextToken());
		  arr=new char[n][m];
		  visited=new int[n][m];
		  int start_x=0,start_y=0;
		  int target_x=0,target_y=0;
		  boolean flag=false;
          for(int i=0;i<n;i++)
		  {
			  String str=input.readLine();
			  for(int j=0;j<m;j++)
			  {
				  arr[i][j]=str.charAt(j);
				  if(arr[i][j]=='C'&&flag==false)
				  {
					  target_x=j;
					  target_y=i;
					  flag=true;
				  }
				  if(arr[i][j]=='C'&&flag==true)
				  {
					  start_x=j;
					  start_y=i;
				  }
			  }
			  Arrays.fill(visited[i], -1);
		  }
		  bfs(start_x,start_y,target_x,target_y);
		  
		  for(int i=0;i<n;i++)
		  {
			  for(int j=0;j<m;j++)
			  {
				  sb.append(visited[i][j]+"  ");
			  }
			  sb.append("\n");
		  }
		  System.out.println(sb);
		  
		  System.out.println(visited[target_y][target_x]);
		// TODO Auto-generated method stub

	}

}
