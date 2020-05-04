import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class noed {
	int i;
	int j;
	int level;
	noed(int i,int j,int level){
		this.i=i;
		this.j=j;
		this.level=level;
	}
	noed(){}
}

public class Main_2178 {
	static int n;
	static int m;
	static int num=0;
		public static void bfs(int arr[][],int a,int b)
		{
			int level=1;
			int i=a;
			int j=b;
			Queue<noed> q= new LinkedList<noed>();
			q.add(new noed(i,j,0));
			arr[i][j]=0;
			noed node=new noed();
			while(!q.isEmpty())
			{
				node=q.poll();
				i=node.i;
				j=node.j;
				level=node.level;
				if(arr[i][j+1]==1) {
					arr[i][j+1]=0;
					q.add(new noed(i,j+1,level+1));
				}
				if(arr[i][j-1]==1) {
					arr[i][j-1]=0;
					q.add(new noed(i,j-1,level+1));
				}
				if(arr[i+1][j]==1) {
					arr[i+1][j]=0;
					q.add(new noed(i+1,j,level+1));
				}
				if(arr[i-1][j]==1) {
					arr[i-1][j]=0;
					q.add(new noed(i-1,j,level+1));
				}
				//visited[i][j+1]=1; ->처음에 이렇게 방문표시를 했는데 중복되는 visited가 생겨서 메모리초과 
				                    // 그렇기 때문에 각각 해주어야한다.
				//System.out.println(i+" "+j+" "+level);
				/*
				if(j<m&&(visited[i][j+1]==0&&arr[i][j+1]==1)) {
					q.add(new noed(i,j+1,level+1));
					visited[i][j+1]=1;
				}
				if(i<n&&(visited[i+1][j]==0&&arr[i+1][j]==1)) {
					q.add(new noed(i+1,j,level+1));
					visited[i+1][j]=1;
				}
				if(j>0&&(visited[i][j-1]==0&&arr[i][j-1]==1)) {
					q.add(new noed(i,j-1,level+1));
					visited[i][j-1]=1;
				}
				if(i>0&&(visited[i-1][j]==0&&arr[i-1][j]==1)) {
					q.add(new noed(i-1,j,level+1));
					visited[i-1][j]=1;
				}
				*/
				if(i==n&&j==m)
				{
					num=node.level;
					break;
				}
				
			}
			
		}

	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(input.readLine());
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		int arr[][]=new int[n+2][m+2];
		
		for(int i=1;i<=n;i++)
		{
			String str=input.readLine();
			for(int j=1;j<=m;j++)
			{
				arr[i][j]=(str.charAt(j-1)-'0');
			}
		}
		bfs(arr,1,1);
		System.out.println(num+1);
		// TODO Auto-generated method stub

	}

}
