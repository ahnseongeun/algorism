import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main_1208 {
		static StringBuilder sb=new StringBuilder();
		static int n;
		static int m;
		static int arr[]; //초기 배열
		static ArrayList<Integer> arr1=new ArrayList<Integer>();
		static ArrayList<Integer> arr2=new ArrayList<Integer>();
		static boolean visited[]; //방문여부
		static long result=0;
		static void search(int index,int count,int len)
		{
			if(count==len+1)
			{
				int sum=0;
				for(int i=1;i<=n/2;i++)
				{
					if(visited[i]==true)
					{
						sum+=arr[i];
						//sb.append(arr[i]+" ");
					}
				}
				//sb.append("\n");
				if(sum==m)
					result++;
				arr1.add(sum);
				return;
			}
			for(int i=index;i<=n/2;i++)
			{
				if(visited[i]==false)
				{
					visited[i]=true;
					search(i,count+1,len);
					visited[i]=false;
				}
			}
		}
		
		static void search1(int index,int count,int len)
		{
			if(count==len+1)
			{
				int sum=0;
				for(int i=(n/2+1);i<=n;i++)
				{
					if(visited[i]==true)
					{
						sum+=arr[i];
						//sb.append(arr[i]+" ");
					}
				}
				//sb.append("\n");
				if(sum==m)
					result++;
				arr2.add(sum);
				return;
			}
			
			for(int i=index;i<=n;i++)
			{
				if(visited[i]==false)
				{
					visited[i]=true;
					search1(i,count+1,len);
					visited[i]=false;
				}
			}
		}
		
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(input.readLine());
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken()); //목표 값
		int num=(int) Math.pow(2, (n+1)/2);
		arr=new int[n+1];
		visited=new boolean[n+1];
		st=new StringTokenizer(input.readLine());
		for(int i=1;i<=n;i++)
		{
			arr[i]=Integer.parseInt(st.nextToken());
		}
		for(int i=1;i<=n/2+1;i++) //2개의 배열에 각 조합의 경우를 넣는다.
		{
			search(1,1,i); // index, count, length
			search1(n/2+1,1,i);
			visited=new boolean[n+1];
		}
		Collections.sort(arr1);
		Collections.sort(arr2);
		/*
		for(int i=0;i<arr1.size();i++)
			sb.append(arr1.get(i)+" ");
		sb.append("\n");
		for(int i=0;i<arr2.size();i++)
			sb.append(arr2.get(i)+" ");
		sb.append("\n");
		System.out.println(sb);
		*/
		System.out.println(arr1.size());
		System.out.println(arr2.size());
		int left=0;
		int right=arr2.size()-1;
	//	System.out.println(left+" "+right);
		
		while(left<arr1.size()&&right>=0) //투 포인터 사용하는 방법
		{
			int l=arr1.get(left);
			int r=arr2.get(right);
			long count1=0;
			long count2=0;
			if(l+r>m)
				right--;
			else if(l+r<m)
				left++;
			else
			{
				//좌우가 같을경우 처리하는 방법
				while(left<arr1.size()&&arr1.get(left)==l) { 
					left++;
					count1++;
				}
				while(right>=0&&arr2.get(right)==r) {
					right--;
					count2++;
				}
				result+=count1*count2;
					
			}
		
		}
		System.out.println(result);
		// TODO Auto-generated method stub

	}

}

/*
if(left==size&&right>0)
	right--;
if(right==0&&left<size)
	left++;
	*/
