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
		int mid=partition(arr,low,high); //mid�� n=5�ϰ�� mid+1�� �ϰԵǸ� overflow�� �Ͼ�� �װ��� ����������Ѵ�.
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
			while(pivot<arr[right]) //�̰��� �����ϴ� ������ right�� ������ ���� �Ʒ� left<right�� �����ϱ����ؼ� ������ �߿��ϴ�.
				right--;
			while(left<right&&pivot>=arr[left]) //pivot>=arr[left] =->�� ǥ�ð� �������� �ߺ��� ��츦 �������� �����Ų��.
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
