class Circle {
	float r;
	Circle(float r2) {
		r = r2;
	}
	float getArea() {
		return 3.14f * r * r;
	}
}

class Rect {
	float chang;
	float kuan;
	Rect(float c,float k) {
		chang = c;
		kuan  = k;
	}
	float getArea() {
		return chang * kuan;
	}
}

public class TestArea2 {
	public static void main(String args[]) {
		Circle c = new Circle(10.0f);
		Rect r = new Rect(8.0f,9.0f);
		System.out.println(c.getArea());
		System.out.println(r.getArea());
	}
}

