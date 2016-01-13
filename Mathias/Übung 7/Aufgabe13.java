public class Aufgabe13 {
	public static void main(String [] args){
		Vector v1 = new Vector(1,2);
		Vector v2 = new Vector(3,4);
		Vector v3 = new Vector(5,6);
		double erg;
		
		v1.mult(3);
		v2.add(v1);
		erg = v3.mult(v2);
		
		System.out.println("Skalare Mult: " + v1);
		System.out.println("VecAdd: " + v2);
		System.out.println("Skalarmult: " + erg);
		
		System.out.println("Betrag eines Vec: " + v1.abs());
	}

}