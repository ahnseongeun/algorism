import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_1748 {

	public static void main(String[] args) throws Exception{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		
		String str=input.readLine(); //�� �ϳ��� ��
		int num=Integer.parseInt(str); //��ü �� ǥ��
		int n=str.length(); //��ü ���� ����
		long sum=0;//��� �� 
		for(int i=0;i<str.length();i++)
		{
			num-=(Math.pow(10, n-1));
			if(i==0)
				num++;
			sum+=num*n;
			num=(int) Math.pow(10, n-1);
			n--;
		}
		System.out.println(sum);
		
		
		// TODO Auto-generated method stub

	}

}
