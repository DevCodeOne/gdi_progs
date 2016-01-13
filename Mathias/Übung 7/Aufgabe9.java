public class Aufgabe9{
	public static void main(String [] args){
		int erg=0;
		
		try {
			System.out.println(div(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
		} catch (ArithmeticException e) {
			System.out.println("Kein NULL");
		}
		
		
	}	
	
	static int div(int a, int b) throws ArithmeticException{
		if (b==0) throw new ArithmeticException();
			
			return a/b;
	}
}