import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class node233{
	int i;
	int j;
	int level;
	node233(int i,int j,int level){
		this.i=i;
		this.j=j;
		this.level=level;
	}
	node233(){}
}

public class Main_7576 {
		static int m;
		static int n;
		static int count;
		public static void bfs(int arr[][])
		{
			Queue<node233> q=new LinkedList<node233>();
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=m;j++)
				{
					if(arr[i][j]==1)
						q.add(new node233(i,j,0));
						
				}
			}
			while(!q.isEmpty())
			{
				node233 node=new node233();
				node=q.poll();
				int i=node.i;
				int j=node.j;
				int level=node.level;
				
				if(arr[i][j+1]==0)
				{
					arr[i][j+1]=1;
					q.add(new node233(i,j+1,level+1));
				}
				if(arr[i][j-1]==0)
				{
					arr[i][j-1]=1;
					q.add(new node233(i,j-1,level+1));
				}
				if(arr[i+1][j]==0)
				{
					arr[i+1][j]=1;
					q.add(new node233(i+1,j,level+1));
				}
				if(arr[i-1][j]==0)
				{
					arr[i-1][j]=1;
					q.add(new node233(i-1,j,level+1));
				}
				if(q.size()==0)
				{
					count=node.level;
					break;
				}
			}
		}

	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(input.readLine());
		m=Integer.parseInt(st.nextToken());
		n=Integer.parseInt(st.nextToken());
		int arr[][]=new int[n+2][m+2];
		for(int i=1;i<=n;i++)
		{
			st=new StringTokenizer(input.readLine());
			for(int j=1;j<=m;j++)
			{
				arr[i][j]=Integer.parseInt(st.nextToken());
				if(i==1)
					arr[i-1][j]=1;
				if(i==n)
					arr[i+1][j]=1;
				if(j==1)
					arr[i][j-1]=1;
				if(j==m)
					arr[i][j+1]=1;
			}
		}
		arr[n+1][m+1]=1;
		arr[0][m+1]=1;
		arr[n+1][0]=1;
		arr[0][0]=1;
		
		bfs(arr);
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(arr[i][j]==0)
					count=-1;
			}
		}
		output.write(String.valueOf(count));
		output.close();
		// TODO Auto-generated method stub

	}

}
