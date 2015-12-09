import java.util.*;


public class Aufgabe6 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] s=sc.nextLine().split(" ");
		double ergebnis=0;
		switch (s[1]){
			case "+":	ergebnis = Double.parseDouble(s[0]) + Double.parseDouble(s[2]);
						break;
			case "-": 	ergebnis = Double.parseDouble(s[0]) - Double.parseDouble(s[2]);
						break;
			case "*": 	ergebnis = Double.parseDouble(s[0]) * Double.parseDouble(s[2]);
						break;
			case "/": 	ergebnis = Double.parseDouble(s[0]) / Double.parseDouble(s[2]);
						break;
			default:    System.out.println("Eingabe nicht korrekt");
		}//Switch
		System.out.println("Das Ergebnis: " + ergebnis);
	
	}//main
}//class