
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//[Hint] : P[i][k].profit : 최대 이득, P[i][k].belong : i번째 item의 포함유무
public class Bag {
	int n;
	int W;
	char[] include;
	char[] bestset
		public void knapsack(int k,int profit,int weight)
		{
			if(weight<= W&&profit>maxprofit )
			{
				maxprofit=profit;
				for(int i=0;i<=n;i++)
					bestset[k]=include[i];
			}
			
			if(promising(i,weight))
			{
				include[i+1]='true';
				global_profit=profit+p[i+1];
				
			}
		}
		
	public Bag() throws Exception, IOException {
		int k,total_w=0,total_p=0;
		int global_profit=0;
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("보석의 개수: ");
		n= Integer.parseInt(input.readLine()); //아이템의 개수
		System.out.print("가방의 무게: ");
		W= Integer.parseInt(input.readLine()); //가방의 무게
		int[] w =new int[n+1];
		int[] p =new int[n+1];
		
		for(int i=1;i<=n;i++)
		{
			System.out.print("보석의 무게: ");
			int wet= Integer.parseInt(input.readLine());
			w[i]=wet;
			System.out.print("보석의 가치: ");
			int pro= Integer.parseInt(input.readLine());
			p[i]=pro;
		}
		include =new char[n+1];
		bestset =new char[n+1];
		
		knapsack(0,global_profit,0);
		
	}
	
	int MAX(int a,int b,boolean P1[][],int i,int j) {
		return a>b?a:b;
	}
	
	
	public static void main(String[] args) throws Exception {
		new Bag();
	}
}
