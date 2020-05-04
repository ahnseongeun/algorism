import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Mian_1934 {

	public static void main(String[] args) throws Exception{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(input.readLine());
		for(int i=1;i<=n;i++)
		{
			StringTokenizer st=new StringTokenizer(input.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			int sum=0;
			if(a<b)
			{
				int temp=a;
				a=b;
				b=temp;
			}
			int c=a,d=b;
			
			int r=1;
			if(a%b==0){
				sum=a;
			}
			else {
				while(a%b!=0)
				{
					r=a%b;
					a=b;
					b=r;
				}
			}
			System.out.println(r);
			if(c%d!=0)
			sum=c*d/r;
			
			output.write(String.valueOf((sum))+"\n");
		}
		output.close();
		// TODO Auto-generated method stub

	}

}
