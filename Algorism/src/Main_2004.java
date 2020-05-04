import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_2004 {
		//n!-m!의  0의 개수를 빼면 된다.
	public static void main(String[] args) throws Exception{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(input.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		int count=0;
		int count1=0;
		for(int i=1;i<=m;i++)
		{
			int c=i;
			while(c%5==0)
			{
				count++;
				c/=5;
			}
		}
		for(int i=m;i<=n;i++)
		{
			int c=i;
			while(c%5==0)
			{
				count1++;
				c/=5;
			}
		}
		int sum=count1-count;
		if(sum<0)
			sum=0;
		System.out.println(sum);
		// TODO Auto-generated method stub

	}

}
