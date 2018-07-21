import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App3 {
	private static final String DATA_FILE="d:/data/mydata.txt";
	
	public static void main(String[] args) {
			writeSomething("The quick brown fox jumps over the lazy dog");
			readSomething();

	}
	
	static void writeSomething(String text) {
		try(FileWriter writer = new FileWriter(DATA_FILE,true)) {
			char []buffer = text.toCharArray();
			writer.write(buffer);
			writer.flush();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	static void readSomething() {
	
		try(FileReader reader=new FileReader(DATA_FILE)){
			char[] buffer = new char[100];
			String str = "";
			int len = reader.read(buffer);
			while(len>0) {
				str += new String(buffer,0,len);
				len = reader.read(buffer);
			}
			System.out.println("Message : "+str);
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}

}
