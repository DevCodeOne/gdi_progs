import java.io.*;

public class Aufgabe9 {
	static double [ ] einlesen (String datei) throws Exception{
		
		BufferedReader read = new BufferedReader(new FileReader(datei));
		int arraylenght = Integer.parseInt(read.readLine());
		//erste Zeile als Array länge
		double d[] = new double[arraylenght];
		
		//zuweisen der Werte in Array
		for (int i = 0; i<d.length; i++){
			d[i]=Double.parseDouble(read.readLine());
		}
		
		return d;
	}
	
	static double[] minMax (double[] feld){
		
		double min=feld[0];
		double max=feld[0];
		//prüfen der min max werte
		for (int i=1; i<feld.length; i++){
			if (feld[i]>max) {
				max = feld[i];
			}
			if (feld[i]<min) {
				min = feld[i];
			}
		}
		double mima[] = new double[2];
		mima[0] = min;
		mima[1] = max;
		return mima;
	}
	

	static void ausgabe (double[] result){
		System.out.println("Kleinster Wert: " + result[0]);
		System.out.println("Größter Wert: " + result[1]);
	}

	
	public static void main(String[] args) throws Exception{		
		try {
			ausgabe(minMax(einlesen(args[0])));
			}
		catch (Exception e) {
			System.out.println("Bitte Datei angeben!");
		}
	}

}