import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_11004_quick_sort {

	public static void quick_sort(int[] arr,int low,int high)
	{
		int mid=(low+high)/2;
		int temp=arr[low];
		arr[low]=arr[mid];
		arr[mid]=temp;
		
		int pivot=low;
		int left=low+1;
		int right=high;
		
		while(left<right)
		{
			while(left<=high&&arr[left]<arr[pivot])
				left++;
			while(pivot<=right&&arr[right]>arr[pivot])
				right--;
			if(left<right)
			{
				temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
			}
			else
			{
				temp=arr[pivot];
				arr[pivot]=arr[right];
				arr[right]=temp;
			}
		}
		
		quick_sort(arr,low,right-1);
		quick_sort(arr,right+1,high);
		
	}
	public static void main(String[] args) throws Exception{
		 BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
	     //StringTokenizer st=new StringTokenizer(input.readLine());
	     int n=Integer.parseInt(input.readLine());
	    // int n=Integer.parseInt(st.nextToken());
	  
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=Integer.parseInt(input.readLine());
		quick_sort(arr,0,n-1);
		for(int i=0;i<n;i++)
			output.write(String.valueOf(arr[i])+"\n");
		output.close();
		// TODO Auto-generated method stub

	}

}
