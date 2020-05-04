import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_2206 {
		static int visited[][][];
		static int max;
		static void bfs(int arr[][],int n,int m)
		{
			Deque<int[]> q=new LinkedList<int[]>();
			q.add(new int[] {1,1,0});  // i랑 j랑 level표시
			int a[]=new int[3];
			visited[1][1][0]=1; //z번째 인덱스가 나타내는 것은  벽을 뿌셨는지 안뿌셨는지. 0과 1로 표현
			
			while(!q.isEmpty())
			{
				a=q.pollFirst();
				int i=a[0];
				int j=a[1];
				int k=a[2]; //현재 방문횟수 표시
				//////////////////////////////////////////////////////////
				
				if(i<n&&visited[i+1][j][k]==0) //벽 안뿌시는 루트
				{
					if(arr[i+1][j]==0)
					{
						visited[i+1][j][k]=visited[i][j][k]+1;
						q.add(new int[] {i+1,j,k});
					}
				}
				
				if(i<n&&visited[i+1][j][k+1]==0) //벽뿌시는 루트
				{
					if(k==0&&arr[i+1][j]==1) 
					{
						visited[i+1][j][k+1]=visited[i][j][k]+1;
						q.add(new int[] {i+1,j,k+1});
					}
				}
				
				//////////////////////////////////////////////////////
				if(j>1&&visited[i][j-1][k]==0)
				{
					if(arr[i][j-1]==0)
					{
					visited[i][j-1][k]=visited[i][j][k]+1;
					q.add(new int[] {i,j-1,k});
					}
				}
				if(j>1&&visited[i][j-1][k+1]==0) //벽뿌시는 루트
				{
					if(k==0&&arr[i][j-1]==1) 
					{
					visited[i][j-1][k+1]=visited[i][j][k]+1;
					q.add(new int[] {i,j-1,k+1});
					}
				}
				
				////////////////////////////////////////////////////////
				if(i>1&&visited[i-1][j][k]==0)
				{
					if(arr[i-1][j]==0)
					{
						visited[i-1][j][k]=visited[i][j][k]+1;
						q.add(new int[] {i-1,j,k});
					}
				}
				if(i>1&&visited[i-1][j][k+1]==0) //벽뿌시는 루트
				{					
					if(k==0&&arr[i-1][j]==1) 
					{
					visited[i-1][j][k+1]=visited[i][j][k]+1;
					q.add(new int[] {i-1,j,k+1});
					}
				}
				
				////////////////////////////////////////////////////////////
				if(j<m&&visited[i][j+1][k]==0)
				{
					if(arr[i][j+1]==0)
					{
						visited[i][j+1][k]=visited[i][j][k]+1;
						q.add(new int[] {i,j+1,k});
					}
				}
					if(j<m&&visited[i][j+1][k+1]==0) //벽뿌시는 루트
					{					
						if(k==0&&arr[i][j+1]==1) 
						{
						visited[i][j+1][k+1]=visited[i][j][k]+1;
						q.add(new int[] {i,j+1,k+1});
						}
					}
				////////////////////////////////////////////////////////////
				
				
			}
		}

	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(input.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		int arr[][]=new int[n+1][m+1];
		visited=new int[n+1][m+1][3];
		for(int i=1;i<=n;i++)
		{
			String str=input.readLine();
			for(int j=1;j<=m;j++)
			{
				arr[i][j]=(str.charAt(j-1)-'0');
			}
				
		}
		bfs(arr,n,m);
	
		if(visited[n][m][0]==0&&visited[n][m][1]==0)
			System.out.println(-1);
		else if(visited[n][m][0]==0)
			System.out.println(visited[n][m][1]);
		else if(visited[n][m][1]==0)
			System.out.println(visited[n][m][0]);
		else
		{
			if(visited[n][m][0]>visited[n][m][1])
				System.out.println(visited[n][m][1]);
			else
				System.out.println(visited[n][m][0]);
		}
		
			
		// TODO Auto-generated method stub

	}

}
