public class Aufgabe2{
	public static void main(String[] args){
		Wuerfeln w = new Wuerfeln();
		int[] gut = new int[6];
		int[] falsch = new int[6];
		for (int i = 0; i<1000 ; i++){
			gut[w.gut()-1]++;
		}
		for (int i = 0; i<1000 ; i++){
			falsch[w.falsch()-1]++;
		}
		
		System.out.println("Verteilung GUT");
		for (int i = 0; i<6 ; i++){
			System.out.println("Die Zahl " + (i+1) + " " + gut[i] + " mal");
		}
		
		System.out.println("Verteilung FALSCH");
		for (int i = 0; i<6 ; i++){
			System.out.println("Die Zahl " + (i+1) + " " + falsch[i] + " mal");
		}			
	}
}

// Antwort Aufgabe 3a NEIN 3b NEIN