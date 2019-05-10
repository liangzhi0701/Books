import java.util.Scanner;
public class Fibonacci {
	public static int fib(int i) {
		if(i == 0)
			return 0;
		else if (i == 1)
			return 1;
		else
			return fib(i - 1) + fib(i - 2);
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		System.out.println(fib(x));
	}
}
