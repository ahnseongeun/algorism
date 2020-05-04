import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_2580_1 {
		static StringBuilder sb=new StringBuilder();
		static int arr[][]; //초기에 값을 넣는 배열
		static ArrayList<int []> list=new ArrayList<int []>();
		static boolean check1(int y,int index) //해당 가로 검사
		{
			 for(int i=1;i<=9;i++)
				 if(arr[i][y]==index)
					 return false;
			return true;
		}
		
		static boolean check2(int x,int index) //해당 세로 검사
		{
			for(int i=1;i<=9;i++)
				 if(arr[x][i]==index)
					 return false;
			return true;
		}
		
		static boolean check3(int x,int y,int index) //해당 사각형 검사
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
					if(arr[i][j]==index)
						return false;
				}
			}
			return true;
		}
		static void sudoku(int index)
		{
			if(index==list.size())
			{
				for(int i=1;i<=9;i++) {
					for(int j=1;j<=9;j++)
						sb.append(arr[i][j]+" ");
					sb.append("\n");
				}
				System.out.println(sb);
				System.exit(0);
			}
			int x= list.get(index)[0];
			int y= list.get(index)[1];
			
			for(int i=1;i<=9;i++)
			{
				if(check1(y,i)&&check2(x,i)&&check3(x,y,i))
				{
					arr[x][y]=i;
					sudoku(index+1);
					arr[x][y]=0;
				}
			}
			
		}
		
	public static void main(String[] args) throws Exception{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		arr=new int[10][10];
		for(int i=1;i<=9;i++)
		{
			st=new StringTokenizer(input.readLine());
			for(int j=1;j<=9;j++)
			{
				arr[i][j]=Integer.parseInt(st.nextToken());
				if(arr[i][j]==0)
					list.add(new int[]{i,j});
			}
		}
		sudoku(0);
		// TODO Auto-generated method stub

	}

}
