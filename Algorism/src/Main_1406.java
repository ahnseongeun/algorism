import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main_1406 {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		String str= input.readLine(); //1
		int num= Integer.parseInt(input.readLine()); //2
		LinkedList<Character> list=new LinkedList();
		
		int cursor= str.length();
		for(int j=0;j<str.length();j++)
		{
			list.add(str.charAt(j));
		}
		
		for(int i=0;i<num;i++)
		{
			String str1= input.readLine();  //L, P, B, D
		    char ch = str1.charAt(0);
		   
			switch(ch)
			{
			case 'L':
			{
				//System.out.println(cursor+a+a);
				if(cursor!=0)
				{
					cursor = cursor-1;
				}
				break;
			}
				
			case 'D':
			{
				if(list.size()!=cursor)
				{
					{
						cursor = cursor+1;
					}
				}
				break;
			}
			case 'B':
			{
				
				if(cursor!=0)
				{
					list.remove(cursor-1);
					cursor=cursor-1;
				}
				break;
					
			}
			case 'P':
			{
				
				if(cursor >= 0)
				{
				  	list.add(cursor, str1.charAt(2));
				  	cursor= cursor+1;
				  	
				}
				break;
					
			}
			
			default:
				
			
		}
		}
		

		for(int i=0;i<list.size();i++)
		{
			sb.append(list.get(i));
		}
		System.out.println(sb);
		
		
		
		input.close();
		  // TODO Auto-generated method stub

	}
		
}
