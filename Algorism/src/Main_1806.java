import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1806 {
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
		int len=0;
		int start=1;
		int end=1;
		int min=Integer.MAX_VALUE;
	
		while(true)
		{
			if(sum>=m)
			{
				sum -=arr[end++];
				len--;
			}else if(start==n+1)
			{
				break;
			}
			else
			{
				sum+=arr[start++];
				len++;
			}
			if(sum>=m&&min>len)
			{
				min=len;
			}
			
		}
		if(Integer.MAX_VALUE==min)
			System.out.println(0);
		else
			System.out.println(min);
		// TODO Auto-generated method stub

	}

}
