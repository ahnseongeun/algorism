import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_1373_1 {

	public static void main(String[] args) throws Exception{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		String str=input.readLine();
		int n=Integer.parseInt(str,2);
		System.out.println(Integer.toOctalString(n));
		//int k= Integer.toString(n, 8);
		// TODO Auto-generated method stub
	}

}
