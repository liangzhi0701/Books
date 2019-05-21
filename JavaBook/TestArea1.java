class Area {
	float getCircle(float r) {
		return 3.14f * r * r;
	}
	float getRect(float chang, float kuan) {
		return chang * kuan;
	}
}

public class TestArea1 {
	public static void main(String args[]) {
		Area obj = new Area();
		System.out.println(obj.getCircle(10.0f));
		System.out.println(obj.getRect(8.0f,9.0f));
	}
}
