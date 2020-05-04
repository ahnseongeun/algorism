import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_2745 {

	public static void main(String[] args) throws Exception{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(input.readLine());
		int sum=0;
		String str=st.nextToken();
		int n=Integer.parseInt(st.nextToken());
		int size=str.length()-1;
		for(int i=0;i<str.length();i++)
		{
			sum *= n;
			if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
			{
				sum+=(str.charAt(i)-55);
			} else
			{
				sum+=(str.charAt(i)-'0');
			}
				
//			if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
//			{
//				sum+=(str.charAt(i)-55)*Math.pow(n, size);
//				size--;
//			}
//			else
//			{
//				sum+=(str.charAt(i)-'0')*Math.pow(n, size);
//				size--;
//			}
		}
	System.out.println(sum);
		
		// TODO Auto-generated method stub

	}

}
