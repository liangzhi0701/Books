public class TradeElement {
	static int array[] = {1,3,7,-23,34,0,23,2,9,7,78};
	public static void main(String args[]) {
		print();
		int temp = 0;
		int i = 0;
		int j = array.length - 1;
		while ( i < array.length / 2) {
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
		System.out.println();
		print();
	}

	static void print() {
		for (int i = 0;i<array.length;i++)
			System.out.print(" " + array[i]);
	}
}
