import java.util.Scanner;

public class Backjoon1 {

	public static void main(String[] args) {
		int num1=0;
		do {
		System.out.println("������ �Է��ϼ���");
		Scanner a=new Scanner(System.in);
		String text=a.next();
		
		String text1=a.next();
		System.out.println(text1);
		System.out.println("�ѹ��ڴ� ����� �ݺ� �Ұ��ΰ�.");
		int size=a.nextInt();
		//System.out.println(size);
		for(int j=0;j<text.length();j++)
		{
		    for(int i=0;i<size;i++)
		    {
		    	System.out.print(text.charAt(j));
			
		    }
		}
		
		 System.out.println("-1�̸� �׸�!! �������� ������");
	        num1 = a.nextInt();
	        
		}while(num1!=-1);
		
		// TODO Auto-generated method stub
		
		System.out.println("������ �������");

	}

}
