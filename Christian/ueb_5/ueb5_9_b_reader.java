import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class ueb5_9_b_reader {
	public static void main(String [] args) throws Exception {
		if (args.length == 0) {
			System.out.println("Sie müssen das Program mit dem Namen der zu einlesenden Datei aufrufen !");
			return;
		}
		String dateipfad = args[0];
		double [] arr = einlesen(dateipfad);
		System.out.println(Arrays.toString(arr));
		double [] result = minMax(arr);
		ausgabe(result);
	}

	// Anmerkung : scanner benötigt kommas keine punkte !! 
	// Also kommazahlen werden mit ',' geschrieben also in Java 10.5 im File 10,5
	static double[] einlesen(String datei) throws Exception {
		File file = new File(datei);
		DataInputStream dis = new DataInputStream(new FileInputStream(file));

		int n = dis.readInt();
		double arr[] = new double[n];

		for (int i = 0; i < n; i++) {
			arr[i] = dis.readDouble();
		}
		return arr;
	}

	// min ist minMax[0] und max ist minMax[1]
	static double[] minMax(double [] arr) {
		double minMax[] = {arr[0], arr[0]};

		for (int i = 0; i < arr.length; i++) {
			minMax[0] = Math.min(arr[i], minMax[0]);
			minMax[1] = Math.max(arr[i], minMax[1]);
		}
		return minMax;
	}

	static void ausgabe(double [] result) {
		System.out.printf("Minimum : %f Maximum : %f \n", result[0], result[1]);
	}
}
