import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_13460 {
		static StringBuilder sb=new StringBuilder();
		static int n;
		static int m;
		static int c1,c2;
		static char ch[][];
		static int dir2[]= {0,0,-1,1}; //상하좌우 x값
		static int dir1[]= {-1,1,0,0}; //상하좌우 y값
		static boolean visited[][][][];
		static int result=-1;
		
		static Queue<int []> q=new LinkedList<int []>();
		static void search(int level,int a1,int a2,int b1,int b2) //a는 R이고 b= B이다.
		{
			q.add(new int[] {level,a1,a2,b1,b2});
			visited[a1][a2][b1][b2]=true;
			while(!q.isEmpty())
			{
				int arr[]=q.poll();
				
				if(arr[0]>10)
				{
					result=-1;
					break;
				}
				if(ch[arr[1]][arr[2]]=='O'&&ch[arr[3]][arr[4]]!='O') //빨간공 먼저
				{
					result=arr[0];
					break;
				}
				
				for(int i=0;i<4;i++) //상하좌우 순서대로
				{
					int next_a1=arr[1];
					int next_a2=arr[2];
					int next_b1=arr[3];
					int next_b2=arr[4];
					while(ch[next_a1][next_a2]!='#'&&ch[next_a1][next_a2]!='O') //red ball이동
					{
						//System.out.println("띠용1");
						next_a1+=dir1[i]; next_a2+=dir2[i];
					}
					
					if(ch[next_a1][next_a2]=='#')
					{
						//System.out.println(next_a1+" "+next_a2+" "+ch[next_a1][next_a2]);
						next_a1-=dir1[i]; next_a2-=dir2[i];
					}
						//System.out.println(arr[0]+" "+next_a1+" "+next_a2);
					while(ch[next_b1][next_b2]!='#'&&ch[next_b1][next_b2]!='O') //blue ball이동
					{
						//System.out.println("띠용2");
						next_b1+=dir1[i]; next_b2+=dir2[i];
					}
					if(ch[next_b1][next_b2]=='#')
					{
						next_b1-=dir1[i]; 
						next_b2-=dir2[i];
					}
					if(next_a1==next_b1&&next_a2==next_b2)
					{
						if(ch[next_a1][next_a2]!='O') { //red_ball이 먼저 빠져나온 경우를 알수 있다.
							int sum1=Math.abs(arr[1]-next_a1)+Math.abs(arr[2]-next_a2); //red_Ball
							int sum2=Math.abs(arr[3]-next_b1)+Math.abs(arr[4]-next_b2); //blue_Ball
							if(sum1>sum2)
							{
								next_a1-=dir1[i]; next_a2-=dir2[i];
							}
							else
							{
								next_b1-=dir1[i]; next_b2-=dir2[i];
							}
						}
					}
					//System.out.println(arr[0]+" "+next_a1+" "+next_a2+" "+next_b1+" "+next_b2);
					if(visited[next_a1][next_a2][next_b1][next_b2]==false)
					{
						
						visited[next_a1][next_a2][next_b1][next_b2]=true;
						q.add(new int []{arr[0]+1,next_a1,next_a2,next_b1,next_b2});
					}
					//if(next_a1==arr[1]&&next_a2==arr[2]&&next_b1==arr[3]&&next_b2==arr[4])
					//	count++;
					//System.out.println(count);
					//if(count==4)
						//result=-1;
				}
				
			}
		}
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(input.readLine());
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		ch=new char[n+1][m+1];
		visited=new boolean[n+1][m+1][n+1][m+1];
		int a1 = 0,a2 = 0;
		int b1=0,b2=0;
		for(int i=1;i<=n;i++)
		{
			String str=input.readLine();
			for(int j=1;j<=m;j++)
			{
				
				ch[i][j]=str.charAt(j-1);
				if(str.charAt(j-1)=='R')
				{	
					a1=i;
					a2=j;
				}	
				if(str.charAt(j-1)=='B')
				{	
					b1=i;
					b2=j;
				}	
				
			}
		}
		//System.out.println(a1+" "+a2);
		//System.out.println(b1+" "+b2);
		//System.out.println(c1+" "+c2);
		search(0,a1,a2,b1,b2);
		System.out.println(result);
		
		// TODO Auto-generated method stub

	}

}
