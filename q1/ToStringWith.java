package q1;

public class ToStringWith {
	private int x;
	private int y;
	
	public ToStringWith(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "toStringWith[" + x + "," + y + "]";
	}

	public static void main(String[] args) {
		System.out.println(new ToStringWith(42, 86));
	}

}
