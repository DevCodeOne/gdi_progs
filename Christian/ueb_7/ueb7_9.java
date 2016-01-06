public class ueb7_9 {

	public static void main(String [] args) {

	}

	public static int sichere_division(int dividend, int teiler) throws ArithmeticException {
		try {
			return dividend / teiler;
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		}
		return -1;
	}
}
