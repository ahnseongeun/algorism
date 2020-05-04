import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main_12101 {
		static StringBuilder sb=new StringBuilder();
		static int n;
		static int k;
		static Set<String> set=new TreeSet<String>();
		static int sum=0;
		static void bfs(String str,int sum) {
			String s=str;
			if(sum>n)
				return;
			if(sum==n)
			{
				set.add(str);
				return;
			}
			for(int i=1;i<=3;i++)
			{
				s+=i;
				//System.out.println(sum+i);
				bfs(s,sum+i);
				s=str;
			}
		}
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(input.readLine());
		n=Integer.parseInt(st.nextToken());
		k=Integer.parseInt(st.nextToken());
		bfs("",0);
		int count=1;
		for(String s1:set)
		{
			if(count==k) 
			{
				for(int i=1;i<s1.length();i++)
				{
					sb.append(s1.charAt(i-1)+"+");
				}
				sb.append(s1.charAt(s1.length()-1));
			}
			count++;
		}
		if(sb.length()==0)
			System.out.println(-1);
		System.out.println(sb);
	}

}
