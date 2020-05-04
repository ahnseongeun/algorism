import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Soma1 {

	public static void main(String[] args) throws Exception {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		int n=Integer.parseInt(input.readLine());
		int i=0;
		while(i<n){
			if(n-i==3)
			{
				sb.insert(0,"7");
				i+=3;
			}else
			{
				sb.append("1");
				i+=2;
			}
		}
		System.out.println(sb);
		
		
		
		// TODO Auto-generated method stub

	}

}
