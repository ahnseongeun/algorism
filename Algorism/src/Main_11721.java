import java.util.Scanner;

public class Main_11721 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		String str= input.next();
		input.close();
		if(str.length()<100) {
		for(int i=0;i<str.length();i++)
		{
			System.out.print(str.charAt(i));
			if(i%9==0&&i!=0) //i%10==9�� ����. -> �Է¹����� / ���ϴ� ũ�� == �迭�� �ε���
			{
				System.out.println();
			}
		}
		}
	}

}
