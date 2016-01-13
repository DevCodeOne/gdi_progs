import java.util.*;

public class TestStack {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
	 	Stack<Integer> s;
	 	if (args.length >= 1){		
	 		s = new Stack<Integer>(Integer.parseInt(args[0]));
	 	} else {
	 		s = new Stack<Integer>();
	 	}
		
	 	do {
	 		System.out.println("Was wollen sie tun? push oder pop!"); 	
	 		switch (sc.next().toLowerCase()) {
	 		case "push"  : {	
	 			System.out.println("Zahl für den Stack");
	 			try {
	 				s.push(sc.nextInt());
	 			}
	 			catch (StackFullEx e) {
	 				System.out.println(e.getMessage());
	 			}
	 			break;
	 		}
	 		case "pop"  : {
	 			try {
	 				System.out.println("Oberste Zahl auf dem Stack: " + s.pop());
	 			}
	 			catch (StackEmptyEx e) {
	 				System.out.println(e.getMessage());
	 			}
	 			break;
	 		}
	 		default : System.out.println("falsche Eingabe");
			} 
		} while (true);
	}	
}