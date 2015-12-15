public class Aufgabe2 {
	public static void main(String[] args){
		if (Integer.parseInt(args[0])>28) {
			System.out.println("keine Zahl größer 28!");
			return;
		}
		for (int i=0;i<=Integer.parseInt(args[0]);i++){
			for (int j=i; j<=Integer.parseInt(args[0]);j++){
				System.out.print(" ");
			}
			for (int j=0; j<1+i;j++){
				//System.out.println(i + " " + j);
				System.out.print(b(i,j) + " ");
			}
			System.out.println();
		}
			
			
	}
	
	public static int b(int n, int k) {
		
		if (n<0 || k<0) return 0;
		if (!(k == 0 || k == n)) {
			return (b(n-1,k-1) + b(n-1,k));
		} else {
			return 1;
		}
	}
}