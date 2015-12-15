public class Laden{
public static void main(String[] args){
	Produkt Schokoriegel = new Produkt("Schokoriegel",1.50f);
	Produkt Banane = new Produkt("Banane",0.40f);
	Produkt Apfel = new Produkt("Apfel",0.80f);
	Produkt Ananas = new Produkt("Ananas",0.90f);
	
	Produkt[] 	liste1 = {Schokoriegel,Banane,Apfel,Ananas}, 
				liste2 = {Banane, Apfel, Ananas},
				liste3 = {Ananas, Ananas,Apfel};
				
				
				
	BonDrucken(liste1,12.50f);
	BonDrucken(liste2,14.50f);
	BonDrucken(liste3,9.25f);

}
public static void BonDrucken(Produkt[] ps, float gegeben){
		float sum = 0;
		for (int i=0;i<ps.length;i++){}
		for (Produkt p:ps){
			System.out.println(p.name + " " + p.preis);
			sum += p.preis;
		}
		System.out.println("Summe" + sum);
		RueckGeld(sum, gegeben);
		System.out.println("Vielen Dank!");
	}
	
	public static void RueckGeld(float summe, float betrag){
		System.out.println("Sie haben " +betrag+ "Euro bezahlt!");
		betrag -= summe;
		System.out.println("Sie bekommen: " + betrag + "Euro zurück!");
	}
}