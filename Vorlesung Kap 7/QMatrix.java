public class QMatrix {
	int[][] feld;	
	
	void allocate(int n){
		feld = new int[n][n];
	}//allocate
		
	void set(int n){
		for (int i = 0; i<feld.length; i++){
			for (int j = 0; j<feld[i].length; j++){
				feld[i][j]=n;			
			}//for j			
		}//for i		
	}//set
	
	//überladene Methode
	void set(int zeile, int n){
		for (int j = 0; j<feld[zeile].length; j++){
			feld[zeile][j]=n;			
		}//for j			
	}// set
	
	void print(){
		for (int i = 0; i<feld.length; i++){
			for (int j = 0; j<feld[i].length; j++){
				System.out.printf("%-5d",feld[i][j]);
			}//for j
			System.out.println();
		}//for i
	}
	
	void add(QMatrix q){
		
	}
}


