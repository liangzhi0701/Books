class A {
	public A() {
		System.out.println("This is A()");
	}
	public A(int m) {
		System.out.println("This is A(int m)");
	}
}

class B extends A {
	public B() {
		System.out.println("This is B()");
	}
	public B(int m) {
		System.out.println("This is B(int m)");
	}
}

class C extends B {
	public C() {
		System.out.println("This is C()");
	}
	public C(int m) {
		System.out.println("This is C(int m)");
	}
}

public class  TestConstruct {
	public static void main(String[] args) {
		C c =new C();
		System.out.println();
		C c2 = new C(10);
	}
}
