class Test{

}

public class OtherOperator {
	public static void main(String args[]) {
		Test t1 = new Test();
		if(t1 instanceof Test) {
			System.out.println("t1是Test类的实例");
		}
		String s = null;
		s = (t1 == null) ? "t1是空对象" : "t1已创建";
		System.out.println(s);
	}
}