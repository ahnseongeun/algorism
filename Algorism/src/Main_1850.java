import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1850 {

	public static void main(String[] args) throws Exception{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(input.readLine());
		long a=Long.parseLong(st.nextToken());
		long b=Long.parseLong(st.nextToken());
		if(a<b)
		{
			long temp=a;
			a=b;
			b=temp;
		}
		long r=1;
			while(a%b!=0)
			{
				r=a%b;
				a=b;
				b=r;
			}
			/*
			for(int i=1;i<=b;i++)
				 output.write("1");
			*/ //메모리는 적게 사용하나 시간이 오래걸린다. 
			
			/*
			char[] str = new char[(int)b];
	        Arrays.fill(str, '1');
	        output.write(String.valueOf(str));
	        */ //메모리를 많이 사용하지만 시간이 적게걸린다.
		output.close();
		// TODO Auto-generated method stub

	}

}
