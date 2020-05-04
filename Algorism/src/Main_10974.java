import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_10974 {
	public static void swap(int arr[],int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(input.readLine());
		int arr[]=new int[n+1];
		for(int i=1;i<=n;i++)
			arr[i]=i;
		
		int left=arr.length-1;
		int right=arr.length-1;
		for(int i=1;i<=n;i++)
			output.write(String.valueOf(arr[i]+" "));
			output.write("\n");
		while(true)
		{
			left=arr.length-1;
			right=arr.length-1;
			while(arr[left]<arr[left-1]&&left>1)
				left--;
			if(left==1)
				break;
			while(arr[left-1]>arr[right])
				right--;
			swap(arr,left-1,right);
			right=arr.length-1;
			while(left<right)
			{
				swap(arr,left,right);
				left++;
				right--;
			}
			for(int i=1;i<=n;i++)
			output.write(String.valueOf(arr[i]+" "));
			output.write("\n");
		}
		output.close();
		// TODO Auto-generated method stub

	}

}
