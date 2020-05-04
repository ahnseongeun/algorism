import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_11004 {

	public static void main(String[] args) throws Exception{
		 BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
	     StringTokenizer st=new StringTokenizer(input.readLine());
	     int n=Integer.parseInt(st.nextToken());
	     int order=Integer.parseInt(st.nextToken());
	     long arr[]=new long[n];
	     st=new StringTokenizer(input.readLine());
	     for(int i=0;i<n;i++)
	     {
	    	 arr[i]=Long.parseLong(st.nextToken());
	     }
	     Arrays.sort(arr);
	     output.write(String.valueOf(arr[order-1]));
	     output.close();
	     
		// TODO Auto-generated method stub

	}

}
