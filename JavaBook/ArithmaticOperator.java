public class ArithmaticOperator {
	public static void main(String args[]) {
		int x1 = 17;
		int x2 = 4;
		
		System.out.println(x1 + x2);
		System.out.println(x1 - x2);
		System.out.println(x1 * x2);
		System.out.println(x1 / x2);
		System.out.println(x1 % x2);
		System.out.println((float) x1 / x2);
		
		int y1;
		int y2 = -3;

		y1 = y2++;
		System.out.println(y1 + " " + y2);
		y1 = ++y2;
		System.out.println(y1 + " " + y2);
		y1 = y2--;
		System.out.println(y1 + " " + y2);
	}
}