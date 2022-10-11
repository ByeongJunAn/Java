package Test05;

class Triangle02 {
	double under;
	double heigh;

	public Triangle02(double u, double h) {
		under = u;
		heigh = h;

	}

	double findArea() {
		return (under * heigh) / 2;
	}

	public boolean isSameArea(Triangle02 t) {
		double t1 = findArea();
		double t2 = t.findArea();
		if (t1 == t2)
			return true;
		else
			return false;

	}
}
