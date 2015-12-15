public class Aufgabe10c{
	public static void main(String[] args){
		int n=12;
		int i;
		if (n<=1) { 
			System.out.println("keine Primzahl!");
			return;
		}
		if (n%2==0) {
			System.out.println("keine Primzahl!");
			return;
		}
		for (i=3;i<=Math.sqrt(n);i+=2){			
			if (n%i==0){
			//System.out.println(i+" "+n);				
				System.out.println(n + " ist keine primezahl?");
				return;				
			}			
		}
		System.out.println(n + " ist eine primezahl?");		
	}
}