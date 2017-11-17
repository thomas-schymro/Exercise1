import java.io.*;

public class HelloWorld {


	public static void main(String[] args) throws IOException {
		
		HelloUser user = new HelloUser();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Geben Sie den Username ein: ");
		user.username = br.readLine();
		user.greetuser();
		
		// TODO Auto-generated method stub
		System.out.println("Hello ASE2017 - How are you now ? :)");
	

	}

}
