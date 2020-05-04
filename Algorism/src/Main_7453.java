import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;

public class Main_7453 {
		/*
		static boolean binary_search(int a[],int target) {
			if(target<a[1]) return false;
			if(target>a[n]) return false;
			int left=1;
			int right= n;
			while(left<=right) {
				int mid=(left+right)/2;
			if(a[mid]>target)
			{
				right=mid-1;
			}else if(a[mid]==target)
			{
				return true;
			}
			else
			{
				left=mid+1;
			}
			}
			return false;
		}
		*/
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		HashMap<Long, Long> map1=new HashMap<Long, Long>();
		//HashMap<Integer, Long> map2=new HashMap<Integer, Long>();
		int n=Integer.parseInt(input.readLine());
		long count=0;
		int arr1[]=new int[n+1];
		int arr2[]=new int[n+1];
		int arr3[]=new int[n+1];
		int arr4[]=new int[n+1];
		long arr[]=new long[n*n+1];
		StringTokenizer st;
		for(int i=1;i<=n;i++)
		{
			st=new StringTokenizer(input.readLine());
			arr1[i]=Integer.parseInt(st.nextToken());
			arr2[i]=Integer.parseInt(st.nextToken());
			arr3[i]=Integer.parseInt(st.nextToken());
			arr4[i]=Integer.parseInt(st.nextToken());
		}
		
		long sum=0;
		int index=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				sum=(arr1[i]+arr2[j]);
				if(map1.containsKey(sum))
				{
					map1.put(sum, (long)map1.get(sum)+1);
				}else
				{
					map1.put(sum, (long) 1);
				}
				sum-=arr2[j];
				arr[index++]=(arr3[i]+arr4[j]);
			}
		}
			for(int i=1;i<index;i++)
			{
				long a=arr[i];
				if(map1.containsKey(-a))
				{
					//System.out.println(map2.get(a));
					count+= (long)map1.get(-a);
				}
			}
			
		System.out.println(count);
		
		
		// TODO Auto-generated method stub

	}

}
