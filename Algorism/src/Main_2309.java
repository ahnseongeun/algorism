import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main_2309 {

	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		int arr[]=new int[10];
		int sum=0;
		int a=0,b=0,c=0;
		for(int i=1;i<=9;i++)
		{
			arr[i]=Integer.parseInt(input.readLine());
			sum+=arr[i];
		}
		Arrays.sort(arr);
		for(int i=1;i<=9;i++)
		{
			sum-=arr[i];
			for(int j=1;j<=9;j++)
			{
				if(sum-arr[j]==100)
				{
					a=arr[i];
					b=arr[j];
					c=1;
					break;
				}
			}
			if(c==1)
				break;
			sum+=arr[i];
		}
		for(int i=1;i<=9;i++)
			if(arr[i]!=a&&arr[i]!=b)
			output.write(String.valueOf(arr[i])+"\n");
		output.close();
		// TODO Auto-generated method stub

	}

}
