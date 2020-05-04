import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

class Node_2 implements Comparable<Node_2>{
	int x=0;
	int y=0;
	Node_2(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	

	@Override
	public int compareTo(Node_2 object) {
		if(this.y==object.y)
			return this.x-object.x;
		return this.y-object.y;
	}
}

public class Main_11651  {
	
	public static void main(String[] args) throws Exception {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		int n=Integer.parseInt(input.readLine());
		ArrayList<Node_2> list=new ArrayList<Node_2>();
		for(int i=1;i<=n;i++)
		{
			StringTokenizer st=new StringTokenizer(input.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			Node_2 node=new Node_2(a,b);
			list.add(node);
		}
		Collections.sort(list);
		for(int i=1;i<=n;i++)
			output.write(list.get(i-1).x+" "+list.get(i-1).y+"\n");
		output.close();
		// TODO Auto-generated method stub

	}

}
