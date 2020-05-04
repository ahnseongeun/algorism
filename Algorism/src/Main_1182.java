import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_1182 {
	static BufferedWriter output;
	static int n;
	static int k;
	static int sum; //합
	static int count; //전체 개수
	static int c; //전체 개수
	static void search(int arr[],int i,int level) throws Exception
	{
		if(level==n+1)
		{
			return;
		}
		for(int j=i;j<=n;j++)
		{
			sum+=arr[j];
		//	c++;
			//output.write(String.valueOf(sum)+"\n");
			if(sum==k)
				count++;
			search(arr,j+1,level+1);
			sum-=arr[j];
		}
		
	}
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		output=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(input.readLine());
		n=Integer.parseInt(st.nextToken()); //5
		k=Integer.parseInt(st.nextToken()); //0
		int arr[]=new int[n+1];
		st=new StringTokenizer(input.readLine());
		for(int i=1;i<=n;i++)
			arr[i]=Integer.parseInt(st.nextToken());
		
			sum=0;
			search(arr,1,1);
		//output.write("\n\n\n");
		//output.write(String.valueOf(c)+"\n");
		output.write(String.valueOf(count));
		output.close();
		// TODO Auto-generated method stub

	}

}
