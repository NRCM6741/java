package Assignments1;
interface Eater{
	void eatSamosa(String n);
}
interface Runner{
	void runFromJohn(String n);
}
interface Troublemaker{
	void createProblem(String n);
}
class Motu implements Eater,Runner,Troublemaker{
	public void eatSamosa(String n) {
		System.out.println(n +" eat samosa and gains energy");
	}
	public void runFromJohn(String n) {
		System.out.println(n +" runs away from john the don");
	}
	public void createProblem(String n) {
		System.out.println(n +" accidentally create a new mess in furifuri nagar");
		
	}
}
interface Saviour{
	void saves(String n);
}
class Patlu extends Motu implements Saviour{
	public void saves(String n) {
		System.out.println(n + " Always saves motuu from danger");
	}
	public void brave(String n) {
		System.out.println(n + " thinks like an intelligent");
	}
}


public class Demo35 {
	public static void main(String[] args) {
		Patlu p=new Patlu();
		p.eatSamosa("Motu");
		p.runFromJohn("Motu");
		p.createProblem("Motu");
		p.saves("Patluu");
		p.brave("patluu");
		
		
	}

}
