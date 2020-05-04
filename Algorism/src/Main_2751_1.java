import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main_2751_1{

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(input.readLine());
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
			list.add(Integer.parseInt(input.readLine()));
		Collections.sort(list);
		for(int i=0;i<n;i++)
			output.write(list.get(i)+"\n");
		output.close();
		// TODO Auto-generated method stub
	}

}
