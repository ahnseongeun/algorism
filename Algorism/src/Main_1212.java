import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_1212 {

	public static void main(String[] args) throws Exception {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		String str=input.readLine();
		int a=str.charAt(0)-'0';
		while(a>1)
		{
			sb.insert(0,a%2);
			a/=2;
		}
		if(a==1||a==0)
			sb.insert(0,a);
		
		for(int i=1;i<str.length();i++)
		{
			int n=str.charAt(i)-'0';
			if(n<4)
			{
				sb.append("0");
				if(n==1)
				{
					sb.append("0"+n);
				}
				else if(n==2)
				{
					sb.append(n/2);
					sb.append(n%2);
				}
				else
				{
					sb.append(n%2);
					sb.append(n/2);
				}
			}
			else
			{
				int size=sb.length();
				while(n!=1)
				{
					sb.insert(size,n%2);
					n/=2;
				}
				sb.insert(size,n);
			}
		}
		
		System.out.println(sb);
		// TODO Auto-generated method stub

	}

}
