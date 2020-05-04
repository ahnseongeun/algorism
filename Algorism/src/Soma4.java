import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.StringTokenizer;

public class Soma4 {
		
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int n=Integer.parseInt(input.readLine());
		StringTokenizer st=new StringTokenizer(input.readLine());
		int arr[]=new int[n+1];
		for(int i=1;i<=n;i++)
		{
			arr[i]=Integer.parseInt(st.nextToken());
		}
		long sum=0;
		long max=Long.MIN_VALUE;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				sum+=arr[j];
				if(sum>max)
					max=sum;
			}
			sum=0;
		}
		System.out.println(max);
		
		// TODO Auto-generated method stub

	}

}
