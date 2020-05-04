import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_quick_sort {
	public static int partition(int arr[],int left,int right)
	{
		int pivot=arr[(left+right)/2];
		while(left<right)
		{
			while(arr[left]<pivot&&left<right)
				left++;
			while(arr[right]>pivot&&left<right)
				right--;
			if(left<right)
			{
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
			}
		}
		return left;
	}
	public static void quicksort(int arr[],int left,int right) {
		if(left<right) {
			
			if(arr[left]==arr[right])
			{
				return ;
			}
			
			int pivot_index=partition(arr,left,right);
			quicksort(arr,left,pivot_index-1);
			quicksort(arr,pivot_index+1,right);
		}
	}
	public static void main(String[] args) throws Exception{
		 BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
	     StringTokenizer st=new StringTokenizer(input.readLine());
	     //int n=Integer.parseInt(input.readLine());
	     int n=Integer.parseInt(st.nextToken());
	     int order=Integer.parseInt(st.nextToken());
	     int arr[]=new int[n];
	     st=new StringTokenizer(input.readLine());
	     for(int i=0;i<n;i++)
	    	 arr[i]=Integer.parseInt(st.nextToken());
	    //input.close();
	     quicksort(arr,0,n-1);
	     output.write(String.valueOf(arr[order-1]));
	     output.close();
	     
		// TODO Auto-generated method stub

	}

}
