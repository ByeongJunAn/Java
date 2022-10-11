package Test04;

class Triangle01 {
	double under;
	double heigh;

	public Triangle01(double under, double heigh) {
		this.under = under;
		this.heigh = heigh;
//	public Triangle01(double u, double h) {
//		under = u;
//		heigh = h;

	}

//	}

	double findArea() {
		return (under * heigh) / 2;

	}
}
