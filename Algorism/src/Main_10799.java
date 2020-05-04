import java.util.Scanner;
import java.util.Stack;

// 1. 전체 입력
// 2. ()는 개수를 세지 않는다. (())이거부터 개수를 센다.
// 3. 더큰 (()())에 포함되면 -> 3  
public class Main_10799 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input= new Scanner(System.in);
      Stack<Character> stack = new Stack<>();
      String str= input.next();
      int total=0;
      
      for(int i=0;i<str.length();i++)
      {
    	  char a=str.charAt(i);
    	  if(a=='(')
    	  {
    		  stack.push(a);
    	  }
    	  else
    	  {
    		  if(str.charAt(i-1)=='(')
    		  {
    			  stack.pop();
    			  total+= stack.size();
    			 // System.out.println(stack.size());
    		  }
    		  else
    		  {
    			  stack.pop();
    			  total+= 1;
    		  }
     		  //peek로 확인해서 전에것이 (면 레이저 1생성
    	  }
      }
      
    	System.out.println(total);	  
	}

}
