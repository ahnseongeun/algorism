import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_2512_binarysearch {

	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int n=Integer.parseInt(input.readLine());
		int arr[]=new int[n+1];
		StringTokenizer st=new StringTokenizer(input.readLine());
		int m=Integer.parseInt(input.readLine());
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			arr[i]=Integer.parseInt(st.nextToken());
			sum+=arr[i];
		}
		Arrays.sort(arr);
		int left=0;
		int right=sum;
		int result=0;
		while(left<=right)
		{
			sum=0;
			int mid= (left+right)/2;
			for(int i=1;i<=n;i++)
			{
				if(arr[i]<=mid)
					sum+=arr[i];
				else
					sum+=mid;
			}
			if(sum>m) //³·Ãç¼­ °è»ê
			{
				right=mid-1;
			}else
			{
				result=mid;
				left=mid+1;
			}
			
		}
		System.out.println(result);
		// TODO Auto-generated method stub

	}

}
