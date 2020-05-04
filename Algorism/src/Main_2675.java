import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_2675 {

	public static void main(String[] args) throws Exception{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(input.readLine());
		for(int i=1;i<=n;i++)
		{
			StringTokenizer st=new StringTokenizer(input.readLine());
			int a=Integer.parseInt(st.nextToken());
			String str=st.nextToken();
			
			for(int k=0;k<str.length();k++)
			{
				
				for(int j=0;j<a;j++)
				{
					output.append(str.charAt(k));
				}
			}
			output.write("\n");
			
		}
		output.close();
		
		// TODO Auto-generated method stub

	}

}
