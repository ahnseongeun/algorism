import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_17404_2 {
	 static int n, pmax, ans;
	    static int[][] a, dp;
	    static StringTokenizer str;
	    public static void main(String[] args) throws Exception{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        n = Integer.parseInt(br.readLine());
	        a = new int[n][3]; //a[i][j]: i��° ���� j��° ����� ĥ�� �� ���� ���
	        dp = new int[n][3]; //dp[i][j]: 0��°���� i��° ������ ĥ�� �� ���� ���(i��° ���� ������ j)
	        for(int i = 0; i<n; i++) {
	            str = new StringTokenizer(br.readLine());
	            for(int j = 0; j<3; j++) {
	                a[i][j] = Integer.parseInt(str.nextToken());            
	            }
	        }
	        pmax = 1000 * n + 1; //pmax: 0��° ���� ������ ������ �ƴ� �ٸ� ������ ĥ�� ���� �ʱⰪ
	        ans = 1000001; //ans: ��°�
	        for(int k = 0; k<3; k++) {
	            for(int i = 0; i<3; i++) {
	                if(i==k) dp[0][i] = a[0][i]; //k=0(����), k=1(�ʷ�), k=2(�Ķ�)
	                else dp[0][i] = pmax;
	            }
	            for(int i = 1; i<n; i++) {
	                dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + a[i][0];
	                dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + a[i][1];
	                dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + a[i][2];
	            }
	            for(int i = 0; i<3; i++) {
	                if(i==k) continue; //0��° ���� ĥ�� ���� ������ ���� ĥ�� ���� ���� �ʾƾ���
	                ans = Math.min(ans, dp[n-1][i]);
	            }            
	        }
	        System.out.println(ans);        
	    }

}
