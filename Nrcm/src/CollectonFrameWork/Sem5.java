package CollectonFrameWork;
import java.util.*;
public class Sem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object>l1=new ArrayList<Object>();
		l1.add(12);
		l1.add("hi");
		l1.add(67);
		ArrayList<Object>l2=new ArrayList<Object>(l1);
		l2.add(12);
		l2.add(13);
		l2.add(14);
		l2.addAll(l1);
		l2.add(null);
		System.out.println(l2);
		
		

	}

}
