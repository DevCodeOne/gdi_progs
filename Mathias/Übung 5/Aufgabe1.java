import java.util.Scanner;

public class Aufgabe1{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println(fmod3(n));
}
//rekursiv
public static int fmod3(int mod){
	if (mod>=3){
		return fmod3(mod-3);
	} 
	return mod;
	}
}