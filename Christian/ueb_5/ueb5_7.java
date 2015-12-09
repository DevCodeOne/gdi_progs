import java.util.GregorianCalendar;

public class ueb5_7 {

	public static final long MILLISPERSECOND = 1000;
	public static final long MILLISPERMINUTE = 60 * MILLISPERSECOND;
	public static final long MILLISPERHOUR = 60 * MILLISPERMINUTE;
	public static final long MILLISPERDAY = 24 * MILLISPERHOUR;

	public static void main(String [] args) {
		File file = new File("geheimnis.txt");
		GregorianCalendar referenzJahr = new GregorianCalendar(1980, 1, 1, 0, 0); // monat fängt bei null an
		GregorianCalendar jetzt = new GregorianCalendar();

		long diff = jetzt.getTimeInMillis() - referenzJahr.getTimeInMillis();

		long days = diff / MILLISPERDAY;
		diff -= days * MILLISPERDAY;
		
		long hours = diff / MILLISPERHOUR;
		diff -= hours * MILLISPERHOUR;

		long minutes = diff / MILLISPERMINUTE;
		diff -= minutes * MILLISPERMINUTE;

		long seconds = diff / MILLISPERSECOND;
		diff -= seconds * MILLISPERSECOND;
		
		System.out.println("Seit dem 1.1.1980 sind " + days + " Tage ," + hours + " Stunden ,"
				+ minutes + " Minuten und " + seconds + " Sekunden vergangen ");
	}
}
