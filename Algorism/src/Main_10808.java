import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10808 {

	public static void main(String[] args) throws IOException {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in)); 
		String str= input.readLine();
		String ch="abcdefghijklmnopqrstuvwxyz";
		char[] array_word = new char[ch.length()]; 
		for(int i=0;i<array_word.length;i++){ 
			array_word[i]=(ch.charAt(i));//스트링을 한글자씩 끊어 배열에 저장
		}
		int[] arr=new int[ch.length()];
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			for(int j=0;j<ch.length();j++)
			{
				if(array_word[j]==c)
				{
					arr[j] +=1;
					break;
				}
			}
		}
		for(int i=0;i<ch.length();i++)
		{
		System.out.print(arr[i]+" ");
		}
		// TODO Auto-generated method stub
		
		/* 이거 지립니다.
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int[] count = new int[26];
		
		for(int i=0; i<s.length(); i++) {
			count[s.charAt(i)-'a']++;
		}
		
		for(int i : count) System.out.print(i + " ");
		 */

	}

}
