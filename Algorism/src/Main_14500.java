import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_14500 {

	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(input.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		int arr[][]=new int[n+1][m+1];
		int max=0;
		for(int i=1;i<=n;i++) //壕伸拭 隔奄
		{
			st=new StringTokenizer(input.readLine());
			for(int j=1;j<=m;j++)
			{
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		int count=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(j+3<=m&&(arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i][j+3])>max) //けけけけ 新生稽
				{
					max=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i][j+3];
					
				}
				if(i+3<=n&&(arr[i][j]+arr[i+1][j]+arr[i+2][j]+arr[i+3][j])>max) //けけけけ 焼掘稽
				{
					max=arr[i][j]+arr[i+1][j]+arr[i+2][j]+arr[i+3][j];
					
				}
				if(j+1<=m&&i+1<=n&&(arr[i][j]+arr[i+1][j]+arr[i][j+1]+arr[i+1][j+1])>max)// 革乞
				{
					max=arr[i][j]+arr[i+1][j]+arr[i][j+1]+arr[i+1][j+1];
				}
				
				if(j+1<=m&&i+2<=n&&(arr[i][j]+arr[i+1][j]+arr[i+2][j]+arr[i+2][j+1])>max)// い切
				{
					max=arr[i][j]+arr[i+1][j]+arr[i+2][j]+arr[i+2][j+1];
				}
				
				if(j+2<=m&&i+1<=n&&(arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j])>max)// い切 噺穿
				{
					max=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j];
					
				}
				if(j+1<=m&&i+2<=n&&(arr[i][j]+arr[i][j+1]+arr[i+1][j+1]+arr[i+2][j+1])>max)// い切 噺穿
				{
					max=arr[i][j]+arr[i][j+1]+arr[i+1][j+1]+arr[i+2][j+1];
					
				}
				if(j+2<=m&&i+1<=n&&(arr[i+1][j]+arr[i+1][j+1]+arr[i+1][j+2]+arr[i][j+2])>max)// い切 噺穿
				{
					max=arr[i+1][j]+arr[i+1][j+1]+arr[i+1][j+2]+arr[i][j+2];
					
				}
				
				if(j+1<=m&&i+2<=n&&(arr[i+2][j]+arr[i+2][j+1]+arr[i+1][j+1]+arr[i][j+1])>max)// い切 企暢
				{
					max=arr[i+2][j]+arr[i+2][j+1]+arr[i+1][j+1]+arr[i][j+1];
					
				}
				if(j+2<=m&&i+1<=n&&(arr[i][j]+arr[i+1][j]+arr[i+1][j+1]+arr[i+1][j+2])>max)// い切 企暢噺穿
				{
					max=arr[i][j]+arr[i+1][j]+arr[i+1][j+1]+arr[i+1][j+2];
					
				}
				
				if(j+1<=m&&i+2<=n&&(arr[i][j]+arr[i][j+1]+arr[i+1][j]+arr[i+2][j])>max)// い切 企暢 噺穿
				{
					max=arr[i][j]+arr[i][j+1]+arr[i+1][j]+arr[i+2][j];
					
				}
				if(j+2<=m&&i+1<=n&&(arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+2])>max)// い切 企暢噺穿
				{
					max=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+2];
				}
				
				if(j+1<=m&&i+2<=n&&(arr[i][j]+arr[i+1][j]+arr[i+1][j+1]+arr[i+2][j+1])>max)// ぁい切 
				{
					max=arr[i][j]+arr[i+1][j]+arr[i+1][j+1]+arr[i+2][j+1];
				}
				if(j+2<=m&&i+1<=n&&(arr[i+1][j]+arr[i+1][j+1]+arr[i][j+1]+arr[i][j+2])>max)// ぁい切 噺穿
				{
					max=arr[i+1][j]+arr[i+1][j+1]+arr[i][j+1]+arr[i][j+2];
				}
				if(j+1<=m&&i+2<=n&&(arr[i+1][j]+arr[i+2][j]+arr[i+1][j+1]+arr[i][j+1])>max)// ぁい切 企暢
				{
					max=arr[i+1][j]+arr[i+2][j]+arr[i+1][j+1]+arr[i][j+1];
				}
				if(j+2<=m&&i+1<=n&&(arr[i][j]+arr[i][j+1]+arr[i+1][j+1]+arr[i+1][j+2])>max)// ぁい切 企暢噺穿
				{
					max=arr[i][j]+arr[i][j+1]+arr[i+1][j+1]+arr[i+1][j+2];
				}
				
				if(j+2<=m&&i+1<=n&&(arr[i+1][j]+arr[i+1][j+1]+arr[i+1][j+2]+arr[i][j+1])>max)// で切 
				{
					max=arr[i+1][j]+arr[i+1][j+1]+arr[i+1][j+2]+arr[i][j+1];
				}
				if(j+1<=m&&i+2<=n&&(arr[i+1][j]+arr[i][j+1]+arr[i+1][j+1]+arr[i+2][j+1])>max)// で切 噺穿
				{
					max=arr[i+1][j]+arr[i][j+1]+arr[i+1][j+1]+arr[i+2][j+1];
				}
				if(j+2<=m&&i+1<=n&&(arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1])>max)// ぬ切 
				{
					max=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1];
				}
				if(j+1<=m&&i+2<=n&&(arr[i][j]+arr[i+1][j]+arr[i+2][j]+arr[i+1][j+1])>max)// ぬ切 噺穿
				{
					max=arr[i][j]+arr[i+1][j]+arr[i+2][j]+arr[i+1][j+1];
				}
			}
		}
		//拙企奄,革乞,い切,ぁい切, ぬ切
		
		System.out.println(max);
		// TODO Auto-generated method stub

	}

}
