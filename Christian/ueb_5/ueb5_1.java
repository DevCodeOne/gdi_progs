import java.util.Scanner;
import java.util.InputMismatchException;

public class ueb5_1 {
	public static void main(String [] args) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.print("Geben sie einen Integer an : "); 
		try {
		int n = input.nextInt();
		System.out.println(n + " mod 3 = " + mod3_it(n));
		} catch (InputMismatchException e) {
			System.err.println("Das eingegebene entspricht nicht einem Integer !!!");
		}
		input.close();
	}

	public static int mod3(int n) {
		if (n >= 3) 
			return mod3(n-3);
		return n;
	}

	public static int mod3_it(int n) {
		while(n >= 3) 
			n -= 3; 
		return n;
	}
}
