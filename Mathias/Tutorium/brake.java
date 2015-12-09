
public class brake{
	public static void main(String[] args){
		for (int i = 1; i<=100; i++){
			if (i==10){
				System.out.println("continue!");
				continue;
			}
			System.out.println(i);
			if (i==20){
				System.out.println("break!");
				break;
			}
		}//For
	}//Main


}//Class
