import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_1699 {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(input.readLine());
		int dp[]=new int[n+1];
		for(int i=1;i<=n;i++) //dp[i]�� ���ϰ�
		{
			dp[i]=i; //max�� �� �ִ´�?
			for(int j=1;j*j<=i;j++) //�ּҰ� �Ǵ� dp[i]�� ��ȸ �ϱ����� ���� j
			{
				if(dp[i-j*j]+1<dp[i])
				dp[i]=dp[i-j*j]+1;
			}
		}
		System.out.println(dp[n]);
		
		// TODO Auto-generated method stub

	}

}

