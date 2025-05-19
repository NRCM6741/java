package Day_1;

abstract class Archana {
	abstract void display();
	abstract void show();

}
class Demo9 extends Archana{
	public void display() {
		System.out.println("i learnt oops concepts");
	}
	public void show() {
		System.out.println("java");
	}
	public static void main(String[] args) {
		Demo9 d1=new Demo9();
		d1.display();
		d1.show();
	}
}
