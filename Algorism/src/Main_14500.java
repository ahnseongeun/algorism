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
		for(int i=1;i<=n;i++) //배열에 넣기
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
				if(j+3<=m&&(arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i][j+3])>max) //ㅁㅁㅁㅁ 옆으로
				{
					max=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i][j+3];
					
				}
				if(i+3<=n&&(arr[i][j]+arr[i+1][j]+arr[i+2][j]+arr[i+3][j])>max) //ㅁㅁㅁㅁ 아래로
				{
					max=arr[i][j]+arr[i+1][j]+arr[i+2][j]+arr[i+3][j];
					
				}
				if(j+1<=m&&i+1<=n&&(arr[i][j]+arr[i+1][j]+arr[i][j+1]+arr[i+1][j+1])>max)// 네모
				{
					max=arr[i][j]+arr[i+1][j]+arr[i][j+1]+arr[i+1][j+1];
				}
				
				if(j+1<=m&&i+2<=n&&(arr[i][j]+arr[i+1][j]+arr[i+2][j]+arr[i+2][j+1])>max)// ㄴ자
				{
					max=arr[i][j]+arr[i+1][j]+arr[i+2][j]+arr[i+2][j+1];
				}
				
				if(j+2<=m&&i+1<=n&&(arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j])>max)// ㄴ자 회전
				{
					max=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j];
					
				}
				if(j+1<=m&&i+2<=n&&(arr[i][j]+arr[i][j+1]+arr[i+1][j+1]+arr[i+2][j+1])>max)// ㄴ자 회전
				{
					max=arr[i][j]+arr[i][j+1]+arr[i+1][j+1]+arr[i+2][j+1];
					
				}
				if(j+2<=m&&i+1<=n&&(arr[i+1][j]+arr[i+1][j+1]+arr[i+1][j+2]+arr[i][j+2])>max)// ㄴ자 회전
				{
					max=arr[i+1][j]+arr[i+1][j+1]+arr[i+1][j+2]+arr[i][j+2];
					
				}
				
				if(j+1<=m&&i+2<=n&&(arr[i+2][j]+arr[i+2][j+1]+arr[i+1][j+1]+arr[i][j+1])>max)// ㄴ자 대칭
				{
					max=arr[i+2][j]+arr[i+2][j+1]+arr[i+1][j+1]+arr[i][j+1];
					
				}
				if(j+2<=m&&i+1<=n&&(arr[i][j]+arr[i+1][j]+arr[i+1][j+1]+arr[i+1][j+2])>max)// ㄴ자 대칭회전
				{
					max=arr[i][j]+arr[i+1][j]+arr[i+1][j+1]+arr[i+1][j+2];
					
				}
				
				if(j+1<=m&&i+2<=n&&(arr[i][j]+arr[i][j+1]+arr[i+1][j]+arr[i+2][j])>max)// ㄴ자 대칭 회전
				{
					max=arr[i][j]+arr[i][j+1]+arr[i+1][j]+arr[i+2][j];
					
				}
				if(j+2<=m&&i+1<=n&&(arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+2])>max)// ㄴ자 대칭회전
				{
					max=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+2];
				}
				
				if(j+1<=m&&i+2<=n&&(arr[i][j]+arr[i+1][j]+arr[i+1][j+1]+arr[i+2][j+1])>max)// ㄱㄴ자 
				{
					max=arr[i][j]+arr[i+1][j]+arr[i+1][j+1]+arr[i+2][j+1];
				}
				if(j+2<=m&&i+1<=n&&(arr[i+1][j]+arr[i+1][j+1]+arr[i][j+1]+arr[i][j+2])>max)// ㄱㄴ자 회전
				{
					max=arr[i+1][j]+arr[i+1][j+1]+arr[i][j+1]+arr[i][j+2];
				}
				if(j+1<=m&&i+2<=n&&(arr[i+1][j]+arr[i+2][j]+arr[i+1][j+1]+arr[i][j+1])>max)// ㄱㄴ자 대칭
				{
					max=arr[i+1][j]+arr[i+2][j]+arr[i+1][j+1]+arr[i][j+1];
				}
				if(j+2<=m&&i+1<=n&&(arr[i][j]+arr[i][j+1]+arr[i+1][j+1]+arr[i+1][j+2])>max)// ㄱㄴ자 대칭회전
				{
					max=arr[i][j]+arr[i][j+1]+arr[i+1][j+1]+arr[i+1][j+2];
				}
				
				if(j+2<=m&&i+1<=n&&(arr[i+1][j]+arr[i+1][j+1]+arr[i+1][j+2]+arr[i][j+1])>max)// ㅗ자 
				{
					max=arr[i+1][j]+arr[i+1][j+1]+arr[i+1][j+2]+arr[i][j+1];
				}
				if(j+1<=m&&i+2<=n&&(arr[i+1][j]+arr[i][j+1]+arr[i+1][j+1]+arr[i+2][j+1])>max)// ㅗ자 회전
				{
					max=arr[i+1][j]+arr[i][j+1]+arr[i+1][j+1]+arr[i+2][j+1];
				}
				if(j+2<=m&&i+1<=n&&(arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1])>max)// ㅜ자 
				{
					max=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1];
				}
				if(j+1<=m&&i+2<=n&&(arr[i][j]+arr[i+1][j]+arr[i+2][j]+arr[i+1][j+1])>max)// ㅜ자 회전
				{
					max=arr[i][j]+arr[i+1][j]+arr[i+2][j]+arr[i+1][j+1];
				}
			}
		}
		//작대기,네모,ㄴ자,ㄱㄴ자, ㅜ자
		
		System.out.println(max);
		// TODO Auto-generated method stub

	}

}
