import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main_1373 {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> list=new ArrayList<Integer>();  
		char arr[]=input.readLine().toCharArray();
		int size=arr.length;
		//8���� �ԷµǸ� 
		if(size%3==1) //1��
		{
			output.write(String.valueOf(arr[0]-'0'));
		}else if(size%3==2) //2��
		{
			output.write(String.valueOf((arr[0]-'0')*2+(arr[1]-'0')));
		} //3��
		
		for(int i=size%3;i<size;i+=3)
			output.write(String.valueOf((arr[i]-'0')*4+(arr[i+1]-'0')*2+(arr[i+2]-'0')));
		output.close();
		
	
		
		
		
		// TODO Auto-generated method stub

	}

}
