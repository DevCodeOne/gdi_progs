import java.util.Scanner;

public class Aufgabe2{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int modu = sc.nextInt();
	printdual(modu);
	System.out.println();
}
/*public static int printdual(int mod){
	int dual = mod%2;
	mod = mod/2;
	if (mod>1){
		System.out.print(printdual(mod));
	} else{
	return dual;
	}
}*/
public static void printdual(int mod){
	if (mod>1){
		printdual(mod/2);
		System.out.print(mod%2);
	} else{
		System.out.print(mod);
	}
	}
}