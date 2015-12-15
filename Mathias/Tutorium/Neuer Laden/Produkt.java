public class Produkt{
	//Eigenschaften
	public String name;
	public double preis;
	
	//Konstuktoren (Maschine zum erstellen einzlner Produkte)
	//selber Name wie Klasse + kein Rückgabewert (void)
	//Standartkonstuktor Pflicht sobald 1. selbst definiert
	public Produkt(){
		name = "Beispielprodukt";
		preis = 0.0;
	} 
	public Produkt(String pName){
		name = pName;
	}
	public Produkt(String name, double preis){
		this.name = name; //this bezieht sich auf das aktuelle Objekt
		this.preis = preis;
	}
}