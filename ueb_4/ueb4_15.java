public class ueb4_15 {
	public static void main(String [] args) {
		if (args.length == 0) {
			System.out.println("Nicht genüged Argumente ");
			return;
		}
		int n = Integer.parseInt(args[0]);
		int quersumme = 0;

		for (int i = 0; n != 0; i++) {
			quersumme += n % 10; 
			n = n / 10;
		}
		n = Integer.parseInt(args[0]);
		System.out.println("Quersumme von " + n + " ist : " + quersumme); 
	}
}
