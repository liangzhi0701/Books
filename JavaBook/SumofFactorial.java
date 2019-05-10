public class SumofFactorial {
	public static void main(String args[]) {
		int k = 6;
		int sum = 0;
		for (int i = 0;i <= 6;i++) {
			sum = sum + factorial(i);
		}
		System.out.println("1!+2!+3!...+6!=" + sum);
	}
	static int factorial(int n) {
		int t = 1;
			for (int i = 1;i <= n;i++) {
				t = t * i;
			}
			return t;
		}
	}
