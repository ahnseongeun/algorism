import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main_11055 {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int num= Integer.parseInt(input.readLine()); //2
		String[] str= input.readLine().split(" ");
		int[] arr=new int[str.length+1];
		int[] arr1=new int[1001];
		int[] dp=new int[1001];
		
		
		for(int i=1;i<=str.length;i++)
		{
			arr[i]=Integer.parseInt(str[i-1]);
		}
		dp[1]=arr[1];
		
		int max=0;
		for(int i=2;i<=num;i++)
		{
			dp[i]=arr[i];
			for(int j=1;j<i;j++)
			{
				
				if(arr[i]>arr[j])
				{
				arr1[j]=arr[i]+dp[j];
				}
				else
				{
					arr1[j]=arr[i];
				}
			}
			max=arr1[1];
			for(int k=2;k<i;k++)
			{
				if(arr1[k]>max)
				{
					max=arr1[k];
				}
			}
			dp[i]=max;
			for(int k=1;k<=num;k++)
			{
				arr1[k]=0;
			}
		}
		
	    int max3=dp[1];
		for(int i=1;i<=num;i++)
		{
				//System.out.print(dp[i]+" ");
			if(max3<dp[i])
			{
				max3=dp[i];
			}
		}
		System.out.println(max3);
		
		/*
		   10
           100 110 90 80 70 80 90 1 2 3
           240
		 */
		
	}
}
