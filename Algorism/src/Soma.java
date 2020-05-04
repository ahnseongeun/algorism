import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Soma {
	  
		static int count=0;
		static int mid;
		public static void recur(int arr[],int k,int index) throws IOException //j는 초반 1의 값
		{
		
			if(index==1)
			{
				return;
			}
			int left=index-1;
			int right=index+1;
			if(index>k)
			{
				
				for(int i=0;i<k-1;i++)
					arr[left-i]=1;
				count++;
				
				recur(arr,k,index-k+1);
			}
			else
			{
				int num=index%k;
				
				if(index>k)
				num=index%k;
				else
				num=index-1;
				
				for(int i=0;i<num;i++)
					arr[left-i]=1;
				if(count==0) {
				for(int i=0;i<k-num-1;i++) {
					if(right+i<n) {
					arr[right+i]=1;
					mid=right+i;
					}
				}
				}
				count++;
				recur(arr,k,index-num);
				
			}		
			
		}
		
		public static void recur2 (int arr[],int k,int index)
		{
			if(index>=arr.length-1)
			{
				return;
			}
		     	int right=index+1;
					for(int i=0;i<k-1;i++)
					if(right+i<arr.length)
					arr[right+i]=1;
					count++;
					n-=(k-1);
					//System.out.println(count+" "+right);
					recur2(arr,k,index+k-1);
					
		}			
				
			
		
	public static void main(String[] args) throws Exception {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(input.readLine());
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		st=new StringTokenizer(input.readLine());
		int arr[]=new int[n+1];
		for(int i=1;i<=n;i++)
			arr[i]=Integer.parseInt(st.nextToken());
		if((n-k)%(k-1)==0)
			System.out.println((n-k)/(k-1)+1);
		else
			System.out.println(((n-k)/(k-1))+2);
		
		output.close();
		
	}
}