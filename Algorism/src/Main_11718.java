import java.util.Scanner;

public class Main_11718 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = null;
		while(input.hasNextLine()) {
			str= input.nextLine();
			
	        if(str.isEmpty()||str.length()>100||str.startsWith(" ")||str.endsWith(" "))
	        {
	        	break;
	        }
	        else
	        	System.out.println(str);	
		}
		input.close();
	
		
	}

}

/*

**ó���� Scanner scan = new Scanner(System.in) �ϰ� �ٷ� while(scan.hasNextLine()) ���ǿ��� scan.hasNextLine()�� true�� �Ǵ� ������??

Scanner scan = new Scanner(System.in)�� �ϴ� ���� ��ü�� Ŀ���� �����Ÿ��鼭 �Է��� ��ٸ��Բ� �ϱ⶧����, ���� �ִٰ� �Ǵ��ϰ� true�� �Ǵ� �ɷ� �ϴ� ���ظ� �ߴ�.








���Է��� ������ ���� ��� �Ǵ��� ���ΰ�?



abababa

l    <- Ŀ�� ��������



Scanner�� nextLine()�޼ҵ带 �̿��Ͽ� �ٴ��� �Է��� �޾��� ��, \n(������)�� buffer�� �����ְ� �ȴ�.

���� ���̻� �Է¹��� ���� ���� �� NoSuchElementException������ ���� ������ hasNextLine()�� �̿��Ͽ� �Է� �Ϸ� ���θ� �˻��ؾ� �Ѵ�. 



--> �� ���� �ｼ,

nextLine()���� �Է��� ������ �����ٿ��� �������� �ϰ��ִµ� ��� �ԷµȰ� ���� --> NoSuchElementException �߻�,

hasNextLine()�� ���ڿ��� ������ �� ���� �ִ����� �˻����ֱ� ������ (\n�� ���������� false ����) �������� �Է¹޾Ҵ��� �ƴ����� �� �� �ִ� ���̴�.





**hasNextLine()�� ���� �ٿ� �Է��� �ִ��� ���θ� �Ǵ��� boolean�������� ��ȯ���ִ� �޼ҵ��̴�. �Է��� ������ true�� ��ȯ�Ѵ�. 

������ ����, �Է��� ��� ������ ��ٷȴٰ� false�� ��ȯ�ϴ°��� �ƴ϶� �Է��� ���� ������ ��ٷȴٰ� true�� ��ȯ�ϱ⶧���� ���������� ���ؼ��� break�� ����ؾ� �Ѵ� !!















���ظ� ���� ������ �ڹ� ScannerŬ������ next(), nextLine(), hasNextLine()�� ����



1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
import java.util.*;
 
public class Main {
    public static void main(String[] args){
        
        Scanner scan = new Scanner("�ȳ�ȳ� �ݰ��� \n ��������\n");
    
        System.out.println(scan.next());
        System.out.println(scan.nextLine());
        System.out.println(scan.hasNextLine());
        System.out.println(scan.nextLine());
        System.out.println(scan.hasNextLine());
        
    }
}
Colored by Color Scripter
cs

*/