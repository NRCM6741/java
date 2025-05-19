package Day_2;
 class Tes{
	  void show() {
		System.out.println("hello");
	}
}

public class Set1 extends Tes {
	  final void show() {
	    int a=23;
		System.out.println(a);
		a=34;
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set1 s=new Set1();
		s.show();

	}

}
