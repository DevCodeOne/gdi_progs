import java.util.Scanner;

public class input {
	
	public static void main(String [] args) {
		String beispiel = " \"10euro\"; \"100euro\"; ";
		beispiel = beispiel.replace("\"", " ");
		beispiel = beispiel.replace(";", " "); 
		Scanner scanner = new Scanner(beispiel);

		while(scanner.hasNext()) {
			System.out.println(scanner.next() + " ");
		}
	}
}
