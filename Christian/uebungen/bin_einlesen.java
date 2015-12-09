import java.io.File; 
import java.io.FileInputStream; 
import java.io.DataInputStream;
import java.util.Arrays;

public class bin_einlesen {
	public static void main(String [] args) throws Exception {
		if (args.length == 0) {
			System.out.println("Es fehlt die zu lesende Datei ");
			return;
		}
		int [] arr = einlesen(args[0]);
		ausgabe(arr);
	}

	static int[] einlesen(String dateiPfad) throws Exception {
		DataInputStream dis = new DataInputStream(new FileInputStream(new File(dateiPfad)));
		int n = dis.readInt();
		int [] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = dis.readInt();
		}
		return arr;
	}

	static void ausgabe(int [] arr) {
		System.out.println(Arrays.toString(arr));
	}
}
