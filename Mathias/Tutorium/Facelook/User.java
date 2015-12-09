public class User{
	
	//EIGENSCHAFTEN
	public String name, passwort, wohnort;
	public int alter;
	public boolean weiblich;
	
	//KONSTRUKTOREN
	public User(String name, String passwort){
		this.name = name; //Übergabevariable = Klassenvariable 
		this.passwort = passwort; // ALSO this.Klassenvariable
	}
		
	// METHDÒDEN
	public boolean login(){
		return true;
	}
}