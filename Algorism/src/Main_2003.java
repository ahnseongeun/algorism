import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2003 {
		static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(input.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		int arr[]=new int[n+1];
		st=new StringTokenizer(input.readLine());
		for(int i=1;i<=n;i++)
			arr[i]=Integer.parseInt(st.nextToken());
		int sum=0;
		int count=0;
		/* 첫번째 방식
		
		for(int i=1;i<=n;i++)
		{
			sum=0;
			for(int j=i;j<=n;j++)
			{
				sum+=arr[j];
				if(sum==m)
				{
					count++;
					break;
				}
			}
		}
		*/
		int start=1;
		int end=1;
		while(true)
		{
			if(sum>=m)
			{
				sum-=arr[end];
				end++;
			}else if(start==n+1)
			{
				break;
			}
			else{
				sum+=arr[start];
				start++;
			}
			if(sum==m)
				count++;
		}
		System.out.println(count);
		// TODO Auto-generated method stub

	}

}
