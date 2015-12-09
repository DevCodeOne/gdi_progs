public class Aufgabe8 {
	public static void main(String[] args){
		System.out.println(palindrom(args[0].toLowerCase()));
	}
	
	public static boolean palindrom(String p){
		System.out.println(p);
		if (p.length()>0){
			if (p.charAt(0)==p.charAt((p.length()-1))){
				return palindrom(p.substring(1,(p.length()-1)));
			} else {
				return false;
			}
		}
		return true;
	}
}