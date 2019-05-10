public class TestIf2 {
	public static void main(String args[]) {
		int days = 0;
		int month = 2;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month ==
		 10 || month == 12)
			days = 31;
		else if (month == 4 || month == 6 || month == 9 || month == 11)
			days = 30;
		else 
			days = 28;
		System.out.println(days);
	}
}