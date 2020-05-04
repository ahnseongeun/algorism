import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_14889 {
		static StringBuilder sb=new StringBuilder();
		static int n;
		static int arr[][];
		static int a[];
		static int b[];
		static boolean c[];
		//static boolean visited[][];
		static int sum1=0;
		static int sum2=0;
		static int diff=Integer.MAX_VALUE;
		static void search(int index,int count)
		{
			if(n/2==count)
			{
				int id=1;
				int idx=1;
				for(int i=1;i<=n;i++)
				{
					if(c[i]==true)
						a[id++]=i;
					if(c[i]==false) 
						b[idx++]=i;
					
				}
				
				//sb.append(b[1]+" "+b[2]+" ");
				for(int i=1;i<idx;i++)
				{
					for(int j=1;j<=n;j++)
					{
					
						if(c[j]==true&&a[i]!=j) {
						//	sb.append(a[i]+" "+j+" ");
						sum1+=(arr[a[i]][j]);
						}
						if(c[j]==false&&b[i]!=j) {
							//sb.append(b[i]+" "+j+" ");
						sum2+=(arr[b[i]][j]);
						}
					}
				}
				
				//sb.append(" "+sum1+" "+sum2);
				//sb.append("\n");
				if(Math.abs(sum1-sum2)<diff)
					diff=Math.abs(sum1-sum2);
				//sb.append(" "+diff+"\n");
				sum1=0;
				sum2=0;
				
				return;
			}
			for(int i=index;i<=n;i++)
			{
				if(c[i]==true)
					continue;
				//visited[index][i]=true;
				//visited[i][index]=true;
				c[i]=true;
				search(i,count+1);
				c[i]=false;
				//visited[index][i]=false;
				//visited[i][index]=false;
			}
		}
		
	public static void main(String[] args) throws Exception{
		 BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		 n=Integer.parseInt(input.readLine());
		 arr=new int[n+1][n+1];
		 a=new int[n/2+1];
		 b=new int[n/2+1];
		 c=new boolean[n+1];
		// visited=new boolean[n+1][n+1];
		// for(int i=1;i<=n;i++)
		//	 visited[i][i]=true;
		 StringTokenizer st;
		 for(int i=1;i<=n;i++)
		 {
			 st=new StringTokenizer(input.readLine());
			 for(int j=1;j<=n;j++)
			 {
				 arr[i][j]=Integer.parseInt(st.nextToken());
			 }
		 }
		 c[1]=true;
		search(1,1);
		sb.append(diff+"\n");
		 System.out.println(sb);
		// TODO Auto-generated method stub

	}

}
