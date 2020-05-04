import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public abstract class Main_1525 {
		static StringBuilder sb=new StringBuilder();
		static Set<Integer> set=new HashSet<Integer>();
		static int change[]= {-3,3,-1,1}; //상하좌우
		
		static int dfs(int start)
		{
			Queue<int[]> q=new LinkedList<int[]>();
			int count=0;
			q.add(new int[] {start,count});
			set.add(start);
			int index=0;
			//System.out.println(start);
			while(!q.isEmpty()) {
				int[] num=q.poll();
				int n=num[0];
				count=num[1];
				if(n==123456789)
					return count;
			
				int[] arr=new int[9];
				for(int i=8;i>=0;i--)
				{
					if(n%10==9)
					{
						index=i; 
					}
					arr[i]=n%10;
					n/=10;
				}
				for(int i=0;i<4;i++) //상하좌우
				{
					if((index<3&&i==0)||(index>5&&i==1)||(index%3==0&&i==2)||(index%3==2&&i==3)) //범위 조건
						continue;
					int sum=0;
					for(int j=0;j<=8;j++)
					{
						if(j==index) //index는 0의 위치
						{
						sum*=10;
						sum+=arr[j+change[i]];
						}else if(j==index+change[i])
						{
							sum*=10;
							sum+=arr[index];
						}else{
							sum*=10;
							sum+=arr[j];
						}
					}
					if(!set.contains(sum))
					{
						set.add(sum);
						q.add(new int[] {sum,count+1});
					}
					//System.out.println(sum);
				}
			}
			return -1;
		}
		
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int arr[][]=new int[4][4];
		int start=0;
		for(int i=1;i<=3;i++)
		{
			st=new StringTokenizer(input.readLine());
			for(int j=1;j<=3;j++)
			{
				arr[i][j]=Integer.parseInt(st.nextToken());
				if(arr[i][j]==0)
					arr[i][j]=9;
				start*=10;
				start+=arr[i][j];
			}
		}
		System.out.println(dfs(start));
		// TODO Auto-generated method stub

	}

}
