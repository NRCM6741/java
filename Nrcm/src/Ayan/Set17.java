package Ayan;
class Ammu extends Exception{
	public Ammu(String message) {
		super(message);
	}
	
}

public class Set17 {
	public static void evenOdd(int n) throws Ammu {
	if(n%2==0) {
		throw new Ammu("idi na number");
		
		
	}else {
		System.out.println("idi Archana number");
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			evenOdd(12);
		}catch(Ammu e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("evi ma iddari numbers");
		}

	}

}
