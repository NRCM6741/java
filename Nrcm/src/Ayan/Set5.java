package Ayan;

 class Set5 {
	void show() {
		System.out.println("h1");
	}
}
 class Honey{
	Set5 s=new Set5() {
	void show() {
		System.out.println("hello");
		super.show();
		}
	};
   public static void main(String[] args) {
	Honey s1=new Honey();
	s1.s.show();
}
}