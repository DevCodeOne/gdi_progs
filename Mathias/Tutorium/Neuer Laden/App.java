public class App{
	public static void main(String[] args){
		
		//Erstellen der Objekte mit den vorher definierten Konstruktoren
		Produkt p1=new Produkt();	//Standartkonstuktor
		p1.name = "Apfel";
		p1.preis = 0.99;
		Produkt p2=new Produkt("Schokoriegel"); //Konstuktor mit einem String
		p2.preis = 2.99;
		Produkt p3=new Produkt("Banane", 1.99); //K mit String und Double
		
		//erstellung Produktliste (Array)
		Produkt[] 	Liste1 = {p1,p1,p3,p2},
					Liste2 = {p3,p2,p2,p2},
					Liste3 = {p1,p1,p1,p1};
		
		Bon b1 = new Bon(Liste1,22.99);
		b1.printBon();
	
	}
}