public class TestSwap {
	void swap(int u, int v) {
		int tmp = u;
		u = v;
		v = tmp;
	}

	public static void main(String args[]) {
		int a = 1, b = 2;
		TestSwap obj = new TestSwap();
		obj.swap(a, b);
		System.out.println("a = " + a + "\tb = " + b);
	}
}
