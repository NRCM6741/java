package Assignments1;
interface Movie{
	void title();
}
interface Actors extends Movie{
	void hero();
	void heroine();
}
class Demo27 implements Actors{
	public void title() {
		System.out.println("SpiderMan");
	}
	public void hero() {
		System.out.println("MaheshBabu");
	}
	public void heroine() {
		System.out.println("Rakul preet Singh");
	}
	public void villan() {
		System.out.println("Rana");
	}
}
class Demo2 implements Actors {
	public void title() {
		System.out.println("Avengers");
	}
	public void hero() {
		System.out.println("ironman");
	}
	public void heroine() {
		System.out.println("wanda");
	}
  public class Demo29{
	public static void main(String[] args) {
		Demo2 d1=new Demo2();
		Demo27 d2=new Demo27();
		d1.title();
		d1.hero();
		d1.heroine();
	}
  }

}
