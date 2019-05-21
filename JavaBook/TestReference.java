public class TestReference {
	void change(int b[]) {
		b[0] = 100;
		//b = new int[3];
	}
	public static void main(String args[]) {
		int a[] = {1,2,3};
		TestReference obj = new TestReference();
		obj.change(a);
		System.out.println(a[0]);
	}
}
