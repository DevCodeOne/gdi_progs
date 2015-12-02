import java.util.Scanner;

public class ueb5_4 {
	public static void main(String [] args) throws Exception {
		int konto = 10000;
		Scanner input = new Scanner(System.in); 

		while (konto > 0) {
			System.out.print("Bitte geben sie ihren Einsatz ein max : " + "( " + konto + " ) : ");

			int einsatz = input.nextInt(); 

			if (einsatz > konto) {
				System.out.println("Der Einsatz war zu groß");
				continue;
			}

			System.out.print("Geben sie eine Zahl zwischen 0 und 9 ein ! : ");  

			int schaetzung = input.nextInt();

			if (schaetzung < 0 || schaetzung > 9) {
				System.out.println("Ihre Schätzung liegt nicht in dem gefordertem Bereich !");
				continue;
			}
			
			int zahl = (int) (Math.random() * 10); // weil sonst keine 9 möglich ist

			if (schaetzung != zahl) {
				System.out.println("Schade sie haben die falsche Zahl erwischt, es war die " + zahl + " !");
				konto -= einsatz;
			} else {
				einsatz *= 9;
				System.out.println("Glückwunsch sie haben " + einsatz + " gewonnen !");
				konto += einsatz;
			}
		}
		System.out.println("Sie haben verloren danke für den Einsatz");
	}

}
