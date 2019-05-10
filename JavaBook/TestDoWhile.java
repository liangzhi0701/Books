public class TestDoWhile {
	public static void main(String args[]) {
		int i = 0;
		char c;
		do {
			c = (char)((int)(Math.random() * 26) + 'A');
			i++;
		} while (c != 'Q');
		System.out.println("循环" + i + "次后出现了字母Q");
	}
}