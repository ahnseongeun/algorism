import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main_8111 {
		static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(input.readLine());
		for(int i=1;i<=n;i++)
		{
			int m=Integer.parseInt(input.readLine());
			int count=1;
			BigInteger big=new BigInteger("0");
			big=big.add(BigInteger.valueOf(m));
			//System.out.println(big);
			boolean flag=false;
			while(true)
			{
				String str=big.toString();
				//System.out.println(str);
				if(str.length()>100)
				{
					System.out.println("BRAK");
					break;
				}
				if(!str.contains("1"))
				{
					big=new BigInteger("0");
					big=big.add(BigInteger.valueOf(m));
					big=big.multiply(BigInteger.valueOf(count));
					count++;
					continue;
				}
				for(int j=0;j<str.length();j++)
				{
					if(str.charAt(j)=='0'||str.charAt(j)=='1')
					{
						flag=true;
						continue;
					}else
					{
						flag=false;
						big=new BigInteger("0");
						big=big.add(BigInteger.valueOf(m));
						big=big.multiply(BigInteger.valueOf(count));
						count++;
						break;
					}
						
				}
				if(flag==true)
				{
					System.out.println(big.toString());
					break;
				}

			}
		}
		// TODO Auto-generated method stub

	}

}
