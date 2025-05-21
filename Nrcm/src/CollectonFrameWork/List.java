package CollectonFrameWork;
import java.util.*;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>l1=new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(7);
		ListIterator i1=l1.listIterator();
		while(i1.hasPrevious())
		{
			System.out.println(i1.previous());
		}


	}

}