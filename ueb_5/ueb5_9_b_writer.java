
import java.util.Scanner;
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class ueb5_9_b_writer {
	public static void main(String [] args) throws Exception {
		if (args.length == 0) {
			System.out.println("Sie müssen das Program mit dem Namen der zu schreibenden Datei aufrufen !");
			return;
		}
		String dateipfad = args[0];
		double [] arr = einlesen();
		write(dateipfad, arr);
	}

	// Anmerkung : scanner benötigt kommas keine punkte !! 
	// Also kommazahlen werden mit ',' geschrieben also in Java 10.5 im File 10,5
	static double[] einlesen() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Geben sie die Anzahl der Zahlen an : ");
		int n = scanner.nextInt();
		double arr[] = new double[n];

		System.out.print("Geben sie nun die zu schreibenden Werte ein : ");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextDouble();
		}
		return arr;
	}

	static void write(String dateipfad, double [] arr) throws Exception {
		FileOutputStream fos = new FileOutputStream(new File(dateipfad));
		DataOutputStream dos = new DataOutputStream(fos);

		dos.writeInt(arr.length);

		for (int i = 0; i < arr.length; i++) {
			dos.writeDouble(arr[i]);
		}

		dos.flush();
		dos.close();
	}

}
