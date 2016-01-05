import java.util.Scanner; 
import java.io.*;

public class matrix_mult {

	public static void main(String [] args) throws Exception {
		if (args.length < 2) {
			System.out.println("Es sind nicht genügend Argumente vorhanden !");
			System.out.println("Aufruf wie folgt java matrix_mult File matrix1 File matrix2 Ausgabe_Erg");
			return;
		}
		int [][] matrix = einlesenMatrix(args[0]);
		int [][] matrix2 = einlesenMatrix(args[1]);
		if (!testKompatibilität(matrix, matrix2)) {
			System.out.println("Matrix1 und Matrix2 sind nicht miteinander multiplizierbar, da sie nicht die richtigen Ausmaße haben !");
			return;
		}
		int [][] result = matrix_mult(matrix, matrix2);
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				System.out.printf("%-3d", result[i][j]);
			}
			System.out.println();
		}
	}

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

	public static int[][] matrix_mult(int [][]matrix1, int [][]matrix2) {
		int [][] result = new int[matrix1[0].length][matrix2.length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				for (int k = 0; k < result[0].length; k++) {
					result[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}
		return result;
	}

	// spaltengröße muss vektorlänge entsprechen
	public static boolean testKompatibilität(int [][] matrix, int [][] matrix2) {
		return matrix[0].length == matrix2.length; 
	}
	
}
