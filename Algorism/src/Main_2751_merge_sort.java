import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_2751_merge_sort {
	public static int[] sort_arr;
	public static void merge_sort(int[] arr,int low,int high) {
		if(low<high)
		{
			int mid=(low+high)/2;
			merge_sort(arr,low,mid);
			merge_sort(arr,mid+1,high);
			merge(arr,low,mid,high);
		}
	}
	public static void merge(int[] arr,int low,int mid,int high)
	{
		int low1,mid1,index;
		low1=low;
		mid1=mid+1;
		index=low;
		
		while(low1<=mid&&mid1<=high) {
			if(arr[low1]<=arr[mid1])
				sort_arr[index]=arr[low1++];
			else
				sort_arr[index]=arr[mid1++];
			index++;
		}
		
		if(low1>mid) 
		{
			for(int i=mid1;i<=high;i++)
			{
				sort_arr[index++]=arr[i];				
			}
		}
		else
		{
			for(int i=low1;i<=mid;i++)
			{
				sort_arr[index++]=arr[i];
			}
		}
		for(int i=low;i<=high;i++)
		{
			arr[i]=sort_arr[i];
		}
	}
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(input.readLine());
		int arr[]=new int[n+1];
		for(int i=1;i<=n;i++)
			arr[i]=Integer.parseInt(input.readLine());
		sort_arr=new int[n+1];
		merge_sort(arr,1,n);
		for(int i=1;i<=n;i++)
			output.write(String.valueOf(arr[i])+"\n");
		output.close();
		
		// TODO Auto-generated method stub
	}

}
