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
		
		boolean check = false; //für Benutzer pw abfrage
					
		do {
			System.out.println("Nutzername: ");
			String name = sc.next();
			
			if (name.toLowerCase().equals("neu")){// equalsmethode zum Stringvergleich
				System.out.println("Neuer Nutzername: ");//wenn nutzer neu
				String name_neu = sc.next();
		
				System.out.println("Neues Passwort: ");
				String pw_neu = sc.next();
		
				User U = new User(name_neu,pw_neu);// neuer nutzer mit Konstruktor
				Users.add(U); //Fügt das angegebene Objekt der Liste hinzu.
				ActiveUser = U;
				run(); //Start Programm
				return true;
			} else {
				
				 
				System.out.println("Passwort: ");
				String pw = sc.next();	//pw falls nutzer schon vorhanen	 		
			
				for (User U:Users){ //führt für jedes Objekt in U folgendes aus
					if (U.name.equals(name)
						&&U.passwort.equals(pw)){ 
						//Prüfung ob Name und PW korrekt dann check=true s.o. false
						check=true;
						ActiveUser = U; //Übergabe für RUN
						break;
					} //if
				} //for
			} //if
		} while (check==false); //abfrage für die beiden checks
			
	// Übergang in den Normalen Programmbetrieb
	run();
		
	return true; //Rückgabewert der Methode
	}//LoginRequest
	
	
	public static void Logout(){
		ActiveUser = null;
		LoginRequest();
	}
	
	
	
	public static void run(){
		System.out.println("Was willst du tun?");
		
		String command = null;
		
		do  {
			command = sc.nextLine().toLowerCase();
			
			if (!command.equals("")) {
				if (command.startsWith("#")){//wenn String(command) mit # anfängt)
					// weist Befehl einen "teil"String von command zu
					// dieser Teil geht von Zeichen 1 bis eins vor dem leerzeichen
					// Bsp: "#spielen neu" --> befehl = "spielen"
					
					String befehl = command.substring(1,(command.indexOf(" ")));
					String param = command.substring(command.indexOf(" ")+1);
					switch (befehl) {
					case "starteapp": 
						for (App A:Apps) 
										{ if (A.name.toLowerCase().equals(param.toLowerCase()))	{
											System.out.println();
											System.out.println();
											A.executeApp();		
											System.out.println();
											System.out.println();
											}
										} break;
					default			: break;
						
					}
				} else {
					Date now = new Date();
					System.out.println(ActiveUser.name + " um " + now.getHours() + ":" + now.getMinutes() + " Uhr: \"" + clearSpaces(command) +"\"");
				}//endelse
				
			}//endif
		} while (!command.toLowerCase().equals("#abmelden"));
		Logout();
	} //run
	
	public static String clearSpaces(String mes){
		while (mes.startsWith(" ")) {
			mes = mes.substring(1);			
		}
		return mes;
	}
	
	
	//MAINMETHODE
	public static void main(String[] args){
		Woerfeln w = new Woerfeln("Wörfeln");
		Wurfeln wu = new Wurfeln("Wurfeln");
		Apps.add(w);
		Apps.add(wu);
		LoginRequest();	
	}//main	
	
		
}//class