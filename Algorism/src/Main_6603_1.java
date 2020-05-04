import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_6603_1 {
		static int n;
		static int start;
		static int end;
		static BufferedWriter output;
		static void swap(int arr[],int i,int j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		static boolean next(int arr[],int i,int j) throws IOException
		{
			int left=j;
			int right=j;
			while(left>i&&arr[left-1]>arr[left])
				 left--;
			if(left<=i)
			{
				return false;
			}
			while(arr[left-1]>arr[right])
				 right--;
			swap(arr,left-1,right);
			right=j;
			while(left<right)
			{
				swap(arr,left,right);
				left++;
				right--;
			}
			
			for(int k=i;k<=j;k++)
			 output.write(String.valueOf(arr[k])+" ");
			output.write("\n");
				
			return true;
		}
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		output=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(input.readLine());
		n=Integer.parseInt(st.nextToken());
		int count=1;
		do
		{
			int arr[]=new int[n+1];
			for(int i=1;i<=n;i++)
				arr[i]=Integer.parseInt(st.nextToken());
			int size=n-5; //2
			while(size!=0) 
			{
				while(next(arr,count,count+5));
				{
					
				}
				count++;
				size--;
				Arrays.sort(arr);
			}
			st=new StringTokenizer(input.readLine());
			n=Integer.parseInt(st.nextToken());
			count=1;
		}while(n!=0);
		output.close();
		// TODO Auto-generated method stub

	}
/*
 * for(int i=1;i<=n;i++)
				output.write(String.valueOf(arr[i])+" ");
			output.write("\n");
 */
}
