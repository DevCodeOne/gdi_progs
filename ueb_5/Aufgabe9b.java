import java.io.*;

public class Aufgabe9b {
	static double [ ] einlesen (String datei) throws Exception{
		
		DataInputStream dos = new DataInputStream(new FileInputStream(new File(datei)));
		int laenge = dos.readInt();
		double d[] = new double[laenge];
		
		for (int i=0;i<laenge;i++){
			d[i]=dos.readDouble();			
		} 
		dos.close();
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
	

	static void ausgabe (double[] result, String datei)throws Exception{
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(new File(datei)));
		int laenge = 2;
		
		dos.writeInt(laenge);
		for (int i=0;i<laenge;i++){
			dos.writeDouble(result[i]);			
		} 
		dos.close();
	}

	
	public static void main(String[] args) throws Exception{		
		//try {
			ausgabe(minMax(einlesen(args[0])),args[0]);
		//	}
		//catch (Exception e) {
		//	System.out.println("Bitte Datei angeben!");
		//}
	}

}