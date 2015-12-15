public class ggtwhile{
	public static void main(String[] args){
		int a, b, r;
		a=960;
		b=230;
		do{
			r=a%b;
			System.out.println("r =" +r);
			a=b;
			System.out.println("a =" +a);
			b=r;
			System.out.println("b =" +a);
		} while (r!=0);

	}//Main
}//Class
