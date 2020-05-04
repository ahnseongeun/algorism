import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class Main_1406_1 {
		
	public static void main(String[] args) throws Exception {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		LinkedList<Character> list=new LinkedList<Character>();
		ListIterator cursor= list.listIterator(); //¹è¿­+linkedlist
		
		char str[]=input.readLine().toCharArray();
		for(char d:str)
			cursor.add(d);
		int n=Integer.parseInt(input.readLine());
		for(int i=1;i<=n;i++)
		{
			char ch=0;
			StringTokenizer st=new StringTokenizer(input.readLine());
			ch=st.nextToken().charAt(0);
			if(ch=='L')
			{
				if(cursor.hasPrevious())
					cursor.previous();
			}else if(ch=='D')
			{
				if(cursor.hasNext())
					cursor.next();
			}else if(ch=='B')
			{
				if(cursor.hasPrevious()) {
					cursor.previous();
					cursor.remove();
				}
			}else
			{
				cursor.add(st.nextToken().charAt(0));
			}
		}
		for(char f:list)
			output.append(f);
		output.close();
		// TODO Auto-generated method stub

	}

}
