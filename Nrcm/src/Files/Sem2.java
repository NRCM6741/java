package Files;
import java.io.*;

public class Sem2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter f1=new FileWriter("C:\\Users\\archa\\OneDrive\\Desktop\\sem.txt");
		f1.write("hi sujana how are you");
		f1.close();
		System.out.println("success");

	}

}
