package stack;

public class MyStack_test {

	
	public static void main(String[] args) {
		
		MyStack stack = new MyStack(10);
		
		stack.push(3);
		stack.push(111);
		stack.push(4);
		stack.printStack();
		System.out.println("pop : "+stack.pop());
		
	}
}
