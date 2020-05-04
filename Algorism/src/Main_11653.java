import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_11653 {

	public static void main(String[] args) throws Exception{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(input.readLine());
		int count=2;
		if(n==1) output.write("");
		else
		while(count*count<=n)
		{
			if(n%count==0)
			{
				output.write(String.valueOf(count)+"\n");
				n/=count;
				count=1;
			}
			count++;
		}
		if(n!=1)
		output.write(String.valueOf(n));
		output.close();
		// TODO Auto-generated method stub

	}

}
