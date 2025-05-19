package Ayan;

public class Set6 {

	public static void main(String[] args) {
		int a=20;
		try {
		int b=Integer.parseInt(args[0]);
		int c=a/b;
		System.out.println(c);
		}catch(Exception e) {
			//System.out.println(e.toString());
			//e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		System.out.println("Archana");

	}

}
