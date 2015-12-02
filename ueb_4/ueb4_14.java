public class ueb4_14 {
	public static void main(String [] args) {
		if (args.length == 0) {
			System.out.println("Nicht genügend Argumente ");
			return;
		}
		int n = Integer.parseInt(args[0]);
		if ((n % 4) == 0 && ((n % 100) != 0 || (n % 400) == 0)) {
			System.out.println("Schaltjahr " + n);
		} else {
			System.out.println("Kein Schaltjahr " + n); 
		}
	}
}
