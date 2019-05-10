//Circle.java
public class Circle {
	public static final double PI =3.14;
	public double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * PI;
	}

	public static void main(String[] args) {
		Circle aCircle = new Circle(2.0);
		double area = aCircle.getArea();
		System.out.println("mianjishi:"+area);
	}
}