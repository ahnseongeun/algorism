import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;
//이분 그래프-> 공통 인자를 가지면 둘이 연결되면 안된다.

public class Main_1707 {
		static int n;
		static int color[]; //0이면 미방분 1이면 a그룹 2이면 b그룹
		static void dfs(int start,ArrayList<Integer> list[],int c)
		{
			color[start]=c;
			for(int i=0;i<list[start].size();i++)
			{
				int next=list[start].get(i);
				if(color[next-1]==0)
					dfs(next-1,list,3-c);
			}
		}
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int k=Integer.parseInt(input.readLine());
		for(int i=1;i<=k;i++)
		{
			StringTokenizer st=new StringTokenizer(input.readLine());
			int v=Integer.parseInt(st.nextToken());
			int e=Integer.parseInt(st.nextToken());
			ArrayList<Integer> list[]=new ArrayList[v];
			color = new int[v];
			for(int j=0;j<v;j++)
			{
				list[j]=new ArrayList<Integer>();
				  color[j]=0; //모든 것을 0으로 초기화
			}
			for(int j=1;j<=e;j++)
			{
				st=new StringTokenizer(input.readLine());
				int a=Integer.parseInt(st.nextToken());
				int b=Integer.parseInt(st.nextToken());
				list[a-1].add(b);
				list[b-1].add(a);
			}
			for(int j=0;j<v;j++)
			{
				if(color[j]==0)
				   dfs(j,list,1); //그룹만 나누면된
			}
			boolean str= true;
			for(int j=0;j<v;j++)
			{
				for(int t=0;t<list[j].size();t++)
				{
					if(color[j]==color[list[j].get(t)-1])
						str=false;
				}
				
			}
			if(str)
				sb.append("YES\n");
			else
				sb.append("NO\n");
			
		}
		System.out.println(sb);
		
		// TODO Auto-generated method stub

	}

}
