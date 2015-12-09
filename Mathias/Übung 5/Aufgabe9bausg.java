import java.io.*;
import java.util.*;

public class Aufgabe9bausg {
	public static void main(String[] args) throws Exception {		
		//Initialisierung
		
		DataInputStream dos = new DataInputStream(new FileInputStream(new File(args[0])));
		int laenge = dos.readInt();
		double min = dos.readDouble();
		double max = dos.readDouble();
		
		System.out.println("Das kleinste double: " + min);
		System.out.println("Das größte double: " + max);
		
		dos.close();
	}
}