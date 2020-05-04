import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Quick_sort_practice {
	static int order=0;
	public static void quicksort(int[] arr,int low,int high) {
		if(low>=high)
			return;
		int mid=partition(arr,low,high); //mid가 n=5일경우 mid+1을 하게되면 overflow가 일어나서 그것을 제지해줘야한다.
		if(mid==order) return;
		if(order<mid)
		quicksort(arr,low,mid-1);
		if(order>mid)
		quicksort(arr,mid+1,high);		
	}
	public static int partition(int[] arr,int low,int high)
	{
		int mid=(low+high)/2;
		swap(arr,low,mid);
		
		int pivot= arr[low]; int left=low; int right=high;
		while(left<right)
		{
			while(pivot<arr[right]) //이것을 먼저하는 이유가 right의 결정을 보고 아래 left<right을 결정하기위해서 순서가 중요하다.
				right--;
			while(left<right&&pivot>=arr[left]) //pivot>=arr[left] =->의 표시가 같은수가 중복일 경우를 다음으로 통과시킨다.
				left++;
			swap(arr,left,right);		
		}
		arr[low]=arr[left];
		arr[left]=pivot;
		return left;
	}
	public static void swap(int[] arr,int low,int mid)
	{
		int temp= arr[low];
		arr[low]=arr[mid];
		arr[mid]=temp;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st=new StringTokenizer(input.readLine());
		
		int n=Integer.parseInt(st.nextToken());
		order=Integer.parseInt(st.nextToken());
		int arr[]=new int[n+1];
		st=new StringTokenizer(input.readLine());
		for(int i=1;i<=n;i++)
			arr[i]=Integer.parseInt(st.nextToken());
		quicksort(arr,1,n);
		System.out.println(arr[order]);
		// TODO Auto-generated method stub

	}

}
