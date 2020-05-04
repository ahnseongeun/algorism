import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main_5396 {

	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));	
		StringBuilder bw=new StringBuilder();
		int n=Integer.parseInt(input.readLine());
		char ch=0;
		for(int i=1;i<=n;i++)
		{
			LinkedList<Character> list=new LinkedList<Character>();
			ListIterator cursor= list.listIterator();
			char str[]=input.readLine().toCharArray();
			for(int j=0;j<str.length;j++)
			{
				ch=str[j];
				if(ch=='>')
				{
					if(cursor.hasNext())
						cursor.next();
				}else if(ch=='<')
				{
					if(cursor.hasPrevious())
						cursor.previous();
				}else if(ch=='-')
				{
					if(cursor.hasPrevious()) {
						cursor.previous();
						cursor.remove();
					}
				}else
				{
					cursor.add(ch);
				}
			}
				for(Character a:list)
					bw.append(a);	
				
				bw.append("\n");
				
		}
		System.out.println(bw);
		// TODO Auto-generated method stub
	}

}
