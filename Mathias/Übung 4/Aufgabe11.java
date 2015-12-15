public class Aufgabe11{
public static void main(String[] args){
double EPSILON=1E-15;
double a,b,c,null1,null2,zwischensumme;
a = 15;
b = 25;
c = 13;
if (a>EPSILON){
	zwischensumme = (b*b)-(4*a*c);
	if (zwischensumme>EPSILON){
		null1 = ((-1*b)+(Math.sqrt(zwischensumme)))/(2*a);	
		null2 = ((-1*b)-(Math.sqrt(zwischensumme)))/(2*a);
		System.out.println("Nullstelle 1 = " +null1);
		System.out.println("Nullstelle 2 = " +null2);
	} else {
		System.out.println("Negative Wurzel!");
	}
} else {
	System.out.println("a darf nicht 0 sein!");
}
}//main
}//class