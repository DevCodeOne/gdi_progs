public class ueb5_2 {

	public static void main(String [] args) {
		if (args.length == 0) {
			System.out.println("Zu wenige Argumente ");
			return;
		}
		int n = Integer.parseInt(args[0]);
		printDual(n);
		System.out.println();
	}

	// von rechts nach links
	public static void printDual(int n) {
		if (n >= 2)
			printDual(n / 2);
		System.out.print(n % 2);
	}
}
