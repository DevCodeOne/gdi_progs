public class ueb7_7 {
	
	public static void main(String [] args) {
		Beleg beleg1 = new Beleg(); 
		Beleg beleg2 = new Beleg(); 
		Beleg beleg3 = new Beleg(); 
		System.out.println(beleg1.getBelegNummer() + " , " + 
					beleg2.getBelegNummer() + " , " +
					beleg3.getBelegNummer());
	}

	static class Beleg {
		
		private static int nächste_belegnummer = 10000;
		private int belegnummer = 0;

		public Beleg() {
			belegnummer = nächste_belegnummer++;
		}

		public int getBelegNummer() {
			return belegnummer;
		}
	}
}
