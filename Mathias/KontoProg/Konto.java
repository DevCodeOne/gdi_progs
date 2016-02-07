import java.io.*;
import java.util.*;

public class Konto {
	public int Kontonummer;
	public double Kontostand;
	public ArrayList<Buchung> list = new ArrayList<Buchung>();
	public Konto(int Kontonummer, double Kontostand){
		this.Kontonummer = Kontonummer;
		this.Kontostand = Kontostand;
	}
	
	
	public void einlesen(String file) throws FileNotFoundException{
		Scanner sc = new Scanner(new File(file));
		String[] s = new String[22];
		while (sc.hasNextLine()){
			s = sc.nextLine().split("\"");
			Buchung b = new Buchung(s[1], s[3], s[5], s[7], s[9], s[11], s[13], s[15], Double.parseDouble(s[17].replace(',', '.')), s[19], s[21]);
			list.add(b);
		}
		sc.close();
	}
	public void ausgabe(){
		for ( int i =0; i<list.size();i++){
			System.out.println(list.get(i).Betrag);
		}
	}
}
