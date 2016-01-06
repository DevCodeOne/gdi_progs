public class ueb7_13 {

	public static void main(String [] args) {
		Vektor vek = new Vektor(0, 0);
	}

	static class Vektor {

		private int x, y;

		public Vektor() {
			this(0, 0);
		}

		public Vektor(int x, int y) {
			this.x = x; 
			this.y = y;
		}

		public void addiere(Vektor v) {
			this.x += v.x;
			this.y += v.y;
		}

		public void multipliziere(float skalar) {
			this.x *= skalar; 
			this.y *= skalar;
		}

		public int skalarProdukt(Vektor v) {
			return v.x * x + v.y * y;
		}

		public double betrag() {
			//return Math.sqrt(x * x + y * y);
			return Math.sqrt(skalarProdukt(this));
		}

		public int getX() { return x; }
		public int getY() { return y; }
	}
}
