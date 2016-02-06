public class quadratmatrix {
	
	private int feld[][]; 

	public quadratmatrix(int n) {
		feld = new int[n][n];		
	}	

	public void fill(int value) {
		for (int i = 0; i < feld.length; i++) {
			for (int j = 0; j < feld[0].length; j++) {
				feld[i][j] = value;
			}	
		}
	}

	public void print() {
		for (int i = 0; i < feld.length; i++) {
			for (int j = 0; j < feld[0].length; j++) {
				System.out.print(feld[i][j]);	
			}	
			System.out.println();
		}
	}

	public quadratmatrix add(quadratmatrix matrix) {
		quadratmatrix q = new quadratmatrix(feld.length); 

		if (matrix.feld.length != feld.length) return null;

		for (int i = 0; i < feld.length; i++) {
			for (int j = 0; j < feld[0].length; j++) {
				q.feld[i][j] = matrix.feld[i][j] + feld[i][j];
			}
		}
		return q;
	}


}
