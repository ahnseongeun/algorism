import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_1476 {

	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(input.readLine());
		int a=Integer.parseInt(st.nextToken());
		int b=Integer.parseInt(st.nextToken());
		int c=Integer.parseInt(st.nextToken());
		int sum=1;
		int e=0,s=0,m=0;
		while(true)
		{
			e+=1;
			s+=1;
			m+=1;
			if(e==16)
			{
				e=1;
			}
			if(s==29)
			{
				s=1;
			}
			if(m==20)
			{
				m=1;
			}
			if(e==a&&s==b&&m==c)
				break;
			sum+=1;
		}
		output.write(String.valueOf(sum));
		output.close();
		// TODO Auto-generated method stub

	}

}
