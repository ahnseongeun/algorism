import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_1062 {
		static 	StringBuilder sb=new StringBuilder();
		static int n;
		static int m;
		static int result=0;
		static boolean visited[];
		static String[] str; //단어가 담겨있는 배열
		static ArrayList<Character> list;
		
		static void search(int index,int count)
		{
			if(count==m-5)
			{
				int num=0;
				for(int i=1;i<str.length;i++)
				{
					int cnt=0;
					for(int j=0;j<str[i].length();j++)
					{
						if(visited[str[i].charAt(j)-'a']==true)
						{
							cnt++;
							/* 1번 틀림
							if(cnt==str[i].length())
							{
								num++;
							}
							*/
							
						}
						else
						{
							break;
						}
					}
					/* 2번  맞음
					if(cnt==str[i].length())
					{
						num++;
					}
					*/
				}
				if(num>result)
					result=num;
				//string 배열에서 비교
				return;
			}
				
			for(int i=index;i<26;i++)
			{
				if(visited[i]==true)
					continue;
					visited[i]=true;
					search(i,count+1);
					visited[i]=false;
				
			}
		}
	public static void main(String[] args) throws Exception{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(input.readLine());
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		str=new String[n+1];
		visited=new boolean[26];
		visited['a'-'a']=true;
		visited['c'-'a']=true;
		visited['i'-'a']=true;
		visited['n'-'a']=true;
		visited['t'-'a']=true;
		if(m<5)
		{
			System.out.println(0);
			
		}
		else if(m==26)
		{
			System.out.println(n);
		}
		else {
		for(int i=1;i<=n;i++)
		{
			String s=input.readLine();
			s= s.substring(4, s.length()-4);
			str[i]=s;
			
		}
		search(0,0);
		//System.out.println(sb);
		System.out.println(result);
		}
		// TODO Auto-generated method stub

	}

}
