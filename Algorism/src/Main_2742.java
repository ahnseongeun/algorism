import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_2742 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n= Integer.parseInt(input.readLine());
		for(int i=n;i>=1;i--)
		{
			output.write(i+"\n");
		}
		output.close();
		// TODO Auto-generated method stub

	}

}
