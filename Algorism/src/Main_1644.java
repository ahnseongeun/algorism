import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main_1644 {
	static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(input.readLine());
		ArrayList<Integer> list= new ArrayList<Integer>();
		
		for(int i=2;i<=n;i++)
		{
			if(i==2)
			{
				list.add(2);
				continue;
			}
			if(i==3)
			{
				list.add(3);
				continue;
			}
			for(int j=2;j<=(int)Math.sqrt(i);j++)
			{
				if(i%j==0)
					break;
				if(j==(int)Math.sqrt(i))
					list.add(i);
			}
		}
		
		
		int sum=0;
		int count=0;
		int start=0;
		int end=0;
		while(true)
		{
			if(sum>=n)
			{
				sum-=list.get(end);
				end++;
			}else if(start==list.size())
			{
				break;
			}else
			{
				sum+=list.get(start);
				start++;
			}
			if(sum==n)
				count++;
		}
		System.out.println(count);
		// TODO Auto-generated method stub

	}

}
