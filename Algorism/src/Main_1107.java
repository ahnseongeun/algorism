import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_1107 {
		StringBuilder sb=new StringBuilder();
		
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String str=input.readLine();
		int target=Integer.parseInt(str); //1555
		int n=str.length(); //target의 길이
		int max=Math.abs(target-100); //+,-로 이동할수 있는 길이 계산
		int m=Integer.parseInt(input.readLine());
		boolean remote[]=new boolean[10];
		if(m!=0) {
		StringTokenizer st=new StringTokenizer(input.readLine());
		for(int i=0;i<m;i++)
		{
			int num=Integer.parseInt(st.nextToken());
			remote[num]=true; //true면 고장난것 
		}
		}
		for(int i=0;i<=999999;i++)
		{
			String s=String.valueOf(i);
			boolean flag=false;
			int sum=0;
			for(int j=0;j<s.length();j++)
			{
				int c=s.charAt(j)-'0';
				sum++;
				if(remote[c]==true)
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				sum+=Math.abs((target-i));
				sum=Math.abs(sum);
				if(max>sum)
					max=sum;
			}
		}
		System.out.println(max);
		// TODO Auto-generated method ssfsdfsdfsfdsftub

	}

}
