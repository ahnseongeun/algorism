import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_6603 {
		static int n;
		static int arr[];
		static int lotto[];
		static BufferedWriter output;
		static void search(int i,int j) throws IOException//i=arr의 index, j=lotto의 인덱스
		{
			if(j==7)
			{
				for(int k=1;k<=6;k++)
					output.write(String.valueOf(lotto[k])+" ");
				output.write("\n");
				return;
			}
			for(int k=i;k<=n;k++)
			{
				lotto[j]=arr[k];
				search(k+1,j+1);
				
			}
		}
		//static int index=1; //lotto의 인덱스를 나타낸다
		
		
	public static void main(String[] args) throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		output=new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
		StringTokenizer st=new StringTokenizer(input.readLine());
		n=Integer.parseInt(st.nextToken());
		arr=new int[n+1];
		lotto=new int[7];
		if(n==0)
			break;
		for(int i=1;i<=n;i++)
			arr[i]=Integer.parseInt(st.nextToken());
		search(1,1);
		
		output.write("\n");
		}
		output.close();
		// TODO Auto-generated method stub

	}
/*
 * for(int i=1;i<=n;i++)
				output.write(String.valueOf(arr[i])+" ");
			output.write("\n");
 */
}
