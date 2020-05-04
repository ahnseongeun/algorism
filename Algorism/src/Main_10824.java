import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10824 {

	public static void main(String[] args) throws IOException {
		BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
		String str=input.readLine();
		input.close();
		String[] strr=new String[4];
		for(int i=0;i<4;i++)
		{
			strr[i]= str.split(" ")[i];
		}
		strr[0]=strr[0].concat(strr[1]);
		strr[2]=strr[2].concat(strr[3]);
		
		long a=Long.parseUnsignedLong(strr[0]);
		long b=Long.parseUnsignedLong(strr[2]);
		
		System.out.println(a+b);
		// TODO Auto-generated method stub

	}

}
