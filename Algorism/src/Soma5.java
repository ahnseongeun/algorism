import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.StringTokenizer;

public class Soma5 {
		
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		StringTokenizer st=new StringTokenizer(input.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		long sum=0;
		ArrayList<int[]> stat=new ArrayList<int[]>();
		ArrayList<int[]> edge=new ArrayList<int[]>();
		ArrayList<Set<Integer>> team=new ArrayList<Set<Integer>>();
		
		for(int i=0;i<n;i++)
		{
			st=new StringTokenizer(input.readLine());
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			stat.add(new int[] {x,y});
		}
		
		for(int i=0;i<m;i++)
		{
			st=new StringTokenizer(input.readLine());
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			boolean check=false;
			
			for(int j=0;j<team.size();j++)
			{
				Set<Integer> list=team.get(j);
				if(list.contains(x)||list.contains(y))
				{
					list.add(x);
					list.add(y);
					check=true;
				}
			}
			if(check==false)
			{
				Set<Integer> set=new HashSet<Integer>();
				set.add(x);
				set.add(y);
				team.add(set);
				
			}
		}
		//stat은 0번 부터 //edge는 1번 부터를 고려해야함
		int total=Integer.MIN_VALUE;
		for(int i=0;i<team.size();i++)
		{
			int max_x=Integer.MIN_VALUE;
			int max_y=Integer.MIN_VALUE;
			int min_x=Integer.MAX_VALUE;
			int min_y=Integer.MAX_VALUE;
			Set<Integer> set1=team.get(i);
			for(Integer num:set1)
			{
				int a[]=stat.get(num-1);
				if(max_x<a[0])
					max_x=a[0];
				if(max_y<a[1])
					max_y=a[1];
				if(min_x>a[0])
					min_x=a[0];
				if(min_y>a[1])
					min_y=a[1];
			}
			int len=Math.abs(max_x-min_x);
			int height=Math.abs(max_y-min_y);
			if(total<2*(len+height))
				total=2*(len+height);
		}
		System.out.println(total);
		// TODO Auto-generated method stub

	}

}
