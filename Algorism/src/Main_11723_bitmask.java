import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main_11723_bitmask {
	static int n;
	static int num;
	static StringBuilder sb=new StringBuilder();
	/*
	static void add(int x)
	{
		num|=(1<<x-1);
	}
	static void remove(int x)
	{
		num&=~(1<<x-1);
	}
	static void check(int x)
	{
		int a=num&(1<<x-1);
			if(a>0)
				sb.append("1\n");
			else
				sb.append("0\n");
	}
	static void toggle(int x)
	{
		num^=(1<<x-1);
	}
	static void all()
	{
		for(int i=1;i<=n;i++)
			num|=(1<<i-1);
	}
	static void empty()
	{
		num=0;
	}
	*/
	public static void main(String[] args) throws Exception {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		num=0;
		n=Integer.parseInt(input.readLine());
		StringTokenizer st;
		for(int i=1;i<=n;i++)
		{
			st=new StringTokenizer(input.readLine());
			switch(st.nextToken())
			{
				case "add":
					int a=Integer.parseInt(st.nextToken());
					num|=(1<<a-1);
				break;
				case "remove":
					int b=Integer.parseInt(st.nextToken());
					num&=~(1<<b-1);
				break;
				case "check":
					int c=Integer.parseInt(st.nextToken());
					int q=num&(1<<c-1);
					if(q!=0)
						sb.append("1\n");
					else
						sb.append("0\n");
				break;
				case "toggle":
					int d=Integer.parseInt(st.nextToken());
					num^=(1<<d-1);
				break;
				case "all":
						num=(1<<20)-1; //이게 제일 중요한듯-> All 1은 이렇게 표시한다.
				break;
				case "empty":
					num=0;
				break;
				default:
			}
		}
		System.out.println(sb);
		// TODO Auto-generated method stubs

	}

}
