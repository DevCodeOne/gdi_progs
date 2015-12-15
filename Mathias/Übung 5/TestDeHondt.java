import java.util.Scanner;

public class TestDeHondt {
	
	static int anzParteien, anzSitze; 	// Anzahl der Parteien bzw. Anzahl der Sitze insgesamt
	
	static int[] anzStimmenPartei; 		// Nimmt die Anzahl der Stimmen pro Partei auf
										// Die Länge des Feldes beträgt anzParteien.
	
	static int[] anzSitzePartei; 		// Zählt die Anzahl der Sitze in Tabelle hoch, enthält
										// zum Schluss die Sitzverteilung
										// Die Länge des Feldes beträgt anzParteien.
	
	static int[] divisorPartei; 		// Enthält den aktuellen Divisor pro Partei
										// Die Länge des Feldes beträgt anzParteien.

	static void einlesen ( ) { 			// Alle Datenstrukturen bis auf divisorPartei werden
										// in entsprechende Datenstrukturen eingelesen
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Wieviel Parteien soll es geben!");
		anzParteien = sc.nextInt();
		anzStimmenPartei = new int[anzParteien];
		divisorPartei = new int[anzParteien];
		anzSitzePartei = new int[anzParteien];
		System.out.println("Wieviel Sitze soll es geben");
		anzSitze = sc.nextInt();
		
		
		for (int i = 0; i<anzParteien;i++) {
			System.out.println("Wieviel Stimmen hat Partei " + (i+1));
			anzStimmenPartei[i] = sc.nextInt();
			divisorPartei[i] = 1;
		}
			
		sc.close();
	} 
	

	static void initialize ( ) { 		// divisorPartei wird initialisiert
		for (int i = 0; i<anzParteien;i++) {
			divisorPartei[i] = 1;
			anzSitzePartei[i] = 0;
		}
		
	} 

	static int maxIndex () { 			// liefert den Index der Partei zurück mit der aktuell
										// größten Höchstzahl
		int max = anzParteien+1;
		double hoechstzahl=0;
		for (int i = 0; i<anzParteien; i++){ 
			if (hoechstzahl < anzStimmenPartei[i]/divisorPartei[i]) {
				hoechstzahl = anzStimmenPartei[i]/divisorPartei[i];
				max = i;
			}
		}
		divisorPartei[max]++;
		return max;
	} 

	static void berechneSitze () { 		// verwendet Methode maxIndex um die Sitze mit
										// Hilfe der dynamisch berechneten Tabellen-Einträge
										// zu ermitteln. Dabei müssen alle relevanten
										// Datenstrukturen ausgegeben werden
		for (int i = 0; i<anzSitze; i++){
		anzSitzePartei[maxIndex()]++;
		}
	
	} 

	static void ausgabe ( ) { 			// Liefert die Siztverteilung auf dem Bildschirm
		for (int i=0; i< anzParteien; i++){
		System.out.print("Partei " + (i+1) + " hat " + anzSitzePartei[i] + " Sitze!");
		}
	} 

	public static void main (String args [] ) { 
		einlesen();
		initialize();
		berechneSitze();
		ausgabe();
	}
} // TestDeHondt
