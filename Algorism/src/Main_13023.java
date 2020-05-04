import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_13023 {
	static int n;
	static boolean[] visited;
	//static StringBuilder sb;
	static int max=0;
	static void dfs(int start,ArrayList<Integer> list[],int count) //재귀로 해결
	{
		if(count==4)  //정답
		{
			max=count;
			return;
		}
		//sb.append(count+" ");
		//sb.append(count+" ");
		visited[start]=true;  //방문하면 체크
		for(int i=0;i<list[start].size();i++)
		{
			int next=list[start].get(i); //다음노드  
			if(visited[next]) //지나갔으면 continue
				continue;
			dfs(next,list,count+1); //아니면 dfs 실행
		}
		visited[start]=false;
	}

	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(input.readLine());
		n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		ArrayList<Integer> list[]=new ArrayList[n];
		visited=new boolean[n];
		//sb=new StringBuilder();
		for(int i=0;i<n;i++)
		{
			list[i]=new ArrayList<Integer>();
			//visited[i]=false; //초기 true  
		}
		for(int i=1;i<=m;i++)  //노드 삽입
		{
			st=new StringTokenizer(input.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			list[a].add(b);
			list[b].add(a);
		}

		int a=0;
		for(int i=0;i<n;i++)
		{
			dfs(i,list,0);
			if(max==4)
			{
				a=1;
				break;
			}
		}
		System.out.println(a);
		//System.out.println(sb);
		// TODO Auto-generated method stub

	}

}
