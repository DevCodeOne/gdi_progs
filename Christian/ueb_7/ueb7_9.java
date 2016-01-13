public class ueb7_9 {

	public static void main(String [] args) {
		try {
			sichere_division(10, 0);
		} catch (ArithmeticException e) {	
			System.err.println(e.getMessage());
		}
	}

	public static int sichere_division(int dividend, int teiler) throws ArithmeticException {
		//if (teiler == 0) 
		//	throw new ArithmeticException("Nicht durch null"); doppelt wird vom system bereits geworfen
		
		return dividend / teiler;
	}
}
