import java.util.Scanner;
import java.io.*;

public class ueb5_5 {

	public static void main(String [] args) throws Exception {
		String string;
		Scanner input = new Scanner(System.in);
		
		Scanner fileinput = new Scanner(new File("geheimnis.txt"));

		string = fileinput.next();  

		char arr[] = new char[string.length()];

		int index = 0;
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				arr[index++] = c;
			}
		}

		fileinput.close(); // scanner schließen bevor wir weiter machen sonst gibt das eventuell probleme

	 	// nicht ein file gleichzeitig öffnen zum schreiben und lesen das gibt probleme	
		PrintWriter writer = new PrintWriter(new FileOutputStream(new File("geheimnis.txt")));

		for (int i = 0; i < index; i++) {
			if (arr[i] > 'Z') { // großbuchstaben kommen bei ascii zuerst 
				arr[i] = (char) ((((arr[i] + 13) - 'a') % 26) + 'a');
			} else {
				arr[i] = (char) ((((arr[i] + 13) - 'A') % 26) + 'A');
			}
		}
		writer.println(new String(arr));
		System.out.println(new String(arr));

		writer.flush(); // schreibe alle änderungen bevor wir schließen
		writer.close(); // schließen und fertig
	}
}
