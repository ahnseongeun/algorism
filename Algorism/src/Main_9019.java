import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_9019 {
		static StringBuilder sb=new StringBuilder();
		static int n;
		static char visited[];
		static int visit[];
		static int tar=0;
		static int c=0;
		static void dfs(int start,int target) {
			Queue<int[]> q=new LinkedList<int[]>();
			int count=0;
			int a=start;
			q.add(new int[] {a,count});
			visited[a]='T';
			visit[a]=1;
			while(!q.isEmpty())
			{
				int arr[]=q.poll();
				a=arr[0];
				count=arr[1];
				if(a==target)
				{
					tar=a;
					c=count;
					break;
				}
					a=(a*2)%10000;
				//System.out.println(a);
				if(visited[a]=='0') //D
				{
					visit[a]=arr[0];
					visited[a]='D';
					q.add(new int [] {a,count+1});
				}
				
				a=arr[0]; 
				a--;
				if(a==-1)
					a=9999;
					
				if(visited[a]=='0') //S
				{
					visit[a]=arr[0];
					visited[a]='S';
					q.add(new int [] {a,count+1});
				}
				//¿ÞÂÊ shift
				int num=0;
				int x1=0; int x2=0; int x3=0; int x4=0; int x=0;
				a=arr[0];
				x1=a/1000;
				a-=(x1*1000);
				x2=a/100;
				a-=(x2*100);
				x3= a/10;
				a-=(x3*10);
				x4= a%10;
				num=((x2 * 10 + x3) * 10 + x4) * 10 + x1;
				if(visited[num]=='0') //L
				{
					visit[num]=arr[0];
					visited[num]='L';
					q.add(new int [] {num,count+1});
				}
				
				num=((x4 * 10 + x1) * 10 + x2) * 10 + x3;
				if(visited[num]=='0') //R
				{
					visit[num]=arr[0];
					visited[num]='R';
					q.add(new int [] {num,count+1});
				}
			}
		
		}
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(input.readLine());
		
		for(int i=1;i<=n;i++)
		{
			visited=new char[10001];
			visit=new int[10001];
			Arrays.fill(visited, '0');
			StringTokenizer st=new StringTokenizer(input.readLine());
			int start=Integer.parseInt(st.nextToken());
			int target=Integer.parseInt(st.nextToken());
			if(start==target)
			{
				sb.append("\n");
				continue;
			}
			
			dfs(start,target);
			
			int idx=c; //count
			int t=tar; //¸ñÇ¥°ª
			char arr[]=new char[c+1];
			//System.out.println(idx);
			for(int j=1;j<=c;j++)
			{
				//sb.append(t);
				arr[j]=visited[t];
				t=visit[t];
			}
			for(int j=c;j>=1;j--)
			{
				sb.append(arr[j]);
			}
			sb.append("\n");
		}
		System.out.println(sb);
		// TODO Auto-generated method stub

	}

}
