import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
		long nx1, nx2, ny1, ny2;
		double len;
		nx1 = 0;
		ny1 = 1;
		nx2 = 2;
		ny2 = 3;

		len = Math.sqrt((nx2 - nx1) * (nx2 - nx1) + (ny2 - ny1) * (ny2 - ny1));

		System.out.println("Length of line is : " + len);

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

		System.out.println("distanc : " + len1);
		Double lengthOne = new Double(len);
		Double lengthTwo = new Double(len1);

		if (lengthOne.equals(lengthTwo)) {
			System.out.println("Line 2 is equal to line one");
		}

		sc.close();

	}
}
