public class aufgabe2 {
	
	public static int f(int a, int b, int c) {
		if ((a > 0 && b < 0) || (a < 0 && b > 0)) c = -c; 

		for (int i = 1; i <= Math.abs(a); i++) {
			c += Math.abs(b);
		}
		
		if ((a > 0 && b < 0) || (a < 0 && b > 0)) c = -c; 
		
		return c;
	}

	public static void main(String [] args) {
		int f1 = f(1, 3, 3); 
		int f2 = f(-1, -3, -4);

		System.out.println("f1 = " + f1);
		System.out.println("f2 = " + f2);

	}
}
