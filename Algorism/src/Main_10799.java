import java.util.Scanner;
import java.util.Stack;

// 1. ��ü �Է�
// 2. ()�� ������ ���� �ʴ´�. (())�̰ź��� ������ ����.
// 3. ��ū (()())�� ���ԵǸ� -> 3  
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
     		  //peek�� Ȯ���ؼ� �������� (�� ������ 1����
    	  }
      }
      
    	System.out.println(total);	  
	}

}
