import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_11655 {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		
		while((str=input.readLine()) != null)
		{
			char[] arr=new char[str.length()];
			int count=0;
			arr=str.toCharArray();
			
			for(int i=0;i<str.length();i++)
			{
				count =arr[i];
				//System.out.println(count);
				if(48<=count&&arr[i]<58)
				{
					System.out.print(arr[i]);
				}
				else if(64<count&&count<91) //대문자
				{
					//System.out.println(count);
					int a1=count+13;
					if(a1>90)
					{
						a1=64+(a1%90);
						System.out.print((char)a1);
					}
					else
					{
						System.out.print((char)a1);
					}
						
				}
				else if(count==32) //공백
				{
					System.out.print(' ');
				}
				else 
				{
					int a2=count+13;
					if(a2>122)
					{
						a2=96+(a2%122);
						System.out.print((char)a2);
					}
					else
					{
						System.out.print((char)a2);
					}
				}
			}
					
			
				
			}
		
		}
		
				

	}


