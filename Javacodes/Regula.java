
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
			System.out.println(a+" "+b+" "+f(a)+" "+f(b)+" "+x+" "+x1+" "+ Math.abs(x-x1)+" "+ e );

		} while (Math.abs(x - x1) >= e);

		return x;
	}

	public static void main(String[] args) {
		
		Regula regula = new Regula();
		regula.execute(0.5,10, Math.pow(10, -9));

	}

}
