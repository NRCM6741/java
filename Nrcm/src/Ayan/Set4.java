package Ayan;

class S2 {
	 static void show() {
		System.out.println("hi");
	}
	static class Sa{
		static void print() {
			System.out.println("hello");
			show();
		}
	}
}
public class Set4{
	public static void main(String[] args) {
		S2.Sa.print();
	}
}


