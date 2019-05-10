public class TestSwitch1 {
	public static void main(String args[]) {
		char grade = 'B';
		int myScore = 0;
		switch(grade) {
			case 'A' : myScore = 5;
			case 'B' : myScore = 4;
			case 'C' : myScore = 3;
			default  : myScore = 0;
		}
			System.out.println(myScore);
	}
}
