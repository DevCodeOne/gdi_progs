import java.io.File;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.util.Scanner;

public class bin_ausgabe {

	public static void main(String [] args) throws Exception {
		if (args.length == 0) {
			System.out.println("Geben sie bitte die zu speichernde Datei an (per Argument) !");
			return;
		}
		int [] arr = eingabe();
		ausgabe(args[0], arr);
	}

	static int[] eingabe() throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben sie die Anzahl von Elementen an, die sie speichern wollen ! : ");
		int n = scanner.nextInt();
		int [] arr = new int[n]; 
		System.out.println("Geben sie nun die Elemente ein ");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		return arr;
	}
	
	static void ausgabe(String dateiPfad, int [] arr) throws Exception {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(new File(dateiPfad)));
		dos.writeInt(arr.length);
		for (int i = 0; i < arr.length; i++) {
			dos.writeInt(arr[i]);
		}
		dos.flush();
		dos.close();
	}

}
