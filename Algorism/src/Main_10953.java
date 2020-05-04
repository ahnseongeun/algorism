import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_10953 {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(input.readLine());
		for(int i=1;i<=n;i++)
		{
			StringTokenizer st=new StringTokenizer(input.readLine(),",");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			System.out.println(a+b);
		}
		// TODO Auto-generated method stub

	}

}
