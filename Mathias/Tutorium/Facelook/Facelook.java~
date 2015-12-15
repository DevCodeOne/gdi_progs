import java.util.*; 
import java.util.LinkedList; 
//LinkedLists sind generische(Typunabhängig) Listen die Objekte vom 
//angegebenen Typen aufnehmen und Verwalten. Ihre größe ist dynamisch

public class Facelook {
	
	//EIGENSCHAFTEN
	public static LinkedList<User> Users = new LinkedList<User>();
	public static LinkedList<App> Apps = new LinkedList<App>();
	public static User ActiveUser;
	public static Scanner sc = new Scanner(System.in);
	
	//METHODEN
	public static boolean LoginRequest(){
		
		System.out.println("Bitte logge dich ein!");
		System.out.println("Falls du kein ACCOUNT hast schreib NEU");
		
		String Befehl = sc.next(); //sc.next liefert nächstes Wort
		
		
		//Anlegen NEUER USER
		if (Befehl.toLowerCase().equals("neu")){// equalsmethode zum Stringvergleich
			
			System.out.println("Nutzername: ");
			String name = sc.next();
			
			System.out.println("Passwort: ");
			String pw = sc.next();
			
			User U = new User(name,pw);
			Users.add(U); //Fügt das angegebene Objekt der Liste hinzu.
			
			run();
		} else {
			//diese Ebene da sonst in while nicht verfügbar
			boolean check = false; 
						
			// Prüfung ob Benutzername und PW passt
			// erneute PW eingabe wenn PW falsch (do while)
			do {
				String name = Befehl; 
				System.out.println("Passwort: ");
				String pw = sc.next();				
				
				for (User U:Users){ //führt für jedes Objekt in U folgendes aus
					if (U.name.equals(name)
						&&U.passwort.equals(pw)){ 
						//Prüfung ob Name und PW korrekt dann check=true
						check=true;
						ActiveUser = U; //Übergabe für RUN
						break;
					} //if
				} //for
				
			} while (check==false);
			
			// Übergang in den Normalen Programmbetrieb
			run();
			
		}//else
		
		return true;
	}//LoginRequest
	
	public static void Logout(){
		ActiveUser = null;
		LoginRequest();
	}
	
	public static void StartApp(String name){
		
	}
	
	public static void run(){
		System.out.println("Was willst du tun?");
		String command = sc.nextLine();
		while (!command.toLowerCase().equals("#abmelden")) {
			
			if (command.startsWith("#")){//wenn String(command) mit # anfängt)
			
			} else {
				Date now = new Date();
				System.out.println(now.getHours() + ":" + now.getMinutes() + " Uhr: \"" + command +"\"");
			}
			command = sc.nextLine();
		} 
		Logout();
	}
	
	
	//MAINMETHODE
	public static void main(String[] args){
		LoginRequest();	
	}//main	
	
	
	
	
	
}//class