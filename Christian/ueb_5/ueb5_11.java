import java.util.Scanner; 

public class ueb5_11 {
	static int anzParteien, anzSitze; 
	static int [] anzStimmenPartei; 
	static int [] anzSitzePartei; 
	static int [] divisorPartei;

	public static void main(String [] args) throws Exception {
		einlesen();
		initialize();
		berechneSitze();
		ausgabe();
	}

	static void einlesen() throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Geben sie die Anzahl der Parteien an : ");
		anzParteien = scanner.nextInt(); 
		System.out.print("Geben sie die Anzahl der zu vergebenden Sitze an : ");
		anzSitze = scanner.nextInt();


		anzStimmenPartei = new int[anzParteien]; 
		anzSitzePartei = new int[anzParteien];

		for (int i = 0; i < anzParteien; i++) {
			System.out.print("Geben sie die Anzahl der Stimmen für Partei[ " + (i + 1) + " ] an : ");
			anzStimmenPartei[i] = scanner.nextInt();
		}
	}

	static void initialize() {
		divisorPartei = new int[anzParteien];
		for (int i = 0; i < anzParteien; i++) {
			divisorPartei[i] = 1;
		}
	}

	static int maxIndex() {
		int index_max = 0; 
		double höchstzahl = anzStimmenPartei[0] / (double) divisorPartei[0]; 

		for (int i = 0; i < anzParteien; i++) {
			if ((anzStimmenPartei[i] / (double) divisorPartei[i]) > höchstzahl) {
				index_max = i; 
				höchstzahl = (anzStimmenPartei[i] / (double) divisorPartei[i]);
			}
		}
		return index_max;
	}

	static void berechneSitze() {
		for (int i = 0; i < anzSitze; ) {
			int index = maxIndex(); 
			anzSitzePartei[index]++; 
			divisorPartei[index]++;
			i++;
		}
	}

	static void ausgabe() {
		for (int i = 0; i < anzParteien; i++) {
			System.out.println("Partei[ " + (i + 1) + " ] erhält " + anzSitzePartei[i] + " Sitze ");
		}
	}
}
