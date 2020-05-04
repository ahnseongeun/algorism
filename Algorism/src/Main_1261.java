import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_1261 {
	static int visited[][];
	static int bfs(int arr[][],int i,int j)
	{
		Deque<int[]> q=new LinkedList<int[]>();
		int s[];
		int count=0;
		q.add(new int[] {1,1}); //
		visited[1][1]=0;
		while(!q.isEmpty())
		{
			s=q.poll();
			int a=s[0];
			int b=s[1];
			
			if(a==i&&b==j)
			{
				count=visited[i][j];
				break;
			}
			
			if(b<j&&visited[a][b+1]==-1) //s[0]Àº iÀÇ ÁÂÇ¥, s[1]Àº jÀÇ ÁÂÇ¥
			{
				if(arr[a][b+1]==0)
				{
					visited[a][b+1]=visited[a][b];
					q.addFirst(new int[] {a,b+1});
				}
				else
				{
					visited[a][b+1]=visited[a][b]+1;
					q.addLast(new int[] {a,b+1});
				}		
			}
			if(a>1&&visited[a-1][b]==-1) //s[0]Àº iÀÇ ÁÂÇ¥, s[1]Àº jÀÇ ÁÂÇ¥
			{
				if(arr[a-1][b]==0)
				{
					visited[a-1][b]=visited[a][b];
					q.addFirst(new int[] {a-1,b});
				}
				else
				{
					visited[a-1][b]=visited[a][b]+1;
					q.addLast(new int[] {a-1,b});
				}	
			}
			if(b>1&&visited[a][b-1]==-1) //s[0]Àº iÀÇ ÁÂÇ¥, s[1]Àº jÀÇ ÁÂÇ¥
			{
				if(arr[a][b-1]==0)
				{
					visited[a][b-1]=visited[a][b];
					q.addFirst(new int[] {a,b-1});
				}
				else
				{
					visited[a][b-1]=visited[a][b]+1;
					q.addLast(new int[] {a,b-1});
				}	
			}
			if(a<i&&visited[a+1][b]==-1) //s[0]Àº iÀÇ ÁÂÇ¥, s[1]Àº jÀÇ ÁÂÇ¥
			{
				if(arr[a+1][b]==0)
				{
					visited[a+1][b]=visited[a][b];
					q.addFirst(new int[] {a+1,b});
				}
				else
				{
					visited[a+1][b]=visited[a][b]+1;
					q.addLast(new int[] {a+1,b});
				}	
			}
		
		
		}
		return count;
	}

	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(input.readLine());
		int m=Integer.parseInt(st.nextToken());
		int n=Integer.parseInt(st.nextToken());
		int arr[][]=new int[n+1][m+1];
		visited=new int[n+1][m+1];
		for(int i=1;i<=n;i++)
		{
			String str=input.readLine();
			for(int j=1;j<=m;j++)
			{
				arr[i][j]=(str.charAt(j-1)-'0');
			}
			Arrays.fill(visited[i], -1);
		}
		System.out.println(bfs(arr,n,m));
		
		// TODO Auto-generated method stub

	}

}
