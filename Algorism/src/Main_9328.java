import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main_9328{
		static StringBuilder sb=new StringBuilder();
		static Set<Character> key;
		static char arr[][];
		static int visited[][];
		static int x;
		static int result;
		static int y;
		static int dx[]= {0,0,-1,1}; //»óÇÏÁÂ¿ì
		static int dy[]= {-1,1,0,0}; //»óÇÏÁÂ¿ì
		static boolean flag;
		static void bfs() {
			Deque<int[]> q=new LinkedList<int[]>();
			q.add(new int[] {0,0,1});
			visited[0][0]=1;
			flag=false;
			while(!q.isEmpty())
			{
				int a[]=q.poll();
				int y1=a[0];
				int x1=a[1];
				int level=a[2];
				if(flag==true&&(x1==0&&y1==0)) 
				{
					continue;
				}
				flag=true;
				for(int i=0;i<=3;i++)
				{
					if(x1+dx[i]<0||x1+dx[i]>(x+1)||y1+dy[i]<0||y1+dy[i]>(y+1))
						continue;
					if(arr[y1+dy[i]][x1+dx[i]]=='*')
						continue;
					if(visited[y1+dy[i]][x1+dx[i]]==level)
						continue;
					if(arr[y1+dy[i]][x1+dx[i]]=='.')
					{
						visited[y1+dy[i]][x1+dx[i]]=level;
						q.add(new int[] {y1+dy[i],x1+dx[i],level});
						
					}
					else if(arr[y1+dy[i]][x1+dx[i]]=='$')
					{
						result++;
						visited[y1+dy[i]][x1+dx[i]]=level;
						arr[y1+dy[i]][x1+dx[i]]='.';
						q.add(new int[] {y1+dy[i],x1+dx[i],level});
						
					}
					else if(arr[y1+dy[i]][x1+dx[i]]>='a'&&arr[y1+dy[i]][x1+dx[i]]<='z')
					{
						visited[y1+dy[i]][x1+dx[i]]=level+1;
						key.add(arr[y1+dy[i]][x1+dx[i]]);
						//for(char c:key)
						//	System.out.println(c);
						arr[y1+dy[i]][x1+dx[i]]='.';
						q.clear();
						q.add(new int[] {y1+dy[i],x1+dx[i],level+1});
						
					}
					else if(arr[y1+dy[i]][x1+dx[i]]>='A'&&arr[y1+dy[i]][x1+dx[i]]<='Z')
					{
						char ch=arr[y1+dy[i]][x1+dx[i]];
						if(key.contains((char)(ch+32)))
						{
							visited[y1+dy[i]][x1+dx[i]]=level;
							arr[y1+dy[i]][x1+dx[i]]='.';
							q.add(new int[] {y1+dy[i],x1+dx[i],level});
						}
					}
					
				}
				
			}
			
		}
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(input.readLine());
		for(int k=1;k<=n;k++)
		{
			StringTokenizer st=new StringTokenizer(input.readLine());
			y=Integer.parseInt(st.nextToken());
			x=Integer.parseInt(st.nextToken());
			arr=new char[y+2][x+2];
			visited=new int[y+2][x+2];
			result=0;
			key=new HashSet<Character>();
			for(int i=0;i<=y+1;i++)
			{
				Arrays.fill(arr[i], '.');
			}
			for(int i=1;i<=y;i++)
			{
				String str=input.readLine();
				for(int j=1;j<=x;j++)
				{
					arr[i][j]=str.charAt(j-1);
				}
			}
			String str=input.readLine();
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(0)=='0')
					break;
				key.add(str.charAt(i));
			}
			bfs();
			//System.out.println(sb);
			sb.append(result+"\n");
			
		}
		System.out.println(sb);
		// TODO Auto-generated method stub

	}

}
