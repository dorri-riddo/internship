package q9;

public class Q9 {

	public static void main(String[] args) {
		MyArrayList ma = new MyArrayList();
		ma.add("three");
		ma.add(0, "one");
		ma.add(1, "two");
		ma.remove(1);
		System.out.println(ma.get(1));
		ma.add(0, "zero");
		System.out.println(ma.contains("three"));
		System.out.println(ma.contains("two"));
		
		ma.add("test");
		ma.add("test1");
		ma.add("test2");
		ma.add("test3");
		ma.add("test4");
		ma.add("test5");
		ma.add(6, "test6");
		ma.add("test7");
		
		ma.remove(6);
		
		System.out.println(ma.size());
		
		Iterator it = new Iterator(ma);
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.print("\n");
	}

}
