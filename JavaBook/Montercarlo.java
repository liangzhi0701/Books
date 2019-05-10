public class Montercarlo {
	public static void main(String args[]) {
		final int NUMBER = 100000;
		int n = 0;
		for(int i = 0 ; i < NUMBER ; i++) {
			double x = Math.random() * 2 - 1;
			double y = Math.random() * 2 - 1;
			if((x * x + y * y) <= 1)
				n++;
		}
		double pi =4.0 * n / NUMBER;
		System.out.println(pi);
	}
}
