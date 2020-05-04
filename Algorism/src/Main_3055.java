import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_3055 {
		static int x[]= {-1,0,1,0};
		static int y[]= {0,1,0,-1};
		static int visited[][];
		static int visited2[][];
		static int min=0;
		public static int bfs(char[][] arr,int n,int m)
		{
			Queue<int []> q2=new LinkedList<int []>(); //고슴 도치
			Queue<int []> q1=new LinkedList<int []>(); //물
			int d1=0;
			int d2=0;
			int a1[]=new int[2];
			int a2[]=new int[2];
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=m;j++)
				{
					if(arr[i][j]=='S')
					{
						q2.add(new int[] {i,j});
						visited[i][j]=0;
					}
					if(arr[i][j]=='*')
					{
						q1.add(new int[] {i,j});
						visited2[i][j]=0;
					}
					if(arr[i][j]=='D')
					{
						d1=i;
						d2=j;
						visited2[i][j]=-2;
					}
				}
			}
			while(!q1.isEmpty())//물부터 시작
			{
					a1=q1.poll(); //물
					int x1,y1,xn,yn; //x1,y1 초기 , xn,yn가 다음 상태
					x1=a1[0]; y1=a1[1]; 
					for(int k=0;k<4;k++)
					{
						xn=a1[0]+x[k]; 
						yn=a1[1]+y[k];
						if(x1<1||y1<1||xn>n||yn>m) continue;
						if(arr[xn][yn]=='.'&&visited2[xn][yn]==0)
						{
							visited2[xn][yn]=visited2[x1][y1]+1;
							arr[xn][yn]='*';
							q1.add(new int[] {xn,yn});
						}
						if(arr[xn][yn]=='X'&&visited2[xn][yn]==0)
						{
							visited2[xn][yn]=-1;
						}
						
					}
			}
			while(!q2.isEmpty())//물부터 시작
			{
					a1=q2.poll(); //물
					int x1,y1,xn,yn; //x1,y1 초기 , xn,yn가 다음 상태
					x1=a1[0]; y1=a1[1]; 
					for(int k=0;k<4;k++)
					{
						xn=a1[0]+x[k]; 
						yn=a1[1]+y[k];
						if(x1<1||y1<1||xn>n||yn>m) continue;
						if(arr[xn][yn]=='.'&&visited[xn][yn]==0) //물이 안오는 영역 확인
						{
							visited[xn][yn]=visited[x1][y1]+1;
							q2.add(new int[] {xn,yn});
						}
						if((visited[x1][y1]+1<visited2[xn][yn])&&visited[xn][yn]==0)
						{
							visited[xn][yn]=visited[x1][y1]+1;
							q2.add(new int[] {xn,yn});
						}
						if(visited2[xn][yn]==-2)
						{
							visited[xn][yn]=visited[x1][y1]+1;
							return visited[xn][yn];
						}
					}
					
			}
			
			return -1;
		}
		

	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(input.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		char[][] arr=new char[n+1][m+1];
		visited=new int[n+1][m+1];
		visited2=new int[n+1][m+1];
		for(int i=1;i<=n;i++)
		{
			String str=input.readLine();
			for(int j=1;j<=m;j++)
			{
				arr[i][j]=str.charAt(j-1);
			}
		}
		
		int sum=bfs(arr,n,m);;
		if(sum==-1)
			output.write("KAKTUS");
		else
			output.write(String.valueOf(sum));
		/*
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				output.write(String.valueOf(arr[i][j])+" ");
			}
			output.write("\n");
		}
		output.write("\n");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				output.write(String.valueOf(visited2[i][j])+" ");
			}
			output.write("\n");
		}
		output.write("\n");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				output.write(String.valueOf(visited[i][j])+" ");
			}
			output.write("\n");
		}
		*/
		output.close();
		// TODO Auto-generated method stub

	}

}

/* 좋은 예시
 ..............................
..............................
.............XXXXXXXXXXX......
.............X...S.....X......
.............X.XXXXXXX.X......
.....XXXXXXXXX.X.....X.X......
........*......X.*...X.X......
.....XXXXXXXXX.X.....X.X......
.............X.X...*.X.X......
.............XDX.....X.X......
.............X.X.....X.X......
.............X.X.....X.X......
.............X.X..*..X.X......
.............X.X.....X.X......
.............X.X.....X.X......
.............X.XXXXXXX.X......
.............X.........X......
.............XXXXXXXXXXX......
..............................
.............................. 
 */
