import java.util.Scanner;
import java.io.*;

public class Aufgabe10 {
	static int[] einlesenVector (String datei) throws IOException {
		
		BufferedReader read = new BufferedReader(new FileReader(datei));
		int arraylaenge = Integer.parseInt(read.readLine());
		int vektor[] = new int[arraylaenge];
		
		for (int i = 0; i<vektor.length; i++){
			vektor[i]=Integer.parseInt(read.readLine());
		}

		return vektor;
	} // einlesenVector
	static int[][] einlesenMatrix (String datei) throws IOException {
		
		BufferedReader read = new BufferedReader(new FileReader(datei));
		int zeile = Integer.parseInt(read.readLine());
		int spalte = Integer.parseInt(read.readLine());
		int matrix[][] = new int[zeile][spalte];
		
		for (int i = 0; i<matrix.length; i++){
			for (int j = 0; j<matrix[i].length; j++){
				matrix[i][j] = Integer.parseInt(read.readLine());
		}
		}
		return matrix;
	} // einlesenMatrix
	static boolean testCompatibility (int[] vect, int[][] mat) {
			
		for (int i = 0; i<(mat.length-1); i++){
			if (mat[i].length != mat[i+1].length){
				return false;
			}
			if (mat[i].length!=vect.length){
			return false;
			}
		}
		return true;		
	
		
		
	} // testCompability
	static int[] multiplikation (int[] vect, int[][] mat) {
		int[] vecnew = new int[mat.length];
		int zwischenerg = 0;
		
		for (int i = 0; i<mat.length; i++){
			for (int j = 0; j<mat[i].length; j++){
				zwischenerg += mat[i][j]* vect[j];
			}
			vecnew[i] = zwischenerg;
			
			zwischenerg = 0;
		}
		return vecnew;
		
	} // multiplikation
	static void auslesenVector (int[] vector, String ausDat) throws IOException {
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(ausDat)));
		out.println(vector.length);
		for (int i = 0; i<vector.length; i++){
			out.println(vector[i]);
		}
		out.close();
			
	} // auslesenVector
	public static void main (String args []) throws IOException {
		int vec[] = einlesenVector(args[0]);
		int mat[][] = einlesenMatrix(args[1]);
		if (testCompatibility(vec,mat)) {
			auslesenVector(multiplikation(vec,mat),args[2]);
		} else {
			System.out.println("Matrix und Vector sind nicht Multiplizierbar");
		}		
		
	} // main
	
}