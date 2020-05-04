import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10845 {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int num= Integer.parseInt(input.readLine());
		int[] arr=new int[num+1];
		int count=0;
		
		for(int i=0;i<num;i++)
		{
			String str= input.readLine();
			//System.out.println(str.charAt(5));
			if(str.contains("push"))
			{
				String str1= str.split(" ")[1];
				arr[count]= Integer.parseInt(str1); 
				count++;
			}
			else if(str.contains("front"))
			{
				if(arr[0]==0)
				{
					System.out.println("-1");
				}
				else
				{
					System.out.println(arr[0]);
				}
			}
			else if(str.contains("back"))
			{
				if(arr[0]==0)
				{
					System.out.println("-1");
				}
				else
				{
					System.out.println(arr[count-1]);
				}
			}
			else if(str.contains("size"))
			{
				if(count<0)
				System.out.println(count+1);
				else
				System.out.println(count);
			}
			else if(str.contains("pop"))
			{
				if(arr[0]==0)
				{
					System.out.println("-1");
				}
				else
				{
					System.out.println(arr[0]);
					//System.out.println(count);
					for(int j=0;j<count;j++)
					{
						arr[j]=arr[j+1];
					}
					
					if(count>0)
					{
					arr[count]=0;
					count--;
					}
				}
			}
			else if(str.contains("empty"))
			{
				if(arr[0]==0)
				{
					System.out.println("1");
				}
				else
				{
					System.out.println("0");
				}
			}
			
			
		}
		input.close();//스트림을 닫음

	}

}
