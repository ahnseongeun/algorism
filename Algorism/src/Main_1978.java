import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_1978 {

	public static void main(String[] args) throws Exception{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(input.readLine());
		StringTokenizer st=new StringTokenizer(input.readLine());
		int count=0;
		for(int i=1;i<=n;i++)
		{
			int a=Integer.parseInt(st.nextToken());
			for(int j=2;j<=a;j++)
			{
				if(a==j)
				{
					count++;
					break;
				}
				if(a%j==0)
					break;
			}
		}
		output.write(String.valueOf(count));
		output.close();
		// TODO Auto-generated method stub

	}

}
