package q9;

public class MyArrayList {
	private Object[] item;
	private int top = -1;
	private int size;
	
	public MyArrayList() {
		item = new Object[10];
		size = 10;
	}
	
	public void add(Object o) {
		if (isFull()) {
			plusArr();
		}
		
		item[++top] = o;
		display();
	}
	
	public void add(int pos, Object o) {
		if (isFull()) {
			plusArr();
		}
		
		top++;
		for (int i = top - 1; i >= pos; i--) {
			item[i + 1] = item[i];
		}
		item[pos] = o;
		display();
		
//		Object[] tmp = new Object[top - pos + 1];
//		for (int i = pos; i <= top; i++) {
//			tmp[i - pos] = item[i];
//		}
//		item[pos] = o;
//		top++;
//		for (int i = pos; i <= top; i++) {
//			item[i] = tmp[i - pos];
//		}
	}
	
	public boolean isEmpty() {
		if (top == -1)
			return true;
		return false;
	}
		
	public boolean contains(Object o) {
		for (int i = 0; i <= top; i++) {
			if (o.equals(item[i]))
				return true;
		}
		return false;
	}
	
	public int size() {
		return top + 1;
	}
	
	public Object get(int pos) {
		return item[pos];
	}
	
	public Object remove(int pos) {
		Object o = item[pos];
		for (int i = pos + 1; i <= top; i++) {
			item[i - 1] = item[i];
		}
		top--;
		
		display();
		return o;
	}
	
	private boolean isFull() {
		if (top == size - 1)
			return true;
		return false;
	}
	
	private void plusArr() {
		Object[] tmp = new Object[size];
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = item[i];
		}
		size += 10;
		item = new Object[size];
		for (int i = 0; i < tmp.length; i++) {
			item[i] = tmp[i];
		}
	}
	
	private void display() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= top; i++) {
			sb.append(item[i] + " ");
		}
		sb.append("\n");
		
		System.out.print(sb.toString());
	}
}
