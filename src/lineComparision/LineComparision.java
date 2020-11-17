package lineComparision;

import java.util.Scanner;

public class LineComparision {

	void line_Length() {

		double[] lines = new double[2];

		Scanner point = new Scanner(System.in);

		System.out.println("Enter number of lines");
		int n = point.nextInt();
		if (n <= 2) {
			for (int i = 0; i < n; i++) {
				System.out.println("X1");
				double x1 = point.nextInt();
				System.out.println("Y1");
				double y1 = point.nextInt();
				System.out.println("X2");
				double x2 = point.nextInt();
				System.out.println("Y2");
				double y2 = point.nextInt();
				double length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
				System.out.println("Length of Line " + (i + 1) + " " + "is " + length);
				lines[i] = (double) length;
			}

			Double line1 = new Double(lines[0]);
			Double line2 = new Double(lines[1]);

			if (line1.equals(line2) == true) {
				System.out.println("Length of both  lines are equal");
			} else
				System.out.println("Lengths are not equal");

			int compare = line1.compareTo(line2);

			if (compare == 0)
				System.out.println("Lines are Equal");
			else if (compare > 0)
				System.out.println("Line 1 is Greater than Line 2");
			else
				System.out.println("Line 1 is Less than Line 2");

		} else
			System.out.println("Enter valid number");
	}

	public static void main(String[] args) {
		System.out.println("Welcome To Line Comparision Problem");
		LineComparision line = new LineComparision();
		line.line_Length();

	}
}