import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_11053 {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int num= Integer.parseInt(input.readLine()); //2
		String[] str= input.readLine().split(" ");
		int[] arr=new int[str.length+1];
		int[] dp=new int[1001];
		int max=0;
		for(int i=1;i<=str.length;i++)
		{
			arr[i]=Integer.parseInt(str[i-1]);
		}
		
		 for(int i=1; i<str.length; i++){
	            dp[i]=1;
	            for(int j=1; j<=i; j++){
	                if(arr[i]>arr[j] && dp[i]<=dp[j]){
	                    dp[i]+=1;
	                    if(max<dp[i]){
	                        max = dp[i];
	                    }
	                }
	            }
	        }
		
		 System.out.println(max);
		
		
	}
}
