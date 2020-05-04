import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;


public class Main_14226 {
	static int n;
	public static void dfs(int arr[][])
	{
		Queue<Integer> q=new LinkedList<Integer>();
		int count=0;
		q.add(1); //ȭ��
		q.add(0); //Ŭ������
		arr[1][0]=0;
		while(!q.isEmpty())
		{
			int i=q.poll(); //ȭ���� �̸�Ƽ�� ����
			int j=q.poll(); //Ŭ�������� �̸�Ƽ�� ����
			System.out.println(i+" "+j);
			if(arr[i][i]==-1) //����
			{
				arr[i][i]=arr[i][j]+1; //���� ���ϴ� ���� �ɸ��ð�
				q.add(i);
				q.add(i);
			}
			if((i+j)<=n&&arr[i+j][j]==-1) //�����ֱ�
			{
				arr[i+j][j]=arr[i][j]+1;
				q.add(i+j);
				q.add(j);
			}
			if(i>=1&&arr[i-1][j]==-1) //����
			{
				arr[i-1][j]=arr[i][j]+1;
				q.add(i-1);
				q.add(j);
			}
		}
	}
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		n=Integer.parseInt(input.readLine());
		int arr[][]=new int[n+1][n+1];
		for(int i=0;i<=n;i++)
			for(int j=0;j<=n;j++)
				arr[i][j]=-1;
		dfs(arr);
		
		int result=-1;
		for(int i=0;i<=n;i++)
		{
			if(arr[n][i]!=-1) //n�϶��� ã�� ������ ���̰� �����ϸ� ���� ���� ����̱⶧���̴�.
				if(result==-1||result>arr[n][i])
					result=arr[n][i];
		}
		System.out.println(result);
		// TODO Auto-generated method stub

	}

}
