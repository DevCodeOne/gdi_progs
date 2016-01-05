public class WasWohlTest {
	static int waswohl (int n) {
		if (n < 2) return n;
		return (3 * waswohl (n-1) - 2 * waswohl (n-2) );
	} // waswohl
	public static void main (String [ ] args) {
		for (int i = 2; i < 7; i++) {
			System.out.println (i + " : " + waswohl (i) );
		}
	} // main
} // WasWohlTest