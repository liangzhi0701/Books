public class TestIf {
	public static void main(String args[]) {
		int x = 37;
		if (x < 0)
			System.out.println(fun1(x));
		else
			System.out.println(fun2(x));
	}

	static int fun1(int a) {
		return a * a - 1;
	}
	
	static double fun2(int a) {
		return Math.sqrt(a) - 1;
	}
}