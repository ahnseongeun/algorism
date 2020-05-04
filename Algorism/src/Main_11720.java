import java.util.Scanner;

//숫자의 합

public class Main_11720 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		
		int N= input.nextInt();
		String a= input.next();
		int[] array= new int[N];
		
		for(int i=0;i<N;i++)
		{
		  array[i]= (a.charAt(i)-48);
		  total += array[i];
		}
		
		
		
		System.out.println(total);

	}

}
