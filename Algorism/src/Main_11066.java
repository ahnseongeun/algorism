import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_11066 {

	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(input.readLine());
		for(int i=1;i<=t;i++)
		{
			int n=Integer.parseInt(input.readLine());
			int arr[]=new int[n];
			for(int j=0;j<n;j++)
				arr[j]=Integer.parseInt(input.readLine());
			Arrays.sort(arr);
			int sum=arr[0];
			for(int k=1;k<arr.length;k++)
				sum+=arr[k];
		}
		
		// TODO Auto-generated method stub

	}

}
