package q2;

public class Circle extends Shape{
	private float r;
	
	public Circle(float r) {
		this.r = r;
	}
	
	@Override
	public float getArea() {
		return (float) (r * r * Math.PI);
	}
}
