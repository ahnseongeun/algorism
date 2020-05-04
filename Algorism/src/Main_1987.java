import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_1987 {
	static StringBuilder sb=new StringBuilder();
	static ArrayList<Character> list=new ArrayList<Character>();
	static int n;
	static int m;
	static char arr[][];
	static int max=0;
	//static int count=0;
	static void search(int col,int row,int count)
	{
		if(count>max)
		{
			max=count;
			//for(Character c:list)
			//	sb.append(c+" ");
			//sb.append("\n");
		}
		if(col<n)
		if(!list.contains(arr[col+1][row]))
		{
			
			list.add(arr[col+1][row]);
			search(col+1,row,count+1);
			list.remove(list.indexOf(arr[col+1][row]));
		}
		if(row<m)
		if(!list.contains(arr[col][row+1]))
		{
			//System.out.println("¸Þ2"+count);
			list.add(arr[col][row+1]);
			search(col,row+1,count+1);
			list.remove(list.indexOf(arr[col][row+1]));
		}
		if(col>1)
		if(!list.contains(arr[col-1][row]))
		{
			//System.out.println("¸Þ3"+count);
			list.add(arr[col-1][row]);
			search(col-1,row,count+1);
			list.remove(list.indexOf(arr[col-1][row]));
		}
		if(row>1)
		if(!list.contains(arr[col][row-1]))
		{
			//System.out.println("¸Þ4"+count);
			list.add(arr[col][row-1]);
			search(col,row-1,count+1);
			list.remove(list.indexOf(arr[col][row-1]));
		}
	}
	public static void main(String[] args) throws Exception{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(input.readLine());
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		arr=new char[n+1][m+1];
		for(int i=1;i<=n;i++)
		{
			String str=input.readLine();
			for(int j=1;j<=m;j++)
			{
				arr[i][j]=str.charAt(j-1);
			}
		}
		
		list.add(arr[1][1]);
		search(1,1,1);
		System.out.println(max);
		//System.out.println(sb);
		// TODO Auto-generated method stub

	}

}
