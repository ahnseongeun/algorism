import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2609 {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		//int num= Integer.parseInt(input.readLine()); //2
		String[] str= input.readLine().split(" ");
		int a=Integer.parseInt(str[0]);
		int a1=Integer.parseInt(str[1]);
		int max=0;
		int b=0;
		int b1=0;
		int[] arr=new int[str.length];
		
		if(a>a1)
		{
			max=a;
		}
		else
			max=a1;
		
		for(int i=1;i<=max;i++)
		{
			if(a%i==0&&a1%i==0)
			{
                   b=i;
			}
		}
		
			for(int j=1;j<=max;j++)
			{
				if((a*j)%a1==0)
				{
					b1=a*j; 
					break;
				}
			}
		System.out.println(b);
		System.out.println(b1);
	}
}