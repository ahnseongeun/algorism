import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;
import java.util.Vector;

class node_10{
	int a;
	boolean flag;
	node_10(int a,boolean flag){
		this.a=a;
		this.flag=flag;
	}
}

public class Main_11025 {

	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(input.readLine());
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		
		StringBuilder sb=new StringBuilder();
		node_10 list[]=new node_10[n+1];
		for(int i=1;i<=n;i++)
			list[i]=new node_10(i,true);
		int num=0;
		int count=k;
		while(num<n)
		{
			if(list[count].flag==true) {
			list[count].flag=false;
			count+=k;
			count%=list.length;
			}
			else
			{
				
			}
			num++;
			System.out.println(list[count].a+" "+num);
		}
		//System.out.println(sb);

	}

}
