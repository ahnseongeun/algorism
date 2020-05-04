import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_2529 {
		static StringBuilder sb=new StringBuilder();
		static int n;
		static long max=0;
		static long min=Long.MAX_VALUE;
		static char ch[];
		static int arr[];
		static int a[];
		static boolean visited[];
		static void search(int index)
		{
			if(index==n+1)
			{
				//System.out.println("¿©±äµé¾î¿È?");
				for(int i=0;i<n;i++)
				{
					//if(i==n-1)
						//break;
					
					if(ch[i]=='<'&&a[i]<a[i+1])
						continue;
					else if(ch[i]=='>'&&a[i]>a[i+1])
						continue;
					else
						return;
				}
				long num=0;
				int count=0;
				for(int i=n+1;i>0;i--)
					num+=a[count++]*Math.pow(10, i-1);
				//System.out.println(num);
				if(max<num)
					max=num;
				if(min>num)
					min=num;
				return;
			}
			for(int i=0;i<10;i++)
			{
				if(visited[i]==false)
				{
					visited[i]=true;
					a[index]=arr[i];
					search(index+1);
					visited[i]=false;
				}
			}
		}
	public static void main(String[] args) throws Exception{
		  BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		  n=Integer.parseInt(input.readLine());
		  ch=new char[n];
		  arr=new int[10];
		  a=new int[10];
		  visited=new boolean[10];
		  StringTokenizer st=new StringTokenizer(input.readLine());
		  for(int i=0;i<n;i++)
			  ch[i]=st.nextToken().charAt(i);
		  for(int i=0;i<=9;i++)
			  arr[i]=i;
		  search(0);
		  System.out.println(max);
		  if(n==String.valueOf(min).length())
		  System.out.println("0"+min);
		  else
			  System.out.println(min);
	}

}
