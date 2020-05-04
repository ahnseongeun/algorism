import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class node_3 implements Comparable<node_3>{
	int x=0;
	String y="";
	node_3(int x,String y){
		this.x=x;
		this.y=y;
	}
	@Override
	public int compareTo(node_3 o) {
		return this.x-o.x;
	}
}

public class Main_10814 {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(input.readLine());
		ArrayList<node_3> list=new ArrayList<node_3>();
		for(int i=1;i<=n;i++)
		{
			StringTokenizer st=new StringTokenizer(input.readLine());
			int a=Integer.parseInt(st.nextToken());
			String str=st.nextToken();
			node_3 node=new node_3(a,str);
			list.add(node);
		}
		Collections.sort(list);
			for(int i=1;i<=n;i++)
				output.write(list.get(i-1).x+" "+list.get(i-1).y+"\n");
			output.close();
		// TODO Auto-generated method stub

	}

}
