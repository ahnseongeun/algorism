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

**처음에 Scanner scan = new Scanner(System.in) 하고 바로 while(scan.hasNextLine()) 조건에서 scan.hasNextLine()이 true가 되는 이유는??

Scanner scan = new Scanner(System.in)을 하는 행위 자체가 커서를 깜빡거리면서 입력을 기다리게끔 하기때문에, 행이 있다고 판단하고 true가 되는 걸로 일단 이해를 했다.








★입력이 끝났을 때를 어떻게 판단할 것인가?



abababa

l    <- 커서 깜빡깜빡



Scanner의 nextLine()메소드를 이용하여 줄단위 입력을 받았을 때, \n(다음줄)이 buffer에 남아있게 된다.

따라서 더이상 입력받을 줄이 없을 때 NoSuchElementException에러가 나기 때문에 hasNextLine()을 이용하여 입력 완료 여부를 검사해야 한다. 



--> 이 말인 즉슨,

nextLine()으로 입력을 받으면 다음줄에서 깜빡깜빡 하고있는데 사실 입력된건 없음 --> NoSuchElementException 발생,

hasNextLine()은 문자열로 구성된 한 줄이 있는지를 검사해주기 때문에 (\n만 남아있으면 false 리턴) 다음줄을 입력받았는지 아닌지를 알 수 있는 것이다.





**hasNextLine()은 다음 줄에 입력이 있는지 여부를 판단해 boolean형식으로 반환해주는 메소드이다. 입력이 있으면 true를 반환한다. 

주의할 점은, 입력이 계속 없으면 기다렸다가 false를 반환하는것이 아니라 입력이 있을 때까지 기다렸다가 true를 반환하기때문에 빠져나오기 위해서는 break를 사용해야 한다 !!















이해를 위해 연습한 자바 Scanner클래스의 next(), nextLine(), hasNextLine()의 차이



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
        
        Scanner scan = new Scanner("안녕안녕 반가워 \n 헤헤헤헤\n");
    
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