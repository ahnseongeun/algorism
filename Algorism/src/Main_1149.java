import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_1149 {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(input.readLine());
		int n=Integer.parseInt(st.nextToken());
		int arr[][]=new int[n+1][4];
		//int dp[][]=new int[n+1][n+1];
		
		for(int i=1;i<=n;i++)
		{
			st=new StringTokenizer(input.readLine());
			for(int j=1;j<=3;j++)
			{
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j==1)
				{
					arr[i][j]+= Math.min(arr[i-1][j+1],arr[i-1][j+2]);
				}
				else if(j==2)
				{
					arr[i][j]+= Math.min(arr[i-1][j-1],arr[i-1][j+1]);
				}
				else
				{
					arr[i][j]+= Math.min(arr[i-1][j-1],arr[i-1][j-2]);
				}
			}
		}
		int min=arr[n][1];
		for(int i=2;i<=3;i++)
		{
			if(min>arr[n][i])
			   min=arr[n][i];
		}
		output.write(String.valueOf(min));
		/*
		output.newLine();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=3;j++)
			{
				output.write(String.valueOf(arr[i][j])+" ");
			}
			output.newLine();
		}
		*/
		output.flush();
		output.close();
		
		
		// TODO Auto-generated method stub

	}

}
