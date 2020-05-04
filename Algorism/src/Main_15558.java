import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_15558 {
	static StringBuilder sb=new StringBuilder();
	static int arr[][];
	static boolean[][] visited;
	static int n;
	static int k;
	static void bfs() {
		Queue<int[]> q=new LinkedList<int[]>();
		boolean flag=false;
		int x=1,y=0;
		int count=1;
		q.add(new int[] {x,y,count});
		visited[y][x]=true;
		while(!q.isEmpty()) {
			int a[]=q.poll();
			x=a[0]; y=a[1];
			//a[2]= 현재 없어져야 할시간
			//count= 진행되고 있는 시간
			System.out.println(y+" "+x+" "+a[2]+" "+count);
			if(x!=count&&a[2]==count) //
			{
				arr[0][a[2]]=0;
				arr[1][a[2]]=0;
			}
			count=a[2];
			if(x>n)
			{
				sb.append("1");
				flag=true;
				break;
			}
			if(arr[y][x+1]==1)
			{
				if(visited[y][x+1]==false) {
					visited[y][x+1]=true;
				q.add(new int[] {x+1,y,count+1});
				}
			}
			if(arr[y][x-1]==1)
			{
				//System.out.println("2번");
				if(visited[y][x-1]==false) {
					visited[y][x-1]=true;
				q.add(new int[] {x-1,y,count+1});
				}
			}
			if(y==0) {
				if(arr[y+1][x+k]==1)
				{
					if(visited[y+1][x+k]==false) {
						visited[y+1][x+k]=true;
				
					q.add(new int[] {x+k,y+1,count+1});
					}
				}
			}else {
				if(arr[y-1][x+k]==1)
				{
					//System.out.println("3번");
					if(visited[y-1][x+k]==false) {
						visited[y-1][x+k]=true;
					q.add(new int[] {x+k,y-1,count+1});
					}
				}
			}
			
		}
		if(flag==false)
			sb.append("0");
	}
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(input.readLine());
		n=Integer.parseInt(st.nextToken());
		k=Integer.parseInt(st.nextToken());
		arr=new int[2][n+k+1];
		visited=new boolean[2][n+k+1];
		String str1=input.readLine();
		String str2=input.readLine();
		for(int i=1;i<=n;i++)
		{
			arr[0][i]=(str1.charAt(i-1)-'0');
			arr[1][i]=(str2.charAt(i-1)-'0');
		}
		for(int i=n+1;i<arr[0].length;i++)
		{
			arr[0][i]=1;
			arr[1][i]=1;
		}
		//sb.append("\n");
		bfs();
		System.out.println(sb);
		// TODO Auto-generated method stub

	}

}
