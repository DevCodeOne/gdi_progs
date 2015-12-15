import java.util.Scanner;

public class Aufgabe1b{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int modu = sc.nextInt();
	modu = rest(modu);
	System.out.println(modu);
}
public static int rest(int mod){
	mod = mod - ((mod/3)*3);
	return mod;
}
}