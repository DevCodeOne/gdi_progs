import java.util.Scanner;

public class ueb5_6 {
	public static void main(String [] args) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.print("Geben sie die Rechnung an : ");
		double zahl1 = Double.parseDouble(input.next());
		String operation = input.next();
		double zahl2 = Double.parseDouble(input.next());

		double erg = 0; 
		
		switch(operation) {
			case "+" : 
				erg = zahl1 + zahl2;
				break; 
			case "-" : 
				erg = zahl1 - zahl2;
				break;
			case "*" : 
				erg = zahl1 * zahl2;
				break;
			case "/" : 
				if (zahl2 > 1E-6) 
					erg = zahl1 / zahl2;
				else 
					System.out.println("Nicht durch 0 teilen bitte !");
				break;
			default : 
				break;
		}
		System.out.println("Ergebnis : " + erg);
	}
}
