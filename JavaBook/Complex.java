class Complex {
	float real;
	float virt;
	void Add(float r1, float v1, float r2, float v2) {
		real = r1 + r2;
		virt = v1 + v2;
	}
	void display() {
		System.out.println("" + real + "+ i" + virt);
	}
}
