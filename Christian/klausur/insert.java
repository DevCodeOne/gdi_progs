public class insert {
	
	public static int[] insert(int a[], int b, int c) {
		if (c > 0 && c < a.length) a[c] = b; 
		return a;
	}
}
