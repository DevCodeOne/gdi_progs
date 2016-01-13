public class Aufgabe10 {
	public static void main(String [] args){
	
		for (int i=0; i<1000;i++){
			try{
				zufall();	
			}
			catch (IstNullEx e) {
			}
		}
	
		System.out.println(IstNullEx.anzahl);
	}
	
	
	static int zufall()throws IstNullEx{
		int zufallszahl = (int) (Math.random () * 10.);	
		if (zufallszahl ==0) throw new IstNullEx();
		return zufallszahl;
	}

}