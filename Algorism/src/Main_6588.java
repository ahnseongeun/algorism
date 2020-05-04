import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class Main_6588{

	public static void main(String[] args) throws Exception{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> list= new ArrayList<Integer>();
		boolean bol[]=new boolean[1000001];
		list.add(3);
		Arrays.fill(bol, true);
		bol[3]=false;
		for(int i=1;i<=1000000;i++)
		{
			for(int j=2;j<=(int)Math.sqrt(i);j++)
			{
				if(i%j==0)
					break;
				if(j>=(int)Math.sqrt(i))
				{
					list.add(i);
					bol[i]=false; //소수면 false
				}
			}
		}
		//for(int i=0;i<list.size();i++)
		//	System.out.println(i+" "+list.get(i));
		
		while(true)
		{
			int n=Integer.parseInt(input.readLine()); //입력받는수
			if(n==0)
				break;
			for(int i=0;i<list.size();i++)
			{
				//if(i==list.size())
					//output.write("Goldbach's conjecture is wrong.\n");
					int a=n-list.get(i);
					if(bol[a]==false&&bol[n-a]==false) {
						output.write(String.valueOf(n)+" = "+String.valueOf(list.get(i))+" + "+String.valueOf(a)+"\n");
						break;
					}
			}
		}
		output.close();
		// TODO Auto-generated method stub

	}

}
