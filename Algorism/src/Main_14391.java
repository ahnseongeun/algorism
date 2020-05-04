import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_14391 {
		static StringBuilder sb=new StringBuilder();
		static int n;
		static int m;
		static int arr[][];
		static int visited[];
		static int total=0;
		static void sum()
		{
			int t1 = 0;
			int sum1=0;
			int count=1;
			//가로 합
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=m;j++)
				{
					if(visited[count]==0)
					{
						
						if(t1==0)
						t1+=arr[i][j];
						else
						{
							t1*=10;
							t1+=arr[i][j];
						}
					}
					else
					{
						sum1+=t1;
						t1=0;
					}
					count++;
				}
				sum1+=t1;
				t1=0;
			}
			
			count=1;
			//세로 합
			for(int i=1;i<=m;i++)
			{
					count=i;
				for(int j=1;j<=n;j++)
				{
					if(visited[count]==1)
					{
						
						if(t1==0)
						t1+=arr[j][i];
						else
						{
							t1*=10;
							t1+=arr[j][i];
						}
					}
					else
					{
						sum1+=t1;
						t1=0;
					}
					count+=m;
				}
				sum1+=t1;
				t1=0;
			}
				
			if(total<sum1)
			{
				total=sum1;
			}
		}
		static void search(int index)
		{
			if(index==n*m+1)
			{
				sum();
			//	for(int i=1;i<=n*m;i++)
				//	sb.append(visited[i]+" ");
			//	sb.append("\n");
				return;
			}
				visited[index]=0;
				search(index+1);
				visited[index]=1;
				search(index+1);
		}
	public static void main(String[] args) throws Exception{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(input.readLine());
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		arr=new int[n+1][m+1];
		visited=new int[n*m+1];
		for(int i=1;i<=n;i++)
		{
			String str=input.readLine();
			for(int j=1;j<=m;j++)
			{
				arr[i][j]=(str.charAt(j-1)-'0');
			}
		}
		search(1);
		//System.out.println(sb);
		System.out.println(total);
		// TODO Auto-generated method stub
	}

}
