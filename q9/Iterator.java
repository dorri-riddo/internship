package q9;

public class Iterator {
	private MyArrayList ma;
	private int num = -1;
	
	public Iterator(MyArrayList ma) {
		this.ma = ma;
	}
	
	public boolean hasNext() {
		if (num == ma.size() - 1)
			return false;
		return true;
	}
	
	public Object next() {
		return ma.get(++num);
	}
}
