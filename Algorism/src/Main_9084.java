import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_9084 {

	public static void main(String[] args) throws IOException{
		BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output= new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n=Integer.parseInt(input.readLine());
		for(int i=1;i<=n;i++)
		{
			int m=Integer.parseInt(input.readLine());
			int arr[]=new int[m+1];
			st=new StringTokenizer(input.readLine());
			for(int j=1;j<=m;j++)
			{
				arr[j]=Integer.parseInt(st.nextToken()); //차례대로 동전이 들어있다.
			}
			
			int total=Integer.parseInt(input.readLine()); 
			int dp[]=new int[total+1];
			
			
			
		}
		
		
		
		
		// TODO Auto-generated method stub

	}

}
