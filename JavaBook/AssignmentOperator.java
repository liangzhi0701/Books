public class AssignmentOperator {
	public static void main(String args[]) {
		int op1 = 6;
		int op2 = 2;
		int x,y,z;
		x = op1 + op2;
		op1 += op2;
		System.out.println(op1);
		op1 %= op2;
		System.out.println(op1);
		byte b = 100;
		op1 = b;
		b = (byte)op2;
	}
}