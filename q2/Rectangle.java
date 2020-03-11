package q2;

public class Rectangle extends Shape {
	private float x;
	private float y;
	
	public Rectangle(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public float getArea() {
		return x * y;
	}
}
