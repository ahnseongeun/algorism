import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main_2667 {
		static boolean visited[][];
		static int count=0;
		static int n;
		static void dfs(int[][] arr,int a,int b)
		{
			if(visited[a][b]==true)
				return;
			visited[a][b]=true;
			count++;
			if(b<n)
			if(arr[a][b+1]==1)
				dfs(arr,a,b+1);
			if(a<n)
			if(arr[a+1][b]==1)
				dfs(arr,a+1,b);
			if(a-1>0)
			if(arr[a-1][b]==1)
				dfs(arr,a-1,b);
			if(b-1>0)
			if(arr[a][b-1]==1)
				dfs(arr,a,b-1);
						
		}
		
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		ArrayList<Integer> list1=new ArrayList<Integer>();
		n=Integer.parseInt(input.readLine());
		int arr[][]=new int[n+1][n+1];
		for(int i=1;i<=n;i++) {
			String str=input.readLine();
			for(int j=1;j<=n;j++)
				arr[i][j]=str.charAt(j-1)-'0';
		}
		visited=new boolean[n+1][n+1];
		for(int i=1;i<=n;i++)
		Arrays.fill(visited[i], false);
		int num=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(visited[i][j]==false&&arr[i][j]==1)
				{
					
					dfs(arr,i,j);
					list1.add(count);
					num++;
					count=0;
				}
			}
		}
		Collections.sort(list1); //sort를 잘해야한다.
		sb.append(String.valueOf(num)+"\n");
		for(int i=0;i<list1.size();i++)
			sb.append(String.valueOf(list1.get(i))+"\n");
		System.out.println(sb);
		// TODO Auto-generated method stub

	}

}
