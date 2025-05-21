package CollectonFrameWork;
import java.util.*;

public class Enum {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
				Vector<Integer>l1=new Vector<Integer>();
				l1.add(1);
				l1.add(2);
				l1.add(7);
				Enumeration i1=l1.elements();
				while(i1.hasMoreElements())
				{
					System.out.println(i1.nextElement());
				}


			}



	}


