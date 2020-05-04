import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_2011 {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		String str=input.readLine();
		StringBuilder sb=new StringBuilder();
		//System.out.println(str.charAt(2));
		int dp[]=new int[str.length()];
		if(str.charAt(0)=='0') {
		  dp[0]=0;
		}
		else if(str.length()==1)
		{
			dp[0]=1;
		}
		else 
		{
			dp[0]=1;
			sb.append(str.charAt(0));
		    sb.append(str.charAt(1));
		    int num=Integer.parseInt(sb.substring(0, 2));
		    if(num>=10&&num<=26)
		    	if(num==10||num==20)
		    		dp[1]=1;
		    	else
		    		dp[1]=2;
		    else if(num%10==0)
		    	dp[1]=0;
		    else
		        dp[1]=1;
		    sb.delete(0, 2);
		}
		
		
		for(int i=2;i<str.length();i++)
		{
			//arr1[i]=dp[i-1]+dp[i-2];
		    sb.append(str.charAt(i-1));
		    sb.append(str.charAt(i));
		    int num=Integer.parseInt(sb.substring(0, 2));
		    if(num>=10&&num<=26)
		    {
		    	if(num==10||num==20)
		    		dp[i]=dp[i-2]%1000000;
		    	else
		    		dp[i]=(dp[i-1]+dp[i-2])%1000000;
		    }
		    else if(num%10==0&&num>20)
		    {
		    	dp[str.length()-1]=0;
		    	break;
		    }
		    else
		    {
		    	dp[i]=dp[i-1]%1000000;
		    }
		    sb.delete(0, 2);
		 
		}
		output.write(String.valueOf(dp[str.length()-1]));
		output.close();
		
		// TODO Auto-generated method stub

	}

}
