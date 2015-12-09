import java.util.Scanner;

public class Aufgabe13{
public static void main(String[] args){
	//Scanner sc = new Scanner(System.in);
	//char zeichen = sc.nextchar();
	char zeichen = 'c';
	switch (zeichen) {
		case 'a':
		case 'A': System.out.println("Anna");
			break;
		case 'b':
		case 'B': System.out.println("Berta");
			break;
		default: System.out.println("Sonderfall!");
	}
			
}
}