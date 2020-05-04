import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2580 {
		static StringBuilder sb=new StringBuilder();
		static int arr[][];
		static int a[][];
		static boolean exist[];
		static int count=0;
		static void check1(int col,int row) // 가로 검사
		{
			for(int i=1;i<=9;i++)
			{
				if(arr[col][i]!=0)
				exist[arr[col][i]]=true;
			}
			
		}
		static void check2(int col,int row) // 세로 검사
		{
			for(int i=1;i<=9;i++)
			{
				if(arr[i][row]!=0)
				exist[arr[i][row]]=true;
			}
		}
		static void check3(int x,int y) // 3*3 사각형 검사
		{
			int col=0;
			int row=0;
			if(x==1||x==2||x==3) col=1;
			if(x==4||x==5||x==6) col=4;
			if(x==7||x==8||x==9) col=7;
			if(y==1||y==2||y==3) row=1;
			if(y==4||y==5||y==6) row=4;
			if(y==7||y==8||y==9) row=7;
			
			
			for(int i=col;i<=col+2;i++)
			{
				for(int j=row;j<=row+2;j++)
				{
					if(arr[i][j]!=0)
						exist[arr[i][j]]=true;
				}
			}
			
		}
		static void search(int col)
		{
			//System.out.println(col);
			if(col==10)
			{
				return;
				/*
				for(int i=1;i<=9;i++)
				{
					
					for(int j=1;j<=9;j++)
					{
						sb.append(arr[i][j]+" ");
					}
					sb.append("\n");
				}
				System.out.println(sb);
				System.exit(0);
				*/
			}
			
			for(int i=1;i<=9;i++)
			{
				count++;
				if(arr[col][i]==0)
				{
					exist=new boolean[10];
					check1(col,i);
					check2(col,i);
					check3(col,i);
					for(int j=1;j<=9;j++)
						if(exist[j]==false)
							arr[col][i]=j;
				
				}
			}
			search(col+1);
		
		}
	public static void main(String[] args) throws Exception{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		arr=new int[10][10];
		a=new int[10][10];
		StringTokenizer st;
		for(int i=1;i<=9;i++)
		{
			st=new StringTokenizer(input.readLine());
			for(int j=1;j<=9;j++)
			{
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		int c1=1;
		int c2=1;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				a[c1][c2]=a[i][j];
			}
		}
			
		search(1);
		for(int i=1;i<=9;i++)
		{
			
			for(int j=1;j<=9;j++)
			{
				sb.append(arr[i][j]+" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
		// TODO Auto-generated method stub

	}

}
