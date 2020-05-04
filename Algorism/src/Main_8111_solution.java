import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Main_8111_solution {
	static StringBuilder sb=new StringBuilder();
	static boolean visited[]; //������ ���� �ߺ� ����
	static int parent[];
	static Map<Integer, Character> map=new HashMap<Integer, Character>(); //�ش� �������� 0���� 1���� �Ǻ�
	
	static void bfs(int num) {
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(1);
		visited[1]=true;
		parent[1]=-1;
		while(!q.isEmpty()) {
			int a=q.poll(); //�θ� ������
			if(a==0)
			{
				break;
			}
			int arr[]=new int[2];
			arr[0]=(a*10)%num; //0�� ���� �ڽ� ������
			arr[1]=(a*10+1)%num; //1�� ���� �ڽ� ������
			for(int i=0;i<2;i++)
			{
				if(visited[arr[i]]==true)
					continue;
				parent[arr[i]]=a; //�ڽ����� �θ� ������ �˷���
				visited[arr[i]]=true; //�ش� ������ �湮üũ
				map.put(arr[i], (char)(i+'0')); //�ش� ������ �϶�  0���� 1���� üũ
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
			visited=new boolean[20001]; //n�� �ִ� 20000������ �ڿ��� �̱⶧���� �ߺ��� ���� �迭�����
			parent=new int[20001]; //n�� �ִ� 20000������ �ڿ��� �̱⶧���� �ߺ��� ���� �迭�����
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
