import java.util.Stack;
public class StackUtils {
	
	Stack stack;
	
	public StackUtils() {
		// TODO Auto-generated constructor stub
		
		
	}
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("ani");
		stack.push("mishra");
		System.out.println(stack.pop());
		System.out.println(stack.peek());
	}
 }
