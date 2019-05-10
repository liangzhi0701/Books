import java.util.*;

public class Calendar2 {
	public boolean isLeapYear(int year) {
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			return true;
		}
		return false;
	} 
	
	public int getDays(int year, int month) {
		int[] day  = {31,28,31,30,31,30,31,31,30,31,30,31};
		int[] day1 = {31,29,31,30,31,30,31,31,30,31,30,31};
		if (this.isLeapYear(year)) {
			return day[month - 1];
		} else {
			return day1[month - 1];
		}
	}

	public int getWeek(int year,int month) {
		Date date = new Date();
		date.setYear(year);
		date.setMonth(month);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(calendar.DAY_OF_WEEK);
	}

	public void showPrint(int year, int month) {
		int day  = this.getDays(year, month);
		int week = this.getWeek(year, month);
		System.out.println("ri\tyi\ter\tsan\tsi\twu\tliu\n");
		for (int i = 1 ; i <= week ; i++) {
			System.out.print(" \t");
		}
		System.out.print(" \t");
		for (int j = 1 ; j<= day ; j++) {
			if ((j + week) % 7 == 0) {
			}
				System.out.print(j + "\t");
			}
		}

	public static void main(String args[]) {
		Calendar2 y = new Calendar2();
		y.showPrint(2012, 3);
	}
}
