public class ueb5_8 {
	public static void main(String [] args) {
		if (args.length == 0) {
			System.out.println("Nicht genügend Argumente !");
			return;
		}
		String wort = args[0];
		boolean palin = palindrom(wort); 
		if (palin) {
			System.out.println(wort + " ist ein palindrom !");
		} else {
			System.out.println(wort + " ist kein palindrom !");
		}
	}

	public static boolean palindrom(String wort) { 
		// großbuchstaben haben anderen wert als kleinbuchstaben
		// touppercase convertiert alle chars zu großbuchstaben
		// zeichen sind unterschiedlich kein palindrom
		if (Character.toUpperCase(wort.charAt(0)) != Character.toUpperCase(wort.charAt(wort.length()-1))) {
			return false;
		}
		if (wort.length() > 2) // führe den vergleich für die verbleibenden zeichen durch und lösche die bereits geprüften
			return palindrom(wort.substring(1, wort.length()-1));
		// wenn wir bis hier gekommen sind wissen wir das das erste und letzte zeichen gleich sind
		return true;
	}
}
