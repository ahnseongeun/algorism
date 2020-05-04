import java.util.Scanner;

public class Main_2439 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		StringBuilder sb=new StringBuilder();
		for(int i=n;i>=1;i--)
		{
			int j,k;
			for(j=1;j<i;j++)
				sb.append(" ");
			for(k=j;k<=n;k++)
				sb.append("*");
			sb.append("\n");
		}
		System.out.println(sb);
		// TODO Auto-generated method stub

	}

}
