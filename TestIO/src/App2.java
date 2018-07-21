import java.io.Console;

public class App2 {

	//DO NOT RUN using eclipse
	//Open cmd.exe, goto directory which contains this class
	// d:
	// cd \zycus3\TestIO\bin
	// java App2
	
	public static void main(String[] args) {
	Console console = System.console();
	console.printf("Enter your name");
	String name = console.readLine();
	console.printf("Welcome %s",name);

	}

}
