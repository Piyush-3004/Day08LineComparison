
public class LineComparison {

	public static void main(String[] args) {
		long x1, x2, y1, y2;
		x1 = 0;
		y1 = 1;
		x2 = 2;
		y2 = 3;
		double len1;

		len1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		System.out.println("Length of line is : " + len1);

	}
}
