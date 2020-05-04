import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_14501 {
	static BufferedWriter output;
	static int n;
	static int max=0;
	
	static void search(int arr[][],int i,int total) throws Exception
	{
		if(i>=n+1)
		{
			if(max<total)
				max=total;
			return;
		}
		
			int t=arr[1][i]; //¼Ò¸ðµÇ´Â day¼ö
			int p=arr[2][i]; //È¹µæ Á¡¼ö
			if(i+t<=n+1)
			search(arr,i+t,total+p);
			search(arr,i+1,total);
		
	}
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		output=new BufferedWriter(new OutputStreamWriter(System.out));
		n=Integer.parseInt(input.readLine());
		int arr[][]=new int[3][n+1];
		StringTokenizer st;
		for(int i=1;i<=n;i++)
		{
			st=new StringTokenizer(input.readLine());
			int t=Integer.parseInt(st.nextToken());
			int p=Integer.parseInt(st.nextToken());
			arr[1][i]=t;
			arr[2][i]=p;
		}
		search(arr,1,0);
		output.write(String.valueOf(max));
		output.close();
			
		// TODO Auto-generated method stub

	}

}
