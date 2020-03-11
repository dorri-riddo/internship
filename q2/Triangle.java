package q2;

public class Triangle extends Shape{
	private float x;
	private float y;
	
	public Triangle(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public float getArea() {
		return (float) (x * y * (0.5));
	}
}
