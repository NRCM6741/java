package CollectonFrameWork;
import java.util.*;

public class Sem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(12);
		l1.add(4);
		l1.add(56);
	    l1.add(4);
		l1.addFirst(2);
		l1.add(2,19);
		l1.addLast(41);
		System.out.println(l1);
		l1.removeLast();
		l1.removeFirst();
		System.out.println(l1);
		l1.removeFirstOccurrence(4);
		System.out.println(l1);
		
		

	}

}
