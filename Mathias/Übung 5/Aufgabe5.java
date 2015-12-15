import java.util.Scanner;

public class Aufgabe5 {
 	public static void main(String[] args){
 		System.out.println("Zu Codierenden Text eingeben!");
 		Scanner sc = new Scanner(System.in);
 		String satz = sc.next();
 		satz = satz.toLowerCase();
 		String code = "";
 		int ascii[] = new int[satz.length()];
 		for (int i=0;i<satz.length();i++){ 			
 			code += codieren(satz.charAt(i));
  		}
 		System.out.println(code);
 		
	}//main
	
	public static char codieren(char zeichen){
		int ascii = (int)zeichen;
		int code = 0;
		System.out.println(ascii);
		if (ascii<=109) {
			code = ascii + 13;
		} else {
			code = ascii - 13;
		}
		zeichen = (char)code;
		return zeichen;
		
	}
}//class