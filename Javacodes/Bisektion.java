
public class Bisektion {

	public double f(double x) {
		return Math.log(x);
	}
/**
 * 
 * @param a aus Interval [a,b]
 * @param b aus Interval [a,b]
 * @param e sehr kleinen Zahl für Abruchkriterium
 * @return approximierte Nullstelle der Funktion auf gegebenen Interval
 */
	public double executeBisektion(double a, double b, double e) {
		double x;

		do {

			x = (a + b) / 2;

			if (f(a) * f(x) < 0)
				b = x;

			else
				a = x;

		} while (Math.abs(f(x)) > e);

		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bisektion bisektion = new Bisektion();
		bisektion.executeBisektion(-4, 5, 0);
	}

}
