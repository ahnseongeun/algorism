import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1248 {
		static StringBuilder sb=new StringBuilder();
		static int n;
		static int result[];
		static char ch[][];
		static boolean end=false;
		
		static boolean check(int count)
		{
			int sum=0;
			for(int i=count;i>0;i--)
			{
				sum+=result[i];
				if(ch[i-1][count-1]=='+'&&sum<=0)
					return false;
				if(ch[i-1][count-1]=='-'&&sum>=0)
					return false;
				if(ch[i-1][count-1]=='0'&&sum!=0)
					return false;
			}
			return true;
		}
		static void bfs(int count)
		{
			if(end==true)
				return;
			if(count==n+1)
			{
				for(int i=1;i<=n;i++)
					sb.append(result[i]+" ");
				sb.append("\n");
				end=true;
				return ;
			}
			for(int i=-10;i<=10;i++)
			{
				result[count]=i;
				if(check(count)==true)
					bfs(count+1);
				
			}
		}
	public static void main(String[] args) throws Exception{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(input.readLine());
		ch=new char[n][n];
		String str=input.readLine();
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				ch[i][j]=str.charAt(count);
				count++;
			}
		}
		result=new int[n+1]; //결과물 출력
		bfs(1);
		System.out.println(sb);
		
		// TODO Auto-generated method stub

	}

}
