package Ayan;

public class Set2 {
	void season() {
		System.out.println("hi");
	}
	class Summer{
		void print() {
			System.out.println("hello");
		}
	}
	public static void main(String[] args) {
		Set2 s=new Set2();
		s.season();
		Set2.Summer t1=new Set2().new Summer();
		t1.print();
	}

}
