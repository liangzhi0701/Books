public class MaxDiv {
	public static void main(String[] args) {
		int a = 99;
		int i = a / 2;
		while(i > 0) {
			if(a % i == 0) break;
			i--;
		}
		System.out.println(a + "的最大真约数为：" + i);
	}
}