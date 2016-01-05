public class Stack{
	private int pos;
	private int[] stack;
	
	public Stack(){
		stack = new int[5];
	}
	public Stack(int i){
		stack = new int[i];
	}
	
	void push(int element) throws StackFullEx {
		if (pos< stack.length){
			stack[pos++] = element;
		} else {
			throw new StackFullEx();
		}
			
		
	}
	
	int pop() throws StackEmptyEx{
		if (pos>0) {
			return stack[--pos];
		} else {
			throw new StackEmptyEx();
		}
	}
}