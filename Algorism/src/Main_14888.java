import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_14888 {
		static BufferedWriter output;
		static int n;
		static int max=-1000000000;
		static int min=1000000000;
		static void swap(int oper[],int i,int j)
		{
			int temp=oper[i];
			oper[i]=oper[j];
			oper[j]=temp;
		}
		static boolean next(int arr[],int oper[],int i) throws IOException
		{
			int left=i;
			int right=i;
			while(left>1&&oper[left]<=oper[left-1])
				left--;
			if(left<=1)
				return false;
			while(oper[right]<=oper[left-1])
				right--;
			swap(oper,left-1,right);
			right=i;
			while(left<right)
			{
				swap(oper,left,right);
				left++;
				right--;
			}
			left=1;
			int sum=arr[1];
				
			while(left!=i+1)
			{
				if(oper[left]==1)//+
				{
					sum+=arr[left+1];
				}else if(oper[left]==2) //-
				{
					sum-=arr[left+1];
				}else if(oper[left]==3) //*
				{
					sum*=arr[left+1];
				}else //%
				{
					sum/=arr[left+1];
				}
				left++;
			}
			if(sum>max)
				max=sum;
			if(sum<min)
				min=sum;
			return true;
			
		}
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		output=new BufferedWriter(new OutputStreamWriter(System.out));
		n=Integer.parseInt(input.readLine());
		StringTokenizer st=new StringTokenizer(input.readLine());
		int arr[]=new int[n+1];
		int oper[]=new int[n];
		for(int i=1;i<=n;i++)
			arr[i]=Integer.parseInt(st.nextToken());
		
		st=new StringTokenizer(input.readLine());
		int count=1;
		for(int i=1;i<=4;i++)
		{
			int a=Integer.parseInt(st.nextToken());
			for(int j=1;j<=a;j++)
				oper[count++]=i;
		}
		int s=arr[1];
		for(int i=1;i<=count-1;i++)
		{
			if(oper[i]==1)//+
			{
				s+=arr[i+1];
			}else if(oper[i]==2) //-
			{
				s-=arr[i+1];
			}else if(oper[i]==3) //*
			{
				s*=arr[i+1];
			}else //%
			{
				s/=arr[i+1];
			}
		}
		if(s>max)
			max=s;
		if(s<min)
			min=s;
		while(true)
		{
			if(next(arr,oper,count-1))
				continue;
			else
				break;
		}
		output.write(String.valueOf(max)+"\n");
		output.write(String.valueOf(min));
		output.close();
		// TODO Auto-generated method stub

	}

}
