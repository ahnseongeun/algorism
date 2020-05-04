import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main_10989 {

	public static void main(String[] args) throws Exception{
		BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(input.readLine());
		int arr[]=new int[n+1];
		for(int i=0;i<n;i++)
			arr[i]=Integer.parseInt(input.readLine());
		Arrays.sort(arr);
		for(int i=0;i<n;i++)
		output.write(String.valueOf(arr[i])+"\n");
		output.close();
		// TODO Auto-generated method stub

	}

}
