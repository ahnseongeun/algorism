import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_10809 {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String str= input.readLine();
		char[] carr=str.toCharArray();
		int[] arr=new int[26];
		Arrays.fill(arr,-1);
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(arr[carr[i]-'a']==-1) //소문자를 가지고 노는법
			{
			arr[carr[i]-'a']=count;
			count++;
			}
			else
				count++;
		}
		
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(arr[i]+" ");
		}
		// TODO Auto-generated method stub

	}

}
