import java.io.IOException;

public class App1 {

	public static void main(String[] args) {
		
		//Create a buffer of size 100
		byte[] buffer = new byte[100];
		
		try {
			System.out.println("Enter your name: ");
			// READ bytes (max: 100) from user
			int len = System.in.read(buffer);
			
			System.out.println("You have entered: "+len+" bytes");
			
			String name = new String(buffer,0,len);
			System.out.println("Name : "+name);
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		

	}

}
