import java.text.SimpleDateFormat;
import java.util.Date;
class Beleg{
	static int lfdnr;
	static int date;
	static SimpleDateFormat format3 = new SimpleDateFormat("ddMMyy");
	int BelegNr;
	Beleg() {
		if (date != Integer.parseInt(format3.format(new Date()))) lfdnr = 0;
		date = Integer.parseInt(format3.format(new Date()));
		BelegNr = (date*1000) + lfdnr++;	
	} // Beleg
	int nummer () {
		return BelegNr;
	} // nummer
} // Beleg