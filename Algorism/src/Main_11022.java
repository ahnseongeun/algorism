import java.util.Scanner;

public class Main_11022 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T= input.nextInt();
		
		for(int i=1;i<=T;i++) {
		int a= input.nextInt();
		int b= input.nextInt();
		int c= a+b;
		if(a>0&&b<10)
		{
		System.out.println("Case #"+i+":" +a +"+"+ b+"=" +c+"\n");
		}
		}
		
		// TODO Auto-generated method stub

	}

}
