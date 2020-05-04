import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main_10820 {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		
		while((str=input.readLine()) != null)
		{
			int num1=0; //소문자
			int num2=0; //대문자
			int num3=0; //숫자
			int num4=0; //공백
			int count=0;
				char[] carr=new char[str.length()];
				carr=str.toCharArray();
				for(int i=0;i<str.length();i++)
				{
					count= carr[i]-'0';
					if(0<=count&&count<10)
					{
						num3++;
					}
					else if(16<count&&count<43)
					{
						num2++;
					}
					else if(count==-16)
					{
						num4++;
					}
					else
					{
						num1++;
					}
				}
				
				System.out.println(num1+" "+num2+" "+num3+" "+num4);
				
			
			
			
			/*
			   
				for(int i=0;i<str.length();i++)
				{
					
				}
				*/
		}
				input.close();
		
		// TODO Auto-generated method stub

	}
	
	

}
