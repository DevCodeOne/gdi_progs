import java.util.Scanner;

public class Aufgabe4 {
	public static void main(String[] args){
		//Initialisierung
		Scanner sc = new Scanner(System.in);
		int guthaben = 10000;
		boolean weiter = false;
		
		do {
			//Eingabe von Einsatz und Zahl
			System.out.println("Einsatz!: ");
			int einsatz = sc.nextInt();
			System.out.println("Rate Zahl!: ");
		
			//Guthabenanpassung
			if (raten(sc.nextInt())){
					guthaben += 9*einsatz;
			}
			else {
				guthaben -= einsatz;
			}
		
			System.out.println("Ihr Guthaben: \t" + guthaben);
			
			//Weiter?
			System.out.println("Weiter?");
			//Input String / klein Formatieren / vergleich
			weiter = sc.next().toLowerCase().equals("ja");
		} while (weiter);	
	}
	
	public static boolean raten(int zahl){
		int wurf = (int)(Math.random()*10);
		if (zahl == wurf) {
			System.out.println("Treffer!");
			return true;
		}
		else {
			System.out.println("Leider daneben!");			
			return false;
		}
	}
}