import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_11005 {

	public static void main(String[] args) throws Exception{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(input.readLine());
		int n=Integer.parseInt(st.nextToken());
		int b=Integer.parseInt(st.nextToken());
		if(n<=b) //진법이 더큰 경우
		{
			if(n<=9)
			output.write(String.valueOf(n));
			else
			{
				output.write((char)n+55);
			}
		}
		else
		{
			ArrayList<Integer> list=new ArrayList<Integer>();
			while(true)
			{
				list.add(n%b);
				n/=b;
				if(n<b)
				{
					list.add(n);
					break;
				}
			}
			for(int i=list.size()-1;i>=0;i--)
			{
				int result=list.get(i);
				if(result<10)
				{
					output.write(String.valueOf(result));
				}
				else {
					output.write((char)result+55);
				}
			}
		}
		output.close();
		// TODO Auto-generated method stub
    
	}

}
