import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main_1676 {
	
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(input.readLine());
		int count=0;  //5 Ä«¿îÆÃ
		
		for(int i=1;i<=n;i++)
		{
			if(i%5==0)
			{
				int c=i;
				while(c%5==0)
				{
					count++;
					c/=5;
				}
			}
		}
		
		output.write(String.valueOf(count));
		output.close();
		// TODO Auto-generated method stub

	}

	
}
