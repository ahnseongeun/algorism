import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_10952 {

	public static void main(String[] args) throws Exception {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder br=new StringBuilder();
		String str=null;
		while((str=input.readLine())!=null)
		{
			StringTokenizer st=new StringTokenizer(str);
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			if(a==0&&b==0)
				break;
			System.out.println(a+b);
		}
	    
		// TODO Auto-generated method stub

	}

}
