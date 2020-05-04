import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_9012_1 {
/* 아주 좋은 반례
 input= 2
    ((
   ))((
*/
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(input.readLine());
		
		for(int i=1;i<=n;i++)
		{
			Stack<Character> stack=new Stack<Character>();
			int count=0;
			String str=input.readLine();
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(j)=='(')
				stack.add(str.charAt(j));
				else if(!stack.isEmpty())
					stack.pop();
				else 
				{
					count=1;
					output.write("NO\n");
					break;
				}
					
			}
			if(count==0)
			{
			if(!stack.isEmpty())
				output.write("NO\n");
			else
				output.write("YES\n");
			}
		}
		output.close();
		// TODO Auto-generated method stub

	}

}
