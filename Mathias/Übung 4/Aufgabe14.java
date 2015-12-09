import java.util.Scanner;

public class Aufgabe14{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int jahr = sc.nextInt();
	if (jahr%400==0){
		System.out.println("ist Schaltjahr!");
	}
	else {
		if (jahr%100==0) {
			System.out.println("ist kein Schaltjahr!");
		}
		else {
			if (jahr%4==0) {
				System.out.println("ist Schaltjahr!");
			}
			else {
				System.out.println("ist kein Schaltjahr!");
			}
		}
	}
			
}
}