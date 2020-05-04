import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.ListIterator;

public class Listliterator_practice {

	public static void main(String[] args) {
		LinkedList<Character> list=new LinkedList<Character>();
		ListIterator cursor= list.listIterator();
		cursor.add('a');
		cursor.add('b');
		cursor.add('c');
		cursor.add('d');
		System.out.println(cursor.get(2));
		/*
		ListIterator list1= list.listIterator();
		while(list1.hasNext())
		{
			System.out.println(list1.next());
			//list1.remove();
		}
	*/
		//System.out.println(list1.previous());
		
		//for(int i=0;i<=4;i++)
		//	System.out.println(list.get(i));
			
		//ListIterator<Character> list2=list.listIterator();
		
		// TODO Auto-generated method stub

	}

}
