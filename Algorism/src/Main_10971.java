import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_10971 {
		static int n;
		static long min=100000001;
		static int a[];
		static boolean b =true;
		static void swap(int i,int j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		static void search(int arr[][]) //다음 순열 구하는법
		{
			int left=n;
			int right=n;
			while(a[left-1]>a[left]&&left>1)
				left--;
			if(left==1)
			{
				b=false;
				return;
			}
			while(a[left-1]>a[right])
				right--;
			swap(left-1,right);
			right=n;
			while(left<right)
			{
				swap(left,right);
				left++;
				right--;
			}
		}
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		n=Integer.parseInt(input.readLine());
		int arr[][]=new int[n+1][n+1];
		a=new int[n+1];
		for(int i=1;i<=n;i++)
			a[i]=i;
		for(int i=1;i<=n;i++)
		{
			StringTokenizer st=new StringTokenizer(input.readLine());
			for(int j=1;j<=n;j++)
			{
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		int num=0;
		do{
			num=0;
		for(int i=1;i<n;i++)
			if(arr[a[i]][a[i+1]]==0)
			{
				num=100000001;
				break;
			}
			else
				num+=arr[a[i]][a[i+1]];
		if(arr[a[n]][a[1]]==0)
		{
			num=100000001;
		}
		else {
			num+=arr[a[n]][a[1]];
			if(num<min)
				min=num;
		}
		search(arr);
		
		//for(int i=1;i<=n;i++)
		//	output.write(String.valueOf(a[i])+" ");
		//output.write(String.valueOf(min));
		//output.write("\n");
		}while(b);
		
		if(min==100000001)
			min=0;
		output.write(String.valueOf(min));
		output.close();
		// TODO Auto-generated method stub
	
	}

}
