import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10430 {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		//int num= Integer.parseInt(input.readLine()); //2
		String[] a= input.readLine().split(" ");
		
			int a0=Integer.parseInt(a[0]);
			int a1=Integer.parseInt(a[1]);
			int a2=Integer.parseInt(a[2]);
		
		System.out.println((a0+a1)%a2);
		System.out.println((a0%a2+a1%a2)%a2);
		System.out.println((a0*a1)%a2);
		System.out.println((a0%a2*a1%a2)%a2);
		
		
	}
}
