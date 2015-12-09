public class Aufgabe9{
public static void main(String[] args){
double q=0.1;
double s=0;
int anzahl = 15;
int val = 0;
	for (int i=0;i<=anzahl;i++){
	s += Math.pow(q,i);
	System.out.println(s);
	}
System.out.println("q aufsteigend: "+s);
s = 0;
	for (int i=anzahl;i>=0;i--){
	s += Math.pow(q,i);
	System.out.println(s);
	}
	System.out.println("q absteigend: "+s);
double genau = (1-Math.pow(q,(anzahl+1)))/(1-q);
System.out.println("genaues Ergebnis:"+genau);
}//main
}//class
double val=1;
//for (int j=0;j<i;j++){
//	val*=i;
//}