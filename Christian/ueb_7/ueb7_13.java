public class ueb7_13 {

	public static void main(String [] args) {
		Vektor vek = new Vektor(0, 0);
		Vektor vek2 = new Vektor(10, 10);
		Vektor vek3 = Vektor.addiere(vek, vek2);
		
		/// Reflection dann geht das auch, dann kann man auch drauf zugreifen

		System.out.println(vek3);
	}

	static class Vektor {

		private int x, y; // in allen Instanzen

		public Vektor() {
			this(0, 0);
		}

		public Vektor(int x, int y) {
			this.x = x; 
			this.y = y;
		}

	//	public Vektor addiere(Vektor v) {
	//		return new Vektor(this.x + v.x, this.y + v.y);
	//	}

		public static Vektor addiere(Vektor v, Vektor v2) {
			return new Vektor(v.x + v2.x, v.y + v2.y);
		}

		public Vektor multipliziere(float skalar) {
			return new Vektor((int) (this.x * skalar), (int) (this.y * skalar));
		}

		public int skalarProdukt(Vektor v) {
			return v.x * x + v.y * y;
		}

		public double betrag() {
			//return Math.sqrt(x * x + y * y);
			return Math.sqrt(skalarProdukt(this));
		}

		@Override
		public String toString() {
			return "[ " + x + ", " + y + " ]";
		}

		public int getX() { return x; } 
		public int getY() { return y; }
	}
}
