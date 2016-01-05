public class ueb6_2 {

	public static void main(String [] args) {
		if (args.length == 0) {
			System.out.println("Geben sie bitte die Größe des zu berechnenden Dreiecks an !"); 
			return; 
		}	
		int n = Integer.parseInt(args[0]); 
		int [][] dreieck = new int[n][];
		
		for (int i = 0; i < dreieck.length; i++) {
			dreieck[i] = new int[i+1];
		}

		for (int i = 0; i < dreieck.length; i++) {
			for (int j = 0; j < dreieck[i].length; j++) {
				dreieck[i][j] = berechne(i, j);
			}	
		}	
		ausgabe(dreieck);

	}
	
	public static int berechne(int n, int k) {
		if (k > 0 && k != n) {
			return berechne(n-1, k-1) + berechne(n-1, k);
		} else {
			return 1;
		}
	}
	
	public static void ausgabe(int dreieck[][]) {
		int space = dreieck[dreieck.length-1].length;

		for (int i = 0; i < dreieck.length; i++) {

			for (int j = 0; j < space; j++) {
				System.out.print(" ");	
			}
			space--;

			for (int j = 0; j < dreieck[i].length; j++) {
				System.out.printf("%-2d", dreieck[i][j]);
			}
			System.out.println("");
		}	
	}	
}
