public class ConverDatatype {
	public static void main(String args[]) {
		char c = 'a';
		byte b = 8;
		int i = 24;
		long long1 = 552L;
		float f = 3.45f;
		double d = 563.8987;
		int ic = c + i;
		long li = long1 - i;
		float fb = f * b;
		double df = fb / ic - d;

		System.out.println("ic=" + ic);
		System.out.println("li=" + li);
		System.out.println("fb=" + fb);
		System.out.println("df=" + df);
	}
}