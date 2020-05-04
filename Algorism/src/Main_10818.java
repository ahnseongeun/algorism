import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_10818 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(input.readLine());
		StringTokenizer st=new StringTokenizer(input.readLine());
		int max=Integer.parseInt(st.nextToken());
		int min=max;
		for(int i=2;i<=n;i++)
		{
			int a=Integer.parseInt(st.nextToken());
			if(a>max)
				max=a;
			if(a<min)
				min=a;
		}
		output.write(min+" "+max);
		output.close();
		// TODO Auto-generated method stub

	}

}
