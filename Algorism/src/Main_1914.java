import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main_1914 {
	static int count=0;
	static int count1=0;
	void hanoi(int n,char start,char mid,char end)
	{
		if(count1==0)
		{
			System.out.println(multi(n));
			count1++;
		}
		if(n==1)
		{
			System.out.println(start+" "+end);
			//System.out.println(n+":  "+start+" -> "+end);
			count++;
		}
		else
		{
			hanoi(n-1,start,end,mid);
			count++;
			System.out.println(start+" "+end);
			//System.out.println(n+":  "+start+" -> "+end);
			hanoi(n-1,mid,start,end);
		}
	}
	
	int multi(int k)
	{
		int sum=1;
		for(int i=0;i<k;i++)
			sum= sum*2;
		return sum-1;
		
	}
	
	BigInteger multi1(int k,BigInteger sum)
	{
		long b=2;
		for(int i=0;i<k;i++)
			sum=sum.multiply(BigInteger.valueOf(b));
		return sum.subtract(BigInteger.valueOf(1));
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int num= Integer.parseInt(input.readLine()); //2
		    
		
		Main_1914 main1=new Main_1914();
		BigInteger big =new BigInteger("1");
		
		if(num<21)
		main1.hanoi(num,'1','2','3');
		else
		{
			System.out.println(main1.multi1(num,big));
		}
		
	}
}
