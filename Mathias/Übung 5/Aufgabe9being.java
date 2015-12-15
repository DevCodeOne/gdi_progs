import java.io.*;
import java.util.*;

public class Aufgabe9being {
	public static void main(String[] args) throws Exception {		
		//Initialisierung
		Scanner sc = new Scanner(System.in);
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(new File(args[0])));
		int laenge;
		
		//Angabe über Anzahl der Doubles
		System.out.println("Bitte Anzahl der Eingaben!");
		laenge = sc.nextInt();
		dos.writeInt(laenge);
		for (int i=1;i<=laenge;i++){
			dos.writeDouble(sc.nextDouble());			
		} 
		dos.close();
	}
}