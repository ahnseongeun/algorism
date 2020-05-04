import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main_1759_1 {
		static int n;
		static int count;
		static ArrayList<Character> arr; //자음
		static BufferedWriter output;
		static boolean check(ArrayList<Character> a,char c)
		{
			int num=a.size(); //a.size=1이면 
			while(num>0)
			{
				if(a.get(num-1)<c)
				{
					num--;
					continue;
				}
				else
				{
					return false;
				}
			}
			if(a.contains(c))
				return false;
			return true;
		}
		
		static void dfs(ArrayList<Character> a,int i,int level,int c1,int c2) throws IOException
		{ //a배열이 출력 배열
			count++;
			if(level==n&&c1>=1&&c2>=2)
			{
				for(int j=1;j<=a.size();j++)
					output.write(String.valueOf(a.get(j-1)));
				output.write("\n");
				//output.write(c1+" "+c2+"\n");
				return ;
			}
			
			for(int j=i;j<arr.size();j++)
			{
				char c=arr.get(j);		
				
				if(check(a,c)) {
				a.add(c);
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
					c1++;
				else
					c2++;
				dfs(a,i+1,level+1,c1,c2); 
				a.remove(i);
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
					c1--;
				else
					c2--;
				}
				}
			
		}
		

	public static void main(String[] args) throws Exception {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		output=new BufferedWriter(new OutputStreamWriter(System.out));
		arr=new ArrayList<Character>();
		ArrayList<Character> a=new ArrayList<Character>();
		StringTokenizer st=new StringTokenizer(input.readLine());
		n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		st=new StringTokenizer(input.readLine());
		while(st.hasMoreTokens()) {
		char c=st.nextToken().charAt(0);
		arr.add(c);
		}
		Collections.sort(arr);
		dfs(a,0,0,0,0);
		//System.out.println(count);
		output.close();
		
		
		// TODO Auto-generated method stub

	}

}
