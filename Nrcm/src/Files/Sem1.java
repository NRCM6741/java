package Files;
import java.io.*;

public class Sem1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1=new File("C:\\Users\\archa\\OneDrive\\Desktop\\sem.txt");
		if(f1.createNewFile())
		{
			System.out.println("file created succesfully");
		}
		else
		{
			System.out.println("not creadted");
		}

	}

}
