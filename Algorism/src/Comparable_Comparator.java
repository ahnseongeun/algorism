import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/*
 Comparable : ��ü ���� �Ϲ����� ������ �ʿ��� ��, Comparable �������̽��� Ȯ���ؼ� ������ ������ �����ϴ� compareTo() �޼��带 �����Ѵ�.
 A.compareTo(B) �� �� A<B �� ���� ������ �����ϰ�, A=B�� ���� 0�� �����ϰ�, A>B�� �� ����� �����Ѵ�.

��ó: https://jeong-pro.tistory.com/173 [�⺻�⸦ �״� ���Ƹ��߾� �ڵ���α�]
 Comparator : ��ü ���� Ư���� ������ �ʿ��� ��, Comparator �������̽��� Ȯ���ؼ� Ư�� ������ �����ϴ� compare() �޼��带 �����Ѵ�.
 
  �������� ������ ������ �����Ѵٴ� ���̰�,

  �������� ���� ������ �Ϲ����̳� �Ϲ������� �ʳĿ� compareTo(Object o) �޼��带 �����ϴ��� compare(Object o1, Object o2) �޼��带 �����ϴ��İ� ���δ�.
 */
class Node_1 implements Comparable<Node_1>{
	int x=0;
	int y=0;
	Node_1(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	public int compareTo(Node_1 object) {
		if(this.x<object.x)
			return -1;
		else if(this.x>object.x)
			return 1;
		else
		{
			if(this.y<object.y)
				return -1;
			else
				return 1;
		}
			
	}
	/*
	 Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) {
					return o1[1] - o2[1];
				}
				return o1[0] - o2[0];
			}
	 */

}	

public class Comparable_Comparator  {
	
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(input.readLine());
		ArrayList<Node_1> list=new ArrayList<Node_1>();
		for(int i=1;i<=n;i++)
		{
			StringTokenizer st=new StringTokenizer(input.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			Node_1 node=new Node_1(a,b);
			list.add(node);
		}
		Collections.sort(list);
		for(int i=1;i<=n;i++)
			output.write(String.valueOf(list.get(i-1).x)+" "+String.valueOf(list.get(i-1).y)+"\n");
		output.close();
		// TODO Auto-generated method stub

	}

}
