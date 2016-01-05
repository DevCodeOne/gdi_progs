public class TestWuerfel {
	static int[] Zahl = new int[6];
		
	static int wurf(){
	return (int)((Math.random()*6)+1);	
	} // wurf

	public static void main (String args []) {
		for (int i=0; i<1000000 ;i++){
			Zahl[(wurf()-1)]++;
		}
		for(int i=0; i<6 ; i++){
			System.out.println("Zahl " + (i+1) + ": " + Zahl[i]);
		}	
	}//main
}