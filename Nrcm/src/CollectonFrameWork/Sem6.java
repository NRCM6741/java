package CollectonFrameWork;
import java.util.*;
public class Sem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object>l1=new ArrayList<Object>();
		l1.add(12);
		l1.add(13);
		l1.add(2,67);
		java.util.List<Object> extra=Arrays.asList(9,89,90);
		l1.addAll(1,extra);
		System.out.println(l1.get(4));
		System.out.println(l1.indexOf(90));
		Object[] arr=l1.toArray();
		for(Object a1:arr)
		{
			System.out.println(a1);
		}
		

	}

}
