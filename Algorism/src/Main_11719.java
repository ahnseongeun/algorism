import java.util.Scanner;

public class Main_11719 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) { //enter�� �������ִ°� ����.
            String input = sc.nextLine(); // next�� nextLine�� ���鱸�� 
            System.out.println(input);
        }
        sc.close();
	}

}

/* nextLine�� next�� ���̴� nextLine ������ ���� ���Ѽ� �ѹ����� ����� ������
        next��  ������ �������� ������ �����Ѵ�.
        
sc.next() -> ���� ��ū�� �н��ϴ�.

sc.nextLine -> ���� ���� �н��ϴ�.

sc.hasNext -> ��ū�� �ִ��� Ȯ���ϰ� boolean�� �����մϴ�. ������ ��� �����մϴ�.

sc.hasNextLine -> ���� �ִ��� Ȯ�� �� boolean�� �����մϴ�. �ٹٲ��� ������ true�� �����մϴ�.

���� ���, ���� �� ��� ��ü �Է��� ����� �� �����Ƿ� hasNextLine ()�� ���ܵ��� �ʽ��ϴ�.
 ������ ���� �����ϸ� �Է��� �� �̻� ���� �� Ȯ���ϰ� �� �� �ֱ� �����Դϴ�.

�ݸ� �ҽ��� ǥ�� �Է� �� ��� �Է��� �׻� �� ���� �� �ֽ��ϴ�.
 ����ڰ� �׻� �Է��� �� �Է� �� �� �����Ƿ� hasNextLine ()�� ����ڰ� �� �Է� ���� �Է� �� ������ ���ܵ˴ϴ�.
        */
