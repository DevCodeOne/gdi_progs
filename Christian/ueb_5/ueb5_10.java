import java.util.Scanner; 
import java.io.*;

public class ueb5_10 {

	public static void main(String [] args) throws Exception {
		if (args.length != 3) {
			System.out.println("Es sind nicht genügend Argumente vorhanden !");
			System.out.println("Aufruf wie folgt java ueb5_10 File vektor File matrix Ausgabe_Erg");
			return;
		}
		int [] vektor = einlesenVektor(args[0]);
		int [][] matrix = einlesenMatrix(args[1]);
		if (!testKompatibilität(vektor, matrix)) {
			System.out.println("Matrix und Vektor sind nicht miteinander multiplizierbar, da sie nicht die richtigen Ausmaße haben !");
			return;
		}
		int [] result = multiplikation(vektor, matrix);
		schreibenVektor(result, args[2]);
	}

	public static int[] einlesenVektor(String datei) throws Exception {
		Scanner input = new Scanner(new File(datei));
		int n = input.nextInt();
		int [] vektor = new int[n];

		for (int i = 0; i < n; i++) {
			vektor[i] = input.nextInt();
		}
		input.close(); return vektor; }

	public static int[][] einlesenMatrix(String datei) throws Exception { // IOexception erbt von exception deswegen geht das
		Scanner input = new Scanner(new File(datei));
		int m = input.nextInt();
		int n = input.nextInt(); 

		int [][] matrix = new int[m][n];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = input.nextInt();
			}
		}

		return matrix;
	}

	public static int[] multiplikation(int []vektor, int [][]matrix) {
		int [] result = new int[matrix.length];
		
		for (int zeile = 0; zeile < matrix.length; zeile++) {
			for (int j = 0; j < matrix[0].length; j++) {
				result[zeile] += matrix[zeile][j] * vektor[j];
			}
		}

		return result;
	}

	// spaltengröße muss vektorlänge entsprechen
	public static boolean testKompatibilität(int [] vektor, int [][] matrix) {
		return vektor.length == matrix[0].length; 
	}
	
	public static void schreibenVektor(int []vektor, String datei) throws Exception {
		PrintStream ps = new PrintStream(new File(datei));
		for (int i = 0; i < vektor.length; i++) {
			ps.println(vektor[i]);
		}
	}

}
