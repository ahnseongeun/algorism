import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main_9328_solution {
	static StringBuilder sb=new StringBuilder();
	static Set<Character> key;
	static Map<Character, ArrayList<int []>> door;
	static char arr[][];
	static boolean visited[][];
	static int x;
	static int y;
	static int count;
	static int dx[]= {0,0,-1,1}; //»óÇÏÁÂ¿ì
	static int dy[]= {-1,1,0,0}; //»óÇÏÁÂ¿ì
	
	static void bfs(int a1,int b1) {
		Queue<int[]> q=new LinkedList<int[]>();
		q.add(new int[] {a1,b1});
		visited[0][0]=true;
		while(!q.isEmpty()) {
			int a[]=q.poll();
			int y1=a[0];
			int x1=a[1];
			
			for(int i=0;i<=3;i++)
			{
				int next_y=y1+dy[i];
				int next_x=x1+dx[i];
				if(next_x<0||next_x>(x+1)||next_y<0||next_y>(y+1))
					continue;
				if(visited[next_y][next_x]==true)
					continue;
				visited[next_y][next_x]=true;
				
				
				if(arr[next_y][next_x]=='*')
					continue;
				if(arr[next_y][next_x]=='.')
				{
					q.add(new int[] {next_y,next_x});
				}
				else if(arr[next_y][next_x]=='$'){
					count++;
					q.add(new int[] {next_y,next_x});
				}else if(arr[next_y][next_x]>='a'&&arr[next_y][next_x]<='z') {
					char k=arr[next_y][next_x];
					q.add(new int[] {next_y,next_x});
					key.add(k);
					if(door.containsKey((char)(k-32)))
					{
						ArrayList<int[]> list=door.get((char)(k-32));
						for(int j=0;j<list.size();j++)
						{
							arr[list.get(j)[0]][list.get(j)[1]]='.';
							q.add(new int[] {list.get(j)[0],list.get(j)[1]});
						}
					}
				}else  { //if(arr[next_y][next_x]>='A'&&arr[next_y][next_x]<='Z')
					char ch=arr[next_y][next_x];
					if(key.contains((char)(ch+32)))
					{
							q.add(new int[] {next_y,next_x});
					}else {
						ArrayList<int []> list=door.get(ch);
						if(door.get(ch)==null)
							list=new ArrayList<int[]>();
						list.add(new int[] {next_y,next_x});
						door.put(ch,list);
					
					
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
			visited=new boolean[y+2][x+2];
			count=0;
			key=new HashSet<Character>();
			door=new HashMap<Character,ArrayList<int[]>>();
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
			bfs(0,0);
			
			sb.append(count+"\n");
			
		}
		System.out.println(sb);
		// TODO Auto-generated method stub

	}

}
