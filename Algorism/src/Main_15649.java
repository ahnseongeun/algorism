import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_15649 {
		static int n;
		static int m;
		static int arr[];
		static boolean visited[];
		static BufferedWriter output;
		static void search(int index) throws Exception
		{
			if(index==m+1)
			{
				for(int i=1;i<index;i++)
					output.write(String.valueOf(arr[i])+" ");
				output.write("\n");
				return;
			}
			for(int i=1;i<=n;i++)
			{
				if(visited[i]==false)
				{
					visited[i]=true;
					arr[index]=i;
					search(index+1);
					visited[i]=false;
				}
					
			}
		}

	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		output=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(input.readLine());
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		arr=new int[m+1];
		visited=new boolean[n+1];
		for(int i=1;i<=n;i++)
			visited[i]=false;
		search(1);
		output.close();
		// TODO Auto-generated method stub

	}

}
