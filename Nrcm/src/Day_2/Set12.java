package Day_2;
import java.util.*;

public class Set12 {
	 static void add(int a,int b) throws ArithmeticException{
		 if(b==0) {
			 throw new ArithmeticException("zero tho divide cheyakuu");
		 }
		int c=a/b;
		System.out.println(c);
		
	}

	public static void main(String[] args) {
		try {
			add(10,0);
		}catch(ArithmeticException|InputMismatchException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("covered all key words");
		}
		
		// TODO Auto-generated method stub
		
		

	}

}
