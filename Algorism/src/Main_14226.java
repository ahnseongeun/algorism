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
		q.add(1); //화면
		q.add(0); //클립보드
		arr[1][0]=0;
		while(!q.isEmpty())
		{
			int i=q.poll(); //화면의 이모티콘 개수
			int j=q.poll(); //클립보드의 이모티콘 개수
			System.out.println(i+" "+j);
			if(arr[i][i]==-1) //복사
			{
				arr[i][i]=arr[i][j]+1; //내가 구하는 것은 걸린시간
				q.add(i);
				q.add(i);
			}
			if((i+j)<=n&&arr[i+j][j]==-1) //붙혀넣기
			{
				arr[i+j][j]=arr[i][j]+1;
				q.add(i+j);
				q.add(j);
			}
			if(i>=1&&arr[i-1][j]==-1) //제거
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
			if(arr[n][i]!=-1) //n일때를 찾는 이유는 높이가 동일하면 같은 층의 노드이기때문이다.
				if(result==-1||result>arr[n][i])
					result=arr[n][i];
		}
		System.out.println(result);
		// TODO Auto-generated method stub

	}

}
