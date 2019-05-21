class MyMath {
	static int getGongYue(int u, int v) {
		int value = u % v;
		while(value != 0) {
			u = v;
			v = value;
			value = u % v;
		}
		
		return v;
	}
}

public class Fenshu {
	private int zi;
	private int mu;

	public Fenshu() {
		zi = 0;
	}

Fenshu Add(Fenshu two) {
		Fenshu result = new Fenshu();
		result.mu = mu * two.mu;
		result.zi = zi * two.mu + mu * two.zi;
		int v = MyMath.getGongYue(result.zi, result.mu);
		result.mu /= v;
		result.zi /= v;
		return result;
	}

	void display() {
		System.out.println("fenshu is:", + zi + "/" + mu);
	}
}

public class TestFenshu {
	public static void main(String[] args) {
		Fenshu f1 = new Fenshu(1,2);
		Fenshu f2 = new Fenshu(40,60);
		Fenshu result = f1.Add(f2);
		result.display();
	}
}
