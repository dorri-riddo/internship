package q8;

public class Q8 {

	public static void main(String[] args) {
		Array array = new Array(2, 2, 2);
		array.put(0, 0, 1, 1);
		array.put(0, 1, 0, 2);
		array.put(1, 0, 0, 3);
		array.put(1, 1, 1, 4);
		array.put(1, 0, 1, 5);
		array.put(1, 1, 0, 6);
		System.out.println(array.get(1, 0, 1));
		
		Array array2 = new Array(3, 3, 3);
		array2.put(0, 0, 0, 1);
		array2.put(1, 0, 2, 2);
		array2.put(0, 1, 2, 3);
		array2.put(2, 2, 1, 4);
		array2.put(2, 2, 2, 5);
		System.out.println(array2.get(2, 2, 1));
	}

}
