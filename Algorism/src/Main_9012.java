import java.util.Scanner;

public class Main_9012 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number= input.nextInt();
		
		String[] str=new String[number];
		
		for(int i=0;i<number;i++)
		{
			int num1=0;
			str[i]=input.next();
			for(int j=0;j<str[i].length();j++)
			{
				if(str[i].toCharArray()[j]=='(')
				{
				   num1++;
				}
				else
				{
					
		        	num1--;
		        	if(num1<0)
		        	{
		        		//System.out.println("NO");
		        		break;
		        	}
				}
			}
			
			if(num1==0)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
			
		}
		// TODO Auto-generated method stub
     input.close();
	}

}
