import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Counting_sort {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(input.readLine());
        int count[]=new int [10001];
        
        for(int i=1;i<=n;i++)
        	count[Integer.parseInt(input.readLine())]++;
        
        for(int i=1;i<=10000;i++)
        {
        	for(int j=1;j<=count[i];j++)
        	{	
        		output.write(i+"\n");
        	}
        }
        output.close();
		// TODO Auto-generated method stub

	}

}
