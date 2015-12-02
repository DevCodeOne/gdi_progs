public class wuerfel {
	public static void main(String [] args) {
		if (args.length == 0) {
			System.out.println("Nicht genügend Argumente !");
			return;
		}
		int n = Integer.parseInt(args[0]);
		int wuerfe[] = new int[6];
		for (int i = 0; i < n; i++) {
			int rand = (int) (Math.random() * 6);
			wuerfe[rand]++;
		}

		for (int i = 0; i < 6; i++) {
			System.out.println("Die " + (i + 1) + " wurde " + wuerfe[i] + " mal gewürfelt");
		}
	}
}
