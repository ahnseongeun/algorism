import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_11576 {

	public static void main(String[] args) throws Exception{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		StringTokenizer st=new StringTokenizer(input.readLine());
		int a=Integer.parseInt(st.nextToken());
		int b=Integer.parseInt(st.nextToken());
		int sum=0;
		int n=Integer.parseInt(input.readLine());
		st=new StringTokenizer(input.readLine());
		int size=n-1;
		for(int i=1;i<=n;i++)
		{
			int t=Integer.parseInt(st.nextToken());
			sum+=(int) (t*Math.pow(a, size));
			size--;
		}
		while(sum>=b)
		{
			sb.insert(0,sum%b);
			sb.insert(0," ");
			sum/=b;
			if(sum<b)
			sb.insert(0,sum);
		}
		System.out.println(sb);
		// TODO Auto-generated method stub

	}

}
