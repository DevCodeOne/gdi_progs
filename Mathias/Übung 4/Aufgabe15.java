import java.util.Scanner;

public class Aufgabe15{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int quer = sc.nextInt();
	int r =0;
	do {
		r += quer%10;
		quer = quer/10;
		
	} while (quer>=1);
	System.out.println(r);
}
}