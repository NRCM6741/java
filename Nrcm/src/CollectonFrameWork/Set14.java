package CollectonFrameWork;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Set14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(1, "ds");
		m1.put(2, "cse");
		m1.put(3, "ece");
		m1.put(4, "eee");
		m1.put(6,"civil");
		m1.put(5, "archa");
		System.out.println(m1);
		for(Map.Entry<Integer,String>i:m1.entrySet())
		{
			System.out.println(i.getKey());
			System.out.println(i.getValue());
		}

	}

}
