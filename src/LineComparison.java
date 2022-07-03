import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long nx1, nx2, ny1, ny2;
		double len;
		nx1 = 0;
		ny1 = 1;
		nx2 = 2;
		ny2 = 3;

		len = Math.sqrt((nx2 - nx1) * (nx2 - nx1) + (ny2 - ny1) * (ny2 - ny1));

		System.out.println("Enter coordinates to check if the line is equalto line one");

		Scanner sc = new Scanner(System.in);

		System.out.println("enter x1");

		int x1 = sc.nextInt();

		System.out.println("enter y1");

		int y1 = sc.nextInt();

		System.out.println("enter x2");

		int x2 = sc.nextInt();

		System.out.println("enter y2");

		int y2 = sc.nextInt();

		double len1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		Double lengthOne = new Double(len1);
		Double lengthTwo = new Double(len);

		int x = lengthOne.compareTo(lengthTwo);

		if (x < 0) {
			System.out.println("Line one is smaller");
		} else if (x > 0)
			System.out.println("Line one is Greater");
		else
			System.out.println("Lines ae equal");

		if (lengthOne.equals(lengthTwo)) {
			System.out.println("Line 2 is equal to line one");
		}
		sc.close();
	}
}
