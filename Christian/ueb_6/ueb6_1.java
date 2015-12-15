public class ueb6_1 {

	/* 
	 * zu c.) Ja man darf mehrere Werte nicht übersteigen bei der iterativen und der rekursiven Variante muss man nur die int bzw long Grenzen beachten
	 * Bei der rekursiven Variante darf vorallem nicht die Größe des Stacks überschritten werden wegen den vielen Funktionsaufrufen
	 *
	 * */

	public static void main(String [] args) {
		if (args.length == 0) {
			System.out.println("Bitte geben sie beim Programstart eine Nummer an ");
			return;
		}
		int n = Integer.parseInt(args[0]);
		int erg;
		
		long time = System.nanoTime();
		erg = fib_it(n); 

		System.out.println("Die iterative Variante hat " + (System.nanoTime() - time) + " Nanosekunden gedauert das Ergebnis ist " + erg );

		time = System.nanoTime(); 
		erg = fib_rek(n); 

		System.out.println("Die rekursive Variante hat " + (System.nanoTime() - time) + " Nanosekunden gedauert das Ergbenis ist " + erg);
	}

	public static int fib_it(int n) {
		int n_1 = 0, n_2 = 1;	
		int erg = n == 1 ? 1 : 0;
		for (int i = 0; i < n - 1; i++) {
			erg = n_1 + n_2; 

			int n_1_old = n_1; 

			n_1 = n_2; 
			n_2 += n_1_old;
		}
		return erg;
	}

	public static int fib_rek(int n) {
		if (n > 1) {
			return fib_rek(n - 1) + fib_rek(n - 2);
		} else if (n == 1) {
			return 1;
		} else {
			return 0;
		}
	}		
}
