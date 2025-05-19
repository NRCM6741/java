import java.util.*;
class Person{
	private String name;
	private int age;
public void setName(String name) {
	this.name=name;
   }
public String getName() {
	return name;
  }
public void setAge(int age) {
	this.age=age;
  }
public int getAge() {
	return age;
   }
}
public class Test21{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Person t=new Person();
		System.out.println("Enter your name:");
		String name=sc.next();
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		t.setName(name);
		t.setAge(age);
		System.out.println("Name: "+t.getName());
		System.out.println("Age: "+t.getAge());
		
		
		}

  }

