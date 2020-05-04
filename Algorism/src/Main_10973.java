import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_10973 {
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
		StringTokenizer st=new StringTokenizer(input.readLine());
		int arr[]=new int[n+1];
		boolean t=false;
		for(int i=1;i<=n;i++)
			arr[i]=Integer.parseInt(st.nextToken());
		int left=arr.length-1;
		int right=arr.length-1;
		while(arr[left]>arr[left-1]&&left>1)
			  left--;
		if(left==1)
			t=true;
		
		while(arr[left-1]<arr[right])
			  right--;
		
		int l=left-1;
		swap(arr,l,right);
		right=arr.length-1;
		while(left<right) {
		swap(arr,left,right);
		left++;
		right--;
		}
	
		if(t==false)
		for(int i=1;i<=n;i++)
			output.write(String.valueOf(arr[i])+" ");
		else
			output.write("-1");
		output.close();
		
		// TODO Auto-generated method stub

	}

}
