import java.util.Scanner;

public class Wurfeln extends App {
	
	String[] sub = { "Der Student", "Die Mutter", "Das Pferd", "Batman", "Der Prof", "Der Apfel"};
	String[] verb = { "isst", "fährt", "schmeckt", "läuft", "schreibt", "redet"};
	String[] adj  = { "viel", "gut", "schnell", "unverantwortlich", "schlecht", "krank"};
	
	Scanner sc = new Scanner(System.in);
	
	public Wurfeln(String s){
		name = s;
	}	
	
	public void executeApp(){
		boolean antwort = false;
		do {
			System.out.println("Willkommen zu Wurfeln!");
			int wurf1 = (int)(Math.random()*6)+1;
			System.out.println("Du hast die Zahl " + wurf1 + " gewurfelt!");
			int wurf2 = (int)(Math.random()*6)+1;
			System.out.println("Du hast die Zahl " + wurf2 + " gewurfelt!");
			int wurf3 = (int)(Math.random()*6)+1;
			System.out.println("Du hast die Zahl " + wurf3 + " gewurfelt!");
		
			System.out.println("Dein Satz ist: " + sub[wurf1-1] + " " + verb[wurf2-1] + " " + adj[wurf3-1]);
			System.out.println("Nochmal!");
			antwort = sc.next().toLowerCase().equals("ja");
			
		} while (antwort);
		
	}
	
}