import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_9613 {
	public static int gcd(int a,int b)
	{
		if(a<b)
		{
			int temp=a;
			a=b;
			b=temp;
		}
		int r=1;
		while(a%b!=0)
		{
			r=a%b;
			a=b;
			b=r;
		}
		return b;
	}

	public static void main(String[] args) throws Exception{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(input.readLine());
		for(int i=1;i<=n;i++)
		{
			long sum=0;
			StringTokenizer st=new StringTokenizer(input.readLine());
			int num=Integer.parseInt(st.nextToken());
			int arr[]=new int[num+1];
			for(int j=1;j<=num;j++)
				arr[j]=Integer.parseInt(st.nextToken());
			
			for(int j=1;j<num;j++)
			{
				for(int k=j+1;k<=num;k++)
				{
					sum+=gcd(arr[j],arr[k]);
				}
			}
				output.write(String.valueOf(sum)+"\n");
		}
		output.close();
		// TODO Auto-generated method stub

	}

}
