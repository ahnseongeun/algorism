import java.util.Scanner;

public class Main_2445 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		StringBuilder sb=new StringBuilder();
		for(int i=1;i<=2*n-1;i++)
		{
			for(int j=1;j<=i;i++)
				sb.append("*");
			for(int j=2*n;j>;j--)
				sb.append("*");
			for(int j=1;j<=i;i++)
				sb.append("*");
			for(int j=1;j<=i;i++)
			    sb.append("*");
		}
		// TODO Auto-generated method stub

	}

}
