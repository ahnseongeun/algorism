import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;
import java.util.Vector;


public class Main_1168 {

	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(input.readLine());
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		
		StringBuilder sb=new StringBuilder();
		ArrayList<Integer> v=new ArrayList<Integer>();
		for(int i=1;i<=n;i++)
			v.add(i);
		int index=k-1;
		while(true)
		{
			sb.append(v.get(index));
			v.remove(index);
			if(v.size()==0)
				break;
			sb.append(", ");
			index+=k-1;
			index%=v.size();
		}
		System.out.println("<"+sb+">");
		

	}

}
