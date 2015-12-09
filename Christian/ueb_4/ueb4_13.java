public class ueb4_13 {
	public static void main(String [] args) {
		if (args.length == 0) {
			System.out.println("Nicht genügend Argumente ");
			return;
		}
		char zeichen = args[0].charAt(0); 
		switch(zeichen) {
			case 'a' : 
			case 'A' : 
				System.out.println("Anna");
				break; 
			case 'b' : 
			case 'B' : 
				System.out.println("Berta"); 
				break;
			default : 
				System.out.println("Sonderfall");
		}
	}
}
