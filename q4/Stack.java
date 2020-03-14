package q4;

public class Stack {
	private Object[] array;
	private int top = -1;
	private int max;
	
	Stack(int max) {
		this.max = max;
		array = new Object[max];
	}
	
	public void push(Object o) {
		if (!isFull()) {
			array[++top] = o;			
		} else {
			Object[] temp = new Object[max];
			for (int i = 0; i < temp.length; i++) {
				temp[i] = array[i];
			}
			max += 10;
			array = new Object[max];
			
			for (int i = 0; i < temp.length; i++) {
				array[i] = temp[i];	
			}
		}
		display();
	}
	
	public Object pop() {
		if (isEmpty()) {
			return "스택이 비었습니다";
		} else {
			System.out.println("pop 된 원소 : " + array[top--]);
			display();
			return array[top];
		}
	}
	
	public Object top() {
		return array[top];
	}
	
	public boolean isEmpty() {
		if (top == -1)
			return true;
		return false;
	}
	
	private boolean isFull() {
		if (top == max - 1)
			return true;
		return false;
	}
	
	public void display() {
		StringBuilder sb = new StringBuilder();
		sb.append("현재 배열 상태 : ");
		for (int i = 0; i <= top; i++) {
			if (i == top)
				sb.append(array[i]);
			else
				sb.append(array[i] + ", ");
		}
		
		System.out.println(sb.toString());
	}
}
