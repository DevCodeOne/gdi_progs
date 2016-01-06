public class ueb7_4 {

	public static void main(String [] args) {
		Stack stack = new Stack(2); 

		try {
			stack.push(2); 
			stack.push(4); 

			System.out.print(stack.pop()); 
			System.out.print(stack.pop()); 
			stack.pop();
		} catch (StackEmpty e) {
			System.err.println(e.getMessage());
		} catch (StackFull e) {
			System.err.println(e.getMessage());
		}

		System.out.println();
	}

	static class Stack {

		public static final int DEFAULT_STACK_SIZE = 16;

		private int stack[];
		private int stackpointer = -1;

		public Stack(int depth) {
			stack = new int[depth];
		}

		public Stack() {
			this(DEFAULT_STACK_SIZE);
		}

		public void push(int element) throws StackFull {
			if (stackpointer + 1 == stack.length) 
				throw new StackFull();
			
			stack[++stackpointer] = element;
		}

		public int pop() throws StackEmpty {
			
			if (stackpointer == -1)
				throw new StackEmpty();

			return stack[stackpointer--]; 
		}
	}

	static class StackFull extends Exception {
	
		public StackFull() {
			super("Der Stack ist voll");
		}
	}

	static class StackEmpty extends Exception {

		public StackEmpty() {
			super("Der Stack ist leer");
		}
	}
}
