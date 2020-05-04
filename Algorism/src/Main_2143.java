import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main_2143 {
		
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		long total=0;
		ArrayList<Integer> list1=new ArrayList<Integer>();
		ArrayList<Integer> list2=new ArrayList<Integer>();
		int t=Integer.parseInt(input.readLine());
		int n=Integer.parseInt(input.readLine());
		int arr1[]=new int[n+1];
		StringTokenizer st=new StringTokenizer(input.readLine());
		for(int i=1;i<=n;i++)
			arr1[i]=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(input.readLine());
		int arr2[]=new int[m+1];
		st=new StringTokenizer(input.readLine());
		for(int i=1;i<=m;i++)
			arr2[i]=Integer.parseInt(st.nextToken());
		
		for(int i=1;i<=n;i++)
		{
			int sum=0;
			for(int j=i;j<=n;j++)
			{
				sum+=arr1[j];
				list1.add(sum);
			}
		}
		
		for(int i=1;i<=m;i++)
		{
			int sum=0;
			for(int j=i;j<=m;j++)
			{
				sum+=arr2[j];
				list2.add(sum);
			}
		}
		
		Collections.sort(list1);
		Collections.sort(list2);
		/*
		for(int i=0;i<list1.size();i++)
			sb.append(list1.get(i)+" ");
		sb.append("\n");
		for(int i=0;i<list2.size();i++)
			sb.append(list2.get(i)+" ");
		sb.append("\n");
		System.out.println(sb);
		*/
		//투 포인터 사용
		int left=0;
		int right=list2.size()-1;
		int size=list1.size();
		while(left<size&&right>-1)
		{
			int left_value=list1.get(left);
			int right_value=list2.get(right);
			long left_count=0;
			long right_count=0;
			if(left_value+right_value>t)
			{
				right--;
			}else if(left_value+right_value<t)
			{
				left++;
			}else { //값이 같을 경우
				while(left<size&&left_value==list1.get(left)) {
					left++;
					left_count++;
				}
				while(right>-1&&right_value==list2.get(right)) {
					right--;
					right_count++;
				}
				total+=(left_count*right_count);
			}
		}
		
		System.out.println(total);
		
		
		// TODO Auto-generated method stub

	}

}
