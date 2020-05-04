import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class quick_sort {
	public static void quicksort(int[] arr,int l,int r) {
		
		int mid=(l+r)/2;
		int temp=arr[l];
		arr[l]=arr[mid];
		arr[mid]=temp;
		
		int pivot= l;
		int left=l+1;
		int right=r;
		
		while(left<right) {  //left=right를 넣어버리면 무한루프
			while(left<=r&&arr[left]<arr[pivot])//left=r일때는 left가 배열의 인덱스를 초과하지않나?
				left++;
			while(right>=pivot&&arr[right]>arr[pivot])
				right--;
			if(left<right)
			{
				temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
			}
			else//left=r일때는 left가 배열의 인덱스를 초과하지않나? 이것에 대한 해답구현
			{
				temp=arr[pivot];
				arr[pivot]=arr[right];
				arr[right]=temp;
			}
			quicksort(arr,l,right-1);
			quicksort(arr,right+1,r);
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(input.readLine());
		int arr[]=new int[n+1];
		for(int i=0;i<n;i++)
			arr[i]=Integer.parseInt(input.readLine());
		quicksort(arr,0,n-1);
		for(int i=0;i<n;i++)
			output.write(String.valueOf(arr[i])+"\n");
		output.close();
		// TODO Auto-generated method stub

	}

}
