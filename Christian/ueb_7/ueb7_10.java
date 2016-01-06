public class ueb7_10 {

	public static void main(String [] args) {
		
		for (int i = 0; i < 100000; i++) {
			try {
				random_zahl();
			} catch (IstNull e) {
				System.err.println(e.getMessage());
			}
		}
	}

	static int random_zahl() throws IstNull {
		int rnd = (int) (Math.random() * 10);
		if (rnd == 0) 
			throw new IstNull();

		return rnd; 
	}

	static class IstNull extends Exception {
		
		public IstNull() {
			super("Zufallszahl ist 0 !");
		}
	}
}
