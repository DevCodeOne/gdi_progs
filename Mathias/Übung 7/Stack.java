public class Stack<T> {
	private int pos;
	private Object[] stack;
	
	public Stack(){
		stack = new Object[5];
	}
	public Stack(int i){
		stack = new Object[i];
	}
	
	void push(T element) throws StackFullEx {
		if (pos< stack.length){
			stack[pos++] = element;
		} else {
			throw new StackFullEx();
		}
			
		
	}
	
	T pop() throws StackEmptyEx{
		if (pos>0) {
			return (T)stack[--pos];
		} else {
			throw new StackEmptyEx();
		}
	}
}