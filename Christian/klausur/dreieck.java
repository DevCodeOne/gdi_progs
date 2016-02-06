public class dreieck {
	
	public static void main(String [] args) {
		int dreieck[][] = generate(5);
		for (int i = 0; i < dreieck.length; i++) {
			for (int j = 0; j < dreieck[i].length; j++) {
				System.out.print(dreieck[i][j]); 
			}
			System.out.println();
		}
	}

	public static int[][] generate(int n) {
		int dreieck[][] = new int[n][]; 

		for (int i = 0; i < n; i++) {
			dreieck[i] = new int[i+1]; 

			for (int j = 0; j <= i; j++) {
				dreieck[i][j] = binom(i, j);
			}
		}

		return dreieck;
	}
	
	public static int binom(int n, int k) {
		if (k == 0 || k == n) return 1; 
		
		return binom(n - 1, k - 1) + binom(n - 1, k);	
	}
}
