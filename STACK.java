package JDBC;
import java.util.*;
 class STACK {

	public static void main(String[] args) {
		Stack<String>stack=new Stack <>();
		stack.push("APPLE");
		stack.push("BANANA");
		stack.push("CHERRY");
	System.out.println("stack:"+stack);
	System.out.println("top element(peek:)"+stack.peek());
	System.out.println("popped element:"+stack.pop());
	System.out.println("Is stack empty:"+stack.isEmpty());
	System.out.println("final stack:"+stack);
	}

}
