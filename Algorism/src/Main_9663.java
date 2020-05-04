import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_9663 {
		static StringBuilder sb=new StringBuilder();
		static int result[];
		static boolean visited[];
		static int n;
		static long total=0;
		static void queen(int index,int count)
		{
			if(count==n+1)
			{
				total++;
				return;
			}
			for(int i=1;i<=n;i++)
			{
				result[index]=i;
				if(check(index)==true)
				{
					//System.out.println(i+" "+result[index]);
					queen(index+1,count+1);
				}
			}
		}
		static boolean check(int index)
		{
			for(int i=1;i<index;i++) //여기서 행 제거
			{
				if(result[index]==result[i]) //이전값과 같은값이 없어야한다. 이렇게 하면 대각선이 같을때를 빼고 제거 가능
					return false;
				if(Math.abs(index-i)==Math.abs(result[index]-result[i]))//대각선이 같을때 제거하는 방법
					return false;
			}
			return true;
		}
	public static void main(String[] args) throws Exception{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(input.readLine());
		result=new int[n+1];
		queen(1,1);
		System.out.println(total);
		// TODO Auto-generated method stub
	}

}
