import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main_1759 {
		static int n;
		static ArrayList<Character> arr; //자음
		static ArrayList<Character> ch; //모음
		static BufferedWriter output;
		static void dfs(ArrayList<Character> a,int i,int j) throws IOException
		{
			System.out.println(a.size());
			if(a.size()==n)
			{
				for(int k=1;k<=a.size();k++)
					output.write(String.valueOf(a.get(k-1)));
				output.write("\n");
				return;
			}
				
				if(arr.size()>i) 
				if(arr.get(i)<ch.get(j))
				{
					a.add(arr.get(i));
					if(arr.size()==i+1)
						dfs(a,i,j);
					else
					dfs(a,i+1,j);
				}
				if(ch.size()>j) 
				if(arr.get(i)>ch.get(j))
				{
					a.add(ch.get(j));
					if(ch.size()==j+1)
						dfs(a,i,j);
					else
					dfs(a,i,j+1);
				}
			}
		

	public static void main(String[] args) throws Exception {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		output=new BufferedWriter(new OutputStreamWriter(System.out));
		arr=new ArrayList<Character>();
		ch=new ArrayList<Character>();
		ArrayList<Character> a=new ArrayList<Character>();
		StringTokenizer st=new StringTokenizer(input.readLine());
		n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		st=new StringTokenizer(input.readLine());
		while(st.hasMoreTokens()) {
		char c=st.nextToken().charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			ch.add(c); //모음
		else
			arr.add(c); //자음
		}
		Collections.sort(ch);
		Collections.sort(arr);
		/*
		for(int j=1;j<=arr.size();j++)
			output.write(String.valueOf(arr.get(j-1)));
		output.write("\n");
		for(int j=1;j<=ch.size();j++)
			output.write(String.valueOf(ch.get(j-1)));
		output.write("\n");
		*/
		dfs(a,0,0);
		output.close();
		
		
		// TODO Auto-generated method stub

	}

}
