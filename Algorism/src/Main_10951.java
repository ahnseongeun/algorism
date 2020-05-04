import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main_10951 {
	
	public static void main(String[] args) throws Exception{
	
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		String str=null;
		while((str=input.readLine())!=null)
		{
			StringTokenizer st=new StringTokenizer(str);
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
		    System.out.println(a+b);
		}
	   

	}


}
