public class TestVariable {
	public static void main(String args[]) {
		int i1 = 123;
		byte b1 = 67;
		byte b2 = 89;
		byte b3 = (byte)(b1 + b2);
		System.out. println(b3);
		double d2 = 1e200;
		float f3 = 1.23f;
		long l1 = 123;
		long l2 = 30000000000L;
		float f = l1 + l2 + f3;
		long l = (long)f;
	}
}
