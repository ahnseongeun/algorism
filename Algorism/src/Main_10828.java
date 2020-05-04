import java.util.Scanner;


public class Main_10828 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number= input.nextInt();
		int[] array= new int[number];
		int count = 0;
		input.nextLine();
		for(int i=0;i<number;i++)
		{
			
			String str= input.nextLine();
			
			if(str.contains("push"))
			{	
			    String a= str.substring(5);
			    int b = Integer.parseInt(a);
             	array[count]= b;
				//System.out.println(array[count]);		
				count++;
								
			}
			else if(str.contains("pop"))
			{
				
				
				if(array[0]==0)
				{
					System.out.println("-1");
				}
				else
				{
				System.out.println(array[count-1]);
				array[count-1]=0;
				count--;
				}	
				
			}
			else if(str.contains("top"))
			{
				if(array[0]==0)
				{
					System.out.println("-1");
				}
				else
				{
				System.out.println(array[count-1]);
				}
			}
			else if(str.contains("empty"))
			{
				if(array[0]==0)
				{
					System.out.println("1");
				}
				else
				{
					System.out.println("0");
				}
			}
			else if(str.contains("size"))
			{
				System.out.println(count);
			}
			
		}
		// TODO Auto-generated method stub
        input.close();
	}

}
