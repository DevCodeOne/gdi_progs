public class Wuerfeln {
	public int gut(){
		return (int)((Math.random()*6)+1);	
	}
	
	public int falsch(){
		return (int)((Math.random()*5.5)+1);
	}
}