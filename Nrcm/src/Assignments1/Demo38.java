package Assignments1;
interface Languages{
	void type();
}
interface DanceForm{
	void style();
	
}
interface Country extends Languages,DanceForm{
	void people();
}
class Hyderabad{
	void speak() {
		System.out.println("Speaks hindi and telugu");
	}
}
class India extends Hyderabad implements Country{
	public void type() {
		System.out.println("There are many languages in India");
	}
	public void style() {
		System.out.println("Bharathanatayam is the famous danceform");
	}
	public void people() {
		System.out.println("There are different religious people are there in India ");
	}
	public void holy() {
		System.out.println("India is holy place");
	}
}

public class Demo38 {
	public static void main(String[] args) {
		India i=new India();
		i.type();
		i.style();
		i.people();
		i.speak();
		i.holy();
		
	}

}
