import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_1929 {
/*
 �� ���� ���� �Ҽ� �Ǻ��� �ϱ� ���� 2���� �� �� �������� ������ ������ ���� �翬�� �ð� �ʰ��Դϴ�.
 ���� ������ 100�������ε�, �� �߿� ������ �Ҽ��� ���� 78498���� �ְ�, 
 ��� �̵��� �ڽ��� �Ҽ����� �Ǻ��ϱ� ���� �ڽ��� ũ�⸸ŭ ������ ���ƾ� �Ѵٴ� ���� �˴ϴ�. 
�׷��� ���� ����� ���� ���� �� ���� ������ ���ƾ� �ϰ���? 2�� ���� �� �� �ִ� Ƚ���� �ƴմϴ�.
�Ҽ��� ������ �����ϴ� ������� ���� ������ ������, �� �� ���� �����ϸ鼭�� �ð� ���⵵�� ũ�� ������ų �� �ִ� ���� �� ���� �����ٱ����� ������� ���Դϴ�. 
��, i * i <= n�� �������� ������ ���鼭 �ϳ��� ������ �������� ���� ������ �Ҽ��� �ƴϰ�, ������ �Ҽ��Դϴ�.
 �� �׷����? ���� � �ڿ��� x�� sqrt(x)���� ū ���μ��� �����Ѵٸ�, x�� sqrt(x)�� ���� ���� sqrt(x)���� �۾ƾ� �ϱ� ������, 
 2���� ���������� i�� ������Ű�� ���� �̹� �� ���� ��������� ���̱� �����Դϴ�.
*/
	public static void main(String[] args) throws Exception{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		StringTokenizer st=new StringTokenizer(input.readLine());
		int start=Integer.parseInt(st.nextToken());
		int end=Integer.parseInt(st.nextToken());
		int bound=(int)Math.sqrt(end);
		if(start<=2)
		{
			sb.append("2\n3\n");
		}
		else if(start==3)
		{
			sb.append("3\n");
		}
			for(int i=start;i<=end;i++)
			{
				for(int j=2;j<=(int)Math.sqrt(i);j++)
				{
					if(i%j==0)
						break;
					if(j>=(int)Math.sqrt(i))
						sb.append(i+"\n");
				}
			}
		
		// TODO Auto-generated method stub
		System.out.println(sb);
	}

}
