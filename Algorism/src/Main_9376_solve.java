import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_9376_solve {
		static StringBuilder sb=new StringBuilder();
		static int num;
		static int dx[]= {0,0,-1,1};//»óÇÏÁÂ¿ì
		static int dy[]= {-1,1,0,0};
		static char arr[][];
		static int n;
		static int m;
		static void bfs(int ch[][],int a,int b)
		{
			Deque<int[]> q=new LinkedList<int[]>();
			//Queue<int[]> q=new LinkedList<int[]>();
			int x=a;
			int y=b;
			int count=0;
			q.add(new int[] {x,y,count});
			ch[y][x]=0;
			while(!q.isEmpty())
			{
				int c[]=q.poll();
				x=c[0];
				y=c[1];
				count=c[2];
				for(int i=0;i<=3;i++)
				{
					if(x+dx[i]>(m+1)||x+dx[i]<0||y+dy[i]>(n+1)||y+dy[i]<0)
						continue;
					if(arr[y+dy[i]][x+dx[i]]=='*'||ch[y+dy[i]][x+dx[i]]!=-1)
						continue;
					if(arr[y+dy[i]][x+dx[i]]=='#'){
						ch[y+dy[i]][x+dx[i]]=count+1;
						q.addLast(new int[] {x+dx[i],y+dy[i],count+1});
						//q.add(new int[] {x+dx[i],y+dy[i],count+1});
					}
					if(arr[y+dy[i]][x+dx[i]]=='.') {
						ch[y+dy[i]][x+dx[i]]=count;
						q.addFirst(new int[] {x+dx[i],y+dy[i],count});
						//q.add(new int[] {x+dx[i],y+dy[i],count});
					}
				}
			}
			
			
		}
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		num=Integer.parseInt(input.readLine());
		for(int k=1;k<=num;k++)
		{
			StringTokenizer st=new StringTokenizer(input.readLine());
			n=Integer.parseInt(st.nextToken());
			m=Integer.parseInt(st.nextToken());
			arr=new char[n+2][m+2];
			int ch1[][]=new int[n+2][m+2];
			int ch2[][]=new int[n+2][m+2];
			int ch3[][]=new int[n+2][m+2];
			for(int i=0;i<=n+1;i++)
			{
			Arrays.fill(arr[i],'.');
			Arrays.fill(ch1[i], -1);
			Arrays.fill(ch2[i], -1);
			Arrays.fill(ch3[i], -1);
			}
			int a1=0,a2=0,b1=0,b2=0;
			boolean flag=false;
			for(int i=1;i<=n;i++)
			{
				String str=input.readLine();
				for(int j=1;j<=m;j++)
				{
					arr[i][j]=str.charAt(j-1);
					if(arr[i][j]=='$'&&flag==false)
					{
						arr[i][j]='.';
						a1=i;
						b1=j;
						flag=true;
					}
					if(arr[i][j]=='$'&&flag==true)
					{
						arr[i][j]='.';
						a2=i;
						b2=j;
					}
				}
			}
			
			bfs(ch1,0,0);
			bfs(ch2,b1,a1);
			bfs(ch3,b2,a2);
			int max=Integer.MAX_VALUE;
			for(int i=0;i<=n+1;i++)
			{
				for(int j=0;j<=m+1;j++)
				{
					ch1[i][j]+=(ch2[i][j]+ch3[i][j]);
					if(arr[i][j]=='#')
						ch1[i][j]-=2;
					if(ch1[i][j]>-1&&ch1[i][j]<max)
						max=ch1[i][j];
				}
			}
			System.out.println(max);
				
		}
		
		// TODO Auto-generated method stub

	}

}
