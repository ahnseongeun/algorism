import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_4963 {
	static int a;
	static int b;
	static int count;
	static int visited[][];
	public static void dfs(int arr[][],int i,int j)
	{
		if(arr[i][j]==0||visited[i][j]==1)
			return;
		visited[i][j]=1;
	
		
		if(j<a) 
		dfs(arr,i,j+1);
		if(j<a&&i<b)
		dfs(arr,i+1,j+1);
		if(i<b)
		dfs(arr,i+1,j);
		if(i<b&&j>0)
		dfs(arr,i+1,j-1);
		if(j>0)
		dfs(arr,i,j-1);
		if(i>0&&j>0)
		dfs(arr,i-1,j-1);
		if(i>0)
		dfs(arr,i-1,j);
		if(i>0&&j<a)
		dfs(arr,i-1,j+1);
		
	}
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			StringTokenizer st=new StringTokenizer(input.readLine());
			a=Integer.parseInt(st.nextToken());
			b=Integer.parseInt(st.nextToken());
			if(a==0&&b==0)
				break;
			int arr[][]=new int[b+2][a+2];
			visited=new int[b+2][a+2];
			for(int i=1;i<=b;i++) 
			{
				st=new StringTokenizer(input.readLine());
				for(int j=1;j<=a;j++)
				{
					arr[i][j]=Integer.parseInt(st.nextToken());
				}
				Arrays.fill(visited[i], 0);
			}
			
			
			for(int i=1;i<=b;i++) 
			{
				for(int j=1;j<=a;j++)
				{
					if(visited[i][j]==0&&arr[i][j]==1)
					{
						dfs(arr,i,j);
						count++;
					}
				}
			}
			
			output.write(String.valueOf(count)+"\n");
			count=0;
			
		}
		output.close();
	}
}
