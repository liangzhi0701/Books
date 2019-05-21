public class TestStatic {
	static int m = 1;

	public static void main(String args[]) {
		TestStatic.m++;
		System.out.println("TestStatic.m =" + TestStatic.m);
		TestStatic obj = new TestStatic();
		obj.m++;
		System.out.println("obj.m = " + obj.m);
	}
}
