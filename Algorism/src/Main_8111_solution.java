import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Main_8111_solution {
	static StringBuilder sb=new StringBuilder();
	static boolean visited[]; //나머지 연산 중복 제거
	static int parent[];
	static Map<Integer, Character> map=new HashMap<Integer, Character>(); //해당 나머지에 0인지 1인지 판별
	
	static void bfs(int num) {
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(1);
		visited[1]=true;
		parent[1]=-1;
		while(!q.isEmpty()) {
			int a=q.poll(); //부모 나머지
			if(a==0)
			{
				break;
			}
			int arr[]=new int[2];
			arr[0]=(a*10)%num; //0을 더한 자식 나머지
			arr[1]=(a*10+1)%num; //1을 더한 자식 나머지
			for(int i=0;i<2;i++)
			{
				if(visited[arr[i]]==true)
					continue;
				parent[arr[i]]=a; //자식한테 부모가 누군지 알려줌
				visited[arr[i]]=true; //해당 나머지 방문체크
				map.put(arr[i], (char)(i+'0')); //해당 나머지 일때  0인지 1인지 체크
				q.add(arr[i]);
			}
		}
	}
	static void search(int index) {
		int idx=index;
		LinkedList<Character> list=new LinkedList<Character>();
		while(true) {
			if(idx==-1)
				break;
			list.add(map.get(idx));
			idx=parent[idx];
		}
		Collections.reverse(list);
		for(Character a:list)
			sb.append(a);
		sb.append("\n");
	}
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(input.readLine());
		for(int i=1;i<=n;i++)
		{
			visited=new boolean[20001]; //n이 최대 20000이하의 자연수 이기때문에 중복을 피할 배열만들기
			parent=new int[20001]; //n이 최대 20000이하의 자연수 이기때문에 중복을 피할 배열만들기
			int num=Integer.parseInt(input.readLine());
			if(num==1)
				sb.append("1\n");
			else {
			map.put(1, '1');
			bfs(num);
			search(0);
			}
		}
		System.out.println(sb);
		// TODO Auto-generated method stub

	}

}
