public class Bon{
	
	public void BonDrucken(Produkt[] ps, float gegeben){
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
	
	public void RueckGeld(float summe, float betrag){
		System.out.println("Sie haben " +betrag+ "Euro bezahlt!");
		betrag -= summe;
		System.out.println("Sie bekommen: " + betrag + "Euro zurück!");
	}
}