import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_10950 {

	public static void main(String[] args) throws Exception {
		BufferedReader input =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output =new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n= Integer.parseInt(input.readLine());
		for(int i=1;i<=n;i++)
		{
			st=new StringTokenizer(input.readLine());
			int a= Integer.parseInt(st.nextToken());
			int b= Integer.parseInt(st.nextToken());
			System.out.println(a+b);
			output.write((a+b)+"\n");
		}
		 output.close();
		// TODO Auto-generated method stub

	}

}
