import java.util.Scanner;

public class prim{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int p=sc.nextInt();
		String prim=" ist eine Primzahl";
		for (int i = 2; i<p; i++){
			if (p%i==0){
				prim = " ist keine Primzahl!";
				System.out.println(i + " ist der erste teiler!");
				break;
			}
		}//For
		System.out.println(p + prim);
	}//Main


}//Class
