public class Aufgabe3 {
	public static void main(String[] args){
		int[] wechselgeld = {50 , 20, 10, 5, 2, 1};
		System.out.println(wechselgeld[0]);
		int betrag = Integer.parseInt(args[0]);
		for (int i = 0; betrag>=1; i++){
			if (betrag/wechselgeld[i]<1) continue;
			System.out.println(betrag/wechselgeld[i] + " mal " + wechselgeld[i] + " Cent");
			betrag = betrag % wechselgeld[i];			
		}
	}
	
}