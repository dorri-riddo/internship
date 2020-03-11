package q2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float r = sc.nextFloat();
		Shape circle = new Circle(r);
		System.out.println("circle : " + circle.getArea());
		
		float x = sc.nextFloat();
		float y = sc.nextFloat();
		Shape rectangle = new Rectangle(x, y);
		System.out.println("rectangle : " + rectangle.getArea());
		
		float x2 = sc.nextFloat();
		float y2 = sc.nextFloat();
		Shape triangle = new Triangle(x2, y2);
		System.out.println("triangle : " + triangle.getArea());
	}
}
