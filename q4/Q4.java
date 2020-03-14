package q4;

public class Q4 {

	public static void main(String[] args) {
		Stack s = new Stack(10);
		s.push("One");
		s.push("Tow");
		s.push(new Integer(1));
		s.pop();
		s.push(new Double(5.0));
		s.push("three");
		s.pop();
		s.pop();

	}

}
