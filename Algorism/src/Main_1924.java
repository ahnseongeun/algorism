import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_1924 {

	public static void main(String[] args) throws Exception {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output=new BufferedWriter(new OutputStreamWriter(System.out));
		String str=input.readLine();
		String arr[]=str.split(" ");
		int a=Integer.parseInt(arr[0]);
		int b=Integer.parseInt(arr[1]);
		int count=0;
		for(int i=1;i<a;i++)
		{
			if(i==1||i==3||i==5||i==7||i==8||i==10||i==12)
			{
				count+=31;
			}
			else if(i==4||i==6||i==9||i==11)
			{
				count+=30;
			}
			else
			{
				count+=28;
			}
		}
		b+=count;
		b%=7;
		switch(b)
		{
		case 0:
			output.write("SUN");
			break;
		case 1:
			output.write("MON");
			break;
		case 2:
			output.write("TUE");
			break;
		case 3:
			output.write("WED");
			break;
		case 4:
			output.write("THU");
			break;
		case 5:
			output.write("FRI");
			break;
		case 6:
			output.write("SAT");
			break;
		default :
			break;
		}
		output.close();
		// TODO Auto-generated method stub

	}

}
