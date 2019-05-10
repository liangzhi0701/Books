public class GoldBach {
	public static boolean isPrime(int x) {
		for(int i = 2 ; i < x ; i++)
			if(x % i == 0)
				return false;
			return true;
	}
	public static void main(String args[]) {
		for(int j = 6 ; j < 100 ; j += 2) {
			for(int k = 3 ; k < j / 2 ; k += 2)
				if(isPrime(k) * isPrime(j - k)) {
					System.out.println(j);
				}
		}
	}
}