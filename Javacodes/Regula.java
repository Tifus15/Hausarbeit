
public class Regula {

	public double f(double x) {
		return Math.log(x);
	}

	public double execute(double a, double b, double e) {
		double x = a;
		double x1;

		do {
			x1 = x;
			x = (f(b) * a - f(a) * b) / (f(b) - f(a));

			if (f(a) * f(b) * f(x) <= 0)
				b = x;

			else
				a = x;
			System.out.println(
					a + " " + b + " " + f(a) + " " + f(b) + " " + x + " " + x1 + " " + Math.abs(x - x1) + " " + e);

		} while (Math.abs(x - x1) >= e);

		return x;
	}

	public double modExecute(double a, double b, double e) {
		double F = f(a);
		double G = f(b);
		double x1;
		double x = a;

		do {
			x1 = x;
			x = (G * a - F * b) / (G - F);

			if (f(a) * f(b) * f(x) <= 0) {
				b = x;
				G = f(x);
				if (f(x) * f(x1) > 0)
					F = F / 2;

			} else {
				a = x;
				F = f(x);
				if (f(x) * f(x1) > 0)
					G = G / 2;
			}
			System.out.println(
					a + " " + b + " " + f(a) + " " + f(b) + " " + x + " " + x1 + " " + Math.abs(x - x1) + " " + e);

		} while (Math.abs(x - x1) > e);
		return x;
	}

	public static void main(String[] args) {

		Regula regula = new Regula();
		regula.execute(0.5, 10, Math.pow(10, -9));
		System.out.println();
		regula.modExecute(0.5, 10, Math.pow(10, -9));

	}

}
