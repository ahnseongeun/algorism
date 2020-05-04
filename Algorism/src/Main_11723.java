import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main_11723 {
	static int index=1;
	static int arr[];
	static int n;
	static ArrayList<Integer> list;
	static StringBuilder sb=new StringBuilder();
	static void add(int x)
	{
		list.add(x);
	}
	static void remove(int x)
	{
		if(list.contains(x))
		{
			list.remove(list.indexOf(x));
		}
		return;
	}
	static void check(int x)
	{
		if(list.contains(x))
			sb.append("1\n");
		else
			sb.append("0\n");
		//System.out.println(sb);
	}
	static void toggle(int x)
	{
		if(list.contains(x))
		{
			list.remove(list.indexOf(x));
		}
		else
			list.add(x);
	}
	static void all()
	{
		list.clear();
		for(int i=1;i<=20;i++)
			list.add(i);
	}
	static void empty()
	{
		list.clear();
	}
	public static void main(String[] args) throws Exception {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(input.readLine());
		StringTokenizer st;
		list=new ArrayList<Integer>();
		for(int i=1;i<=n;i++)
		{
			st=new StringTokenizer(input.readLine());
			switch(st.nextToken())
			{
				case "add":
					int a=Integer.parseInt(st.nextToken());
					add(a);
				break;
				case "remove":
					int b=Integer.parseInt(st.nextToken());
					remove(b);
				break;
				case "check":
					int c=Integer.parseInt(st.nextToken());
					check(c);
				break;
				case "toggle":
					int d=Integer.parseInt(st.nextToken());
					toggle(d);
				break;
				case "all":
					all();
				break;
				case "empty":
					empty();
				break;
				default:
			}
		}
		System.out.println(sb);
		// TODO Auto-generated method stub

	}

}
