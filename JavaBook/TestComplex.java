public class TestComplex {
	public static void main(String args[]) {
		Complex3 c1 = new Complex3(1.0f, 2.0f);
		Complex3 c2 = new Complex3(3.0f, 4.0f);
		Complex3 c3 = c1.Add(c2);
		c3.display();
	} 
}
