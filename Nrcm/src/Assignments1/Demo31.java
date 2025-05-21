package Assignments1;
interface Walkable{
	void walk();
}
class Person{
	void name() {
		System.out.println("Name:Archana");
	}
	void speak() {
		System.out.println("She can speak");
	}
}
class Employee extends Person implements Walkable{
	public void walk() {
		System.out.println("she is walking for a meeting");
	}
}
class Manager extends Employee{
	public void start(){
		System.out.println("Manager is ready to start the meeting");
	}
}

public class Demo31 {
	public static void main(String[] args) {
		Manager e=new Manager();
		e.walk();
		e.name();
		e.speak();
		e.start();
	}

}
