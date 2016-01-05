public class ueb7_2 {

	public static final int NUMBER_OF_TESTS  = 10000000;
	public static final int NUMBERS = 6;
	public static final double EVENLY_SPREAD_LIMIT = 0.125;
	public static final double EVENLY_SPREAD_VALUE = 1 / (double) NUMBERS;
		
	public static void main(String [] args) {
		int [] funk_1 = new int[NUMBERS]; 
		int [] funk_2 = new int[NUMBERS]; 

		for (int i = 0; i < NUMBER_OF_TESTS; i++) {
			funk_1[wuerfel_gut()-1]++; 
			funk_2[wuerfel_schlecht()-1]++;
		}
		
		System.out.println("+------+----------------+----------------+");
		System.out.println("| Zahl | Methode 1      | Methode 2      |");
		System.out.println("+------+----------------+----------------+");

		for (int i = 0; i < 6; i++) {
			System.out.printf("| %-4d | %-14d | %-14d |\n", i + 1, funk_1[i], funk_2[i]);
		}

		double max_dif_funk_1 = Math.abs((funk_1[0] / (double) NUMBER_OF_TESTS) - EVENLY_SPREAD_VALUE);
		double max_dif_funk_2 = Math.abs((funk_2[0] / (double) NUMBER_OF_TESTS) - EVENLY_SPREAD_VALUE);

		for (int i = 0; i < NUMBERS; i++) {
			max_dif_funk_1 = Math.max(Math.abs((funk_1[i] / (double) NUMBER_OF_TESTS) - EVENLY_SPREAD_VALUE), max_dif_funk_1);
			max_dif_funk_2 = Math.max(Math.abs((funk_2[i] / (double) NUMBER_OF_TESTS) - EVENLY_SPREAD_VALUE), max_dif_funk_2);
		}

		boolean funk_1_evenly_spread = max_dif_funk_1 < EVENLY_SPREAD_LIMIT ? true : false;
		boolean funk_2_evenly_spread = max_dif_funk_2 < EVENLY_SPREAD_LIMIT ? true : false;

		System.out.println("+------+----------------+----------------+");
		
		System.out.printf("| %4s | %-14s | %-14s | \n", " ", 
				funk_1_evenly_spread ? "Gleichmäßig" : "Ungleichmäßig",
				funk_2_evenly_spread ? "Gleichmäßig" : "Ungleichmäßig");

		System.out.println("+------+----------------+----------------+");

	}

	static int wuerfel_gut() {
		return (int) (Math.random() * NUMBERS) + 1;
	}

	static int wuerfel_schlecht() {
		return (int) (Math.min((Math.random() * NUMBERS * 2), NUMBERS - 1)) + 1;
	}
}
