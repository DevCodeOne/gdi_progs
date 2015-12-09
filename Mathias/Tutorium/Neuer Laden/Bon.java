public class Bon{
	//Eigenschaften (public=von außerhalb der Klasse änderbar)
	public Produkt[] produkte;
	public double gegeben;
	double summe=0.0;
	//Konstruktoren
	public Bon(Produkt[] gekaufteProdukte,double GEGEBEN){
		produkte = gekaufteProdukte;
		gegeben = GEGEBEN;
	}
	//Methoden
	public void printBon(){
		//Formatierung
		System.out.println("BON");
		System.out.println("------------------------");
		
		//Ausgabe Produkte 
		//for (Variablen deklaration aus Array : Variablenname im Objekt)
		for (Produkt p : produkte){
			//Ausgabe der einzelnen Produkte \t = Tabulator
			System.out.println(p.name + "\t" + p.preis + "Euro");
			summe = summe + p.preis;
		}
		System.out.println("------------------------");
		System.out.println("Summe: \t" + summe + "Euro");
		rueckgeld(summe,gegeben);
		System.out.println("------------------------");
	}
	public void rueckgeld(double gesamt, double gegeben)
        {
           System.out.println("Ihr Rückgeld beträgt:\t" + (gegeben-summe));    
        }

}