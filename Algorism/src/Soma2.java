import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Soma2 {
		static int n;
		static int m;
		static int[][] arr;
		static boolean a; 
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		int t=Integer.parseInt(input.readLine());
		for(int k=1;k<=t;k++) {
		StringTokenizer st=new StringTokenizer(input.readLine());
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		arr=new int[n+1][m+1];
		for(int i=1;i<=n;i++)
		{
			st=new StringTokenizer(input.readLine());
			for(int j=1;j<=m;j++)
			{
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		a=true;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(arr[i][j]==0)
					continue;
				if(i<n&&j<m)
				if(arr[i][j]==1&&arr[i+1][j]==1&&arr[i][j+1]==1&&arr[i+1][j+1]==1)
				{
					continue;
				}
				
				if(i<n&&j>1)
				if(arr[i][j]==1&&arr[i+1][j]==1&&arr[i][j-1]==1&&arr[i+1][j-1]==1)
				{
					continue;
				}
				
				
				if(i>1&&j>1)
				if(arr[i][j]==1&&arr[i-1][j]==1&&arr[i-1][j-1]==1&&arr[i][j-1]==1)
				{
					continue;
				}
				
				if(i>1&&j<m)
				if(arr[i][j]==1&&arr[i-1][j]==1&&arr[i-1][j+1]==1&&arr[i][j+1]==1)
				{
					continue;
				}
				a=false;
			}
		}
		if(a==true)
		output.write("YES"+"\n");
		else
		output.write("NO"+"\n");
		}
		output.close();
		// TODO Auto-generated method stub

	}

}
