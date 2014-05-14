
public class Stack {
	String [] array;
	int top=0;

	
	public Stack(int n){
		array = new String[n];
		}
	public void push(String data){
		if (top == array.length){
			System.out.println("Stack is full.");
			return;
		}
		array[top] = data;
		top = top + 1;
		}
	
	public String pop(){
		if (top == 0){
			System.out.println("No data in Stack");
			return null;
		}
		String data="" ;
		top = top -1;
		data = array[top];
		
		
		return data;
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack(4);
		stack.pop();
		stack.push("animesh");
		stack.push("nnnn");
		stack.push("vaah");
		stack.push("hehe");
		stack.push("LLLLLLLL");
		stack.pop();
		stack.push("vaah");
		stack.pop();
		stack.push("LLLLLLLL");
		stack.pop();
		stack.pop();
		stack.pop();
	}
}
