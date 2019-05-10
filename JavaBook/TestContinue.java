public class TestContinue {
	public static void main(String[] args) {
		int n = 0;
		int number = (int)(Math.random() * 1000);
		System.out.println("小于" + number + "的质数");
		outer:for(int i = 1;i < number; i += 2) {
			for(int j = 2; j< i; j++) {
				if(i % j == 0)
					continue outer;
			}
			System.out.print(" " + i);
			n++;
			if(n < 10)
				continue;
			System.out.println();
			n = 0;
		}
		System.out.println();
	}
}