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
			for(int i=1;i<index;i++) //���⼭ �� ����
			{
				if(result[index]==result[i]) //�������� �������� ������Ѵ�. �̷��� �ϸ� �밢���� �������� ���� ���� ����
					return false;
				if(Math.abs(index-i)==Math.abs(result[index]-result[i]))//�밢���� ������ �����ϴ� ���
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
