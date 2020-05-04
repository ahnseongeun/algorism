import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_1748 {

	public static void main(String[] args) throws Exception{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		
		String str=input.readLine(); //수 하나씩 비교
		int num=Integer.parseInt(str); //전체 수 표시
		int n=str.length(); //전체 수의 길이
		long sum=0;//결과 값 
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
