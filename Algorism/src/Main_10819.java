import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_10819 {
		static int n;
		static boolean limit=false;
		static int max=0;
		static int cal(int arr[])
		{
			int result=0;
			for(int i=1;i<n;i++)
				result+=Math.abs(arr[i]-arr[i+1]);
			return result;
		}
		static void swap(int [] arr,int i,int j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		static void next(int[] arr)
		{
			int left=arr.length-1;
			while(arr[left]<=arr[left-1]&&left>1) 
				left--;
			if(left<=1)
			{
				limit=true;
				return;
			}
			int right=arr.length-1;
			while(arr[left-1]>=arr[right])
				right--;
			swap(arr,left-1,right);
			right=arr.length-1;
			while(left<right)
			{
				swap(arr,left,right);
				left++;
				right--;
			}
			
		}
	public static void main(String[] args) throws Exception{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		n=Integer.parseInt(input.readLine());
		StringTokenizer st=new StringTokenizer(input.readLine());
		int arr[]=new int[n+1];
		for(int i=1;i<=n;i++)
			arr[i]=Integer.parseInt(st.nextToken());
		Arrays.sort(arr,1,n);
		max=cal(arr);
		while(limit==false) {
		next(arr);
		if(max<=cal(arr))
			max=cal(arr);
		/*
		for(int i=1;i<=n;i++)
			output.write(arr[i]+" ");
		output.write(String.valueOf(max)+"\n");
		*/
		}
		output.write(String.valueOf(max));
		output.close();
		// TODO Auto-generated method stub
	}

}
