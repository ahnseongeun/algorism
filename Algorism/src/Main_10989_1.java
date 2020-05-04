
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main_10989_1 {

	 public static void main(String[] args) throws IOException {
		    BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	        int N = Integer.parseInt(input.readLine());

	        int[] count = new int[10001];

	        for (int i = 0; i < N; i++) {
	            int a =  Integer.parseInt(input.readLine());
	            if(a >= 1 && a <= 10000)
	                count[a]++;
	        }

	        for (int i = 0; i <= 10000; i++) {  //이거 원리가 뭐지?
	            for (int j = 0; j < count[i]; j++) {
	                bw.write(i + "\n");
	            }
	        }

	        bw.close();
	       
	    }
}
