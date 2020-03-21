package q8;

public class Array {
	private int tmp;
	private int[] array;
	
	public Array(int a, int b, int c) {
		tmp = a;
		array = new int[a * b * c];
	}
	
	public void put(int a, int b, int c, int value) {
		int pos = a * 1 + (b * (int) Math.pow(tmp, 1)) + (c * (int) Math.pow(tmp, 2));
		array[pos] = value;
	}
	
	public int get(int a, int b, int c) {
		int pos = a * 1 + (b * (int) Math.pow(tmp, 1)) + (c * (int) Math.pow(tmp, 2));
		return array[pos];
	}
}
