
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//[Hint] : P[i][k].profit : 최대 이득, P[i][k].belong : i번째 item의 포함유무
public class Bag_puts_backtracking {
	
	class Jew{
		int weight;
		int profit;
		Jew(int weight,int profit){
			this.weight=weight;
			this.profit=profit;
		}
	}
   

	
	public Bag_puts_backtracking() throws Exception, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("보석의 개수: ");
		int n= Integer.parseInt(input.readLine()); //아이템의 개수
		System.out.print("가방의 무게: ");
		int w= Integer.parseInt(input.readLine()); //가방의 무게
		Jew jew[]=new Jew[n+1];
		int[] include=new int[n+1];
		int[] include1=new int[n+1];
		for(int i=1;i<=n;i++)
		{
			System.out.print("보석의 무게: ");
			int wet= Integer.parseInt(input.readLine());
			System.out.print("보석의 가치: ");
			int pro= Integer.parseInt(input.readLine());
			include[i]=pro;
			include1[i]=pro;
			jew[i]=new Jew(wet,pro);
			
		}
		int count=0;
		boolean P1[][]=new boolean[n+1][w+1];
		int P2[]=new int[n+1];
		int P[][]=new int[n+1][w+1];
		//int[] include =new int[n+1];
		//int[] bestset =new int[n+1];
		
		for(int i=1;i<P.length;i++) {
			for(int j=1;j<P[i].length;j++)
			{
				//int temp=P[i][j];
				if(jew[i].weight>j) {
					P[i][j]= P[i-1][j];
				}
				else {
					
					P[i][j]= MAX(jew[i].profit+P[i-1][j-jew[i].weight],P[i-1][j],P1,i,j);
					//System.out.println(P[i][j]);
				}
				
				
			}
			
		}
		/*
		int temp=P[3][1];
		for(int i=2;i<P[3].length;i++)
		{
			if(temp!=P[3][i])
			{
				System.out.println(temp);
				temp=P[3][i];
			}
			
		}
		
		*/
		//for(int i=0;i<n;i++)
		//	System.out.println(P1[i]);
		System.out.println("max=");
	    System.out.println(P[n][w]);
	   
	    int total=P[n][w];
	   // System.out.println(total);
	    int count1=0;
	    for(int i=1;i<=n;i++)
	    {
	    	for(int j=1;j<=n;j++) {
	    	if(total-include[i]==include1[j]) {
	    		if(count1==0) {
	    		System.out.println("아이템1: "+(total-include[i]));
	    		total=total-include[i];
	    		System.out.println("아이템2: "+include1[i]);
	    		count1++;
	    		}
	    		total=total-include[i];
	    	}
	    				if(total==0)
	    				{
	    					
	    		    		
	    					break;
	    				}
	    					
	    	}
	    	}
	    }

	
	
	int MAX(int a,int b,boolean P1[][],int i,int j) {
		return a>b?a:b;
	}
	
	
	public static void main(String[] args) throws Exception {
		new Bag_puts_backtracking();
	}
}
