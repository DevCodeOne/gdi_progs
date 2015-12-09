public class sterne{
public static void main(String[] args){
char s = '*';
char l = ' ';
int n=10;

for (int zeile=0;zeile<n;zeile++){
	
	for (int spalte=zeile; spalte<=n; spalte++) {
	System.out.print(l);
	} 
	for (int spalte=zeile*2;spalte>=0;spalte--){
	System.out.print(s);
	} 
	System.out.println();
}


}
}