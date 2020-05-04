import java.util.Scanner;

public class Main_11719 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) { //enter를 구분해주는것 같다.
            String input = sc.nextLine(); // next와 nextLine은 공백구분 
            System.out.println(input);
        }
        sc.close();
	}

}

/* nextLine과 next의 차이는 nextLine 공백을 포함 시켜서 한문장을 만들수 있지만
        next는  공백을 기준으로 문장을 구분한다.
        
sc.next() -> 다음 토큰을 읽습니다.

sc.nextLine -> 다음 행을 읽습니다.

sc.hasNext -> 토큰이 있는지 확인하고 boolean을 리턴합니다. 공백의 경우 무시합니다.

sc.hasNextLine -> 행이 있는지 확인 후 boolean을 리턴합니다. 줄바뀜이 있으면 true를 리턴합니다.

예를 들어, 파일 인 경우 전체 입력을 사용할 수 있으므로 hasNextLine ()이 차단되지 않습니다.
 파일의 끝에 도달하면 입력이 더 이상 없을 때 확실하게 알 수 있기 때문입니다.

반면 소스가 표준 입력 인 경우 입력이 항상 더 많을 수 있습니다.
 사용자가 항상 입력을 더 입력 할 수 있으므로 hasNextLine ()은 사용자가 새 입력 행을 입력 할 때까지 차단됩니다.
        */
