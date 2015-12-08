import java.util.*;

public class Test{
	public static void main(String[] args){
		Scanner ein = new Scanner(System.in);
		System.out.println("Wieviele Werte pro Dimension?");
		
		int n = ein.nextInt();
		QMatrix matrix = new QMatrix();
		matrix.allocate(n);
		matrix.set(42);
		matrix.set(1,10);
		matrix.print();
		
		//QMatrix matrix2 = ....
		//QMatrix matrix3 = matrix1.add(matrix2);
		
	}
	
}