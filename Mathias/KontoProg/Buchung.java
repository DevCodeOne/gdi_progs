
public class Buchung {
	String Auftragskonto, Buchungstag , Valutadatum, Buchungstext, Verwendungszweck, Beguenstigter, IBAN, BIC, Waehrung, Info;
	double Betrag;	
	
	public Buchung(String Auftr, String bTag , String vDatum, String bText, String vZweck, String Begue, String IB, String BLZ, double Betr, String Waeh, String Ifo){
		Auftragskonto = Auftr;
		Buchungstag = bTag;
		Valutadatum = vDatum;
		Buchungstext = bText;
		Verwendungszweck = vZweck;
		Beguenstigter = Begue;
		IBAN = IB;
		BIC = BLZ;
		Betrag = Betr;
		Waehrung = Waeh;
		Info = Ifo;
	}
}
