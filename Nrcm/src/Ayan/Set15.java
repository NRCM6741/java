package Ayan;
class CheppanuException extends Exception{
	public CheppanuException(String message) {
		super(message);
	}
	
}

public class Set15 {
	public static void ageCheck(int age) throws CheppanuException {
	if(age<18) {
		throw new CheppanuException("nak telvadu");
		
		
	}else {
		System.out.println("na agr 18 below");
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ageCheck(12);
		}catch(CheppanuException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Happy Coding!!");
		}

	}

}
