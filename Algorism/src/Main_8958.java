import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_8958 {
	static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(input.readLine());
		int arr[]=new int[81];
		for(int i=1;i<=80;i++)
		{
			arr[i]+=i+arr[i-1];
		}
		for(int i=1;i<=n;i++)
		{
			String str=input.readLine();
			int count=0;
			int sum=0;
			
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(j)=='O')
					count++;
				if(str.charAt(j)=='X')
				{
					sum+=arr[count];
					count=0;
				}
			}
			sum+=arr[count];
			count=0;
			sb.append(sum+"\n");
		}
		System.out.println(sb);
		// TODO Auto-generated method stub

	}

}
