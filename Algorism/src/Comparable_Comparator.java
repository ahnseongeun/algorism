import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/*
 Comparable : 객체 간의 일반적인 정렬이 필요할 때, Comparable 인터페이스를 확장해서 정렬의 기준을 정의하는 compareTo() 메서드를 구현한다.
 A.compareTo(B) 일 때 A<B 인 경우는 음수를 리턴하고, A=B일 때는 0을 리턴하고, A>B일 때 양수를 리턴한다.

출처: https://jeong-pro.tistory.com/173 [기본기를 쌓는 정아마추어 코딩블로그]
 Comparator : 객체 간의 특정한 정렬이 필요할 때, Comparator 인터페이스를 확장해서 특정 기준을 정의하는 compare() 메서드를 구현한다.
 
  공통점은 정렬의 기준을 정의한다는 것이고,

  차이점은 정렬 기준이 일반적이냐 일반적이지 않냐와 compareTo(Object o) 메서드를 구현하느냐 compare(Object o1, Object o2) 메서드를 구현하느냐가 전부다.
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
