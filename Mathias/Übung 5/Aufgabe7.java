import java.util.*;


public class Aufgabe7 {
	public static void main(String[] args){
		GregorianCalendar basiskal = new GregorianCalendar(1980,0,1,0,0,0);
	
		GregorianCalendar nowkal = new GregorianCalendar();
		//System.out.println(nowkal.getTimeInMillis());
		//System.out.println(basiskal.getTimeInMillis());
		//System.out.println(nowkal.get(Calendar.ALL_STYLES) +"." + nowkal.get(Calendar.MONTH) + "." + nowkal.get(Calendar.YEAR));
		nowkal.setTimeInMillis(nowkal.getTimeInMillis() - basiskal.getTimeInMillis());
		System.out.println(nowkal.getTimeInMillis());
		long dauer = nowkal.getTimeInMillis();
		dauer = dauer/1000;
		long tage = dauer/(24*60*60);
		dauer = dauer%(24*60*60);
		long std = dauer/(60*60);
		dauer = dauer%(60*60);
		System.out.println(dauer);
		long min = dauer/(60);
		dauer = dauer%(60);
		System.out.printf("%d Tage %d Stunden %d Minuten %d Sekunden", tage, std , min, dauer);
		System.out.println();
		
		System.out.println(nowkal.get(Calendar.DAY_OF_MONTH) +"." + (nowkal.get(Calendar.MONTH)+1) + "." + nowkal.get(Calendar.YEAR));
	}//main
}//class