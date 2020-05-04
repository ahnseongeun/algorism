import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_10972 {
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
		while(left>1&&arr[left]<arr[left-1])
				left--;
		if(left==1)
			t=true;
		int right=arr.length-1;
		while(arr[right]<arr[left-1])
			right--;
		
		swap(arr,left-1,right);
		right=arr.length-1;
		while(left<right)
		{
			swap(arr,left,right);
			left++;
			right--;
		}
		
		if(t==true)
			output.write("-1");
		else
		{
			for(int i=1;i<=n;i++)
			output.write(String.valueOf(arr[i])+" ");
		}
		output.close();
		// TODO Auto-generated method stub
	}

}
