class VariousInit {
	int x;
	int y = 10;
	Integer obj;
	Integer obj2 = new Integer(10);

	public VariousInit() {};
	public VariousInit(int u) {
		x = u;
	}

	public static void main(String args[]) {
		VariousInit t = new VariousInit();
		System.out.println("t.x = " + t.x);
		System.out.println("t.y = " + t.y);
		System.out.println("t.obj = " + t.obj);
		System.out.println("t.obj2 = " + t.obj2);

		VariousInit t2 = new VariousInit(100);
		System.out.println("t2.x = " + t2.x);
		System.out.println("t2.y = " + t2.y);
		System.out.println("t2.obj = " + t2.obj);
		System.out.println("t2.obj2 = " + t2.obj2);
	}
}
