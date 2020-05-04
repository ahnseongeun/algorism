import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class nodu{
	int i;
	int num;
	nodu(){};
	nodu(int i,int num)
	{
		this.i=i;
		this.num=num;
	}
}

public class Main_1697 {
	static int c;
	public static void bfs(int n,int m,int arr[]) {
		Queue<nodu> q=new LinkedList<nodu>();
		q.add(new nodu(n,0));
		int coun=0;
		while(!q.isEmpty())
		{
			nodu node=new nodu();
			node=q.poll();
			int i=node.i;
			int count=node.num;
			coun++;
			//System.out.println(i+" "+count+" "+coun);
			if(i==m)
			{
				c=count;
				break;
			}
			if(i==0)
			{
				q.add(new nodu(i+1,count+1));
				continue;
			}
			if(i<m+1&&arr[i+1]==0) {
				arr[i+1]=1;
			q.add(new nodu(i+1,count+1));
			}
			if(arr[i-1]==0&&i>=1) {
				arr[i-1]=1;
			q.add(new nodu(i-1,count+1));
			}
			if(i<m&&arr[i*2]==0) {
				arr[i*2]=1;
				q.add(new nodu(i*2,count+1));
				}
			
		}
		
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(input.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		int arr[]=new int[200000];
		bfs(n,m,arr);
		output.write(String.valueOf(c));
		output.close();
		// TODO Auto-generated method stub

	}

}
