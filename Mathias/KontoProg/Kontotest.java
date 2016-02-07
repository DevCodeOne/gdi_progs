
public class Kontotest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Konto k = new Konto(100826868, 1000);
		k.einlesen("m2.CSV");
		k.ausgabe();
	
	}
	

}
