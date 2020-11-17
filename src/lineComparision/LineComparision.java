package lineComparision;

import java.util.Scanner;

public class LineComparision {

	void line_Length() {

		Scanner point = new Scanner(System.in);

				System.out.println("X1");
				double x1 = point.nextInt();
				System.out.println("Y1");
				double y1 = point.nextInt();
				System.out.println("X2");
				double x2 = point.nextInt();
				System.out.println("Y2");
				double y2 = point.nextInt();
				double length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
				System.out.println("Length of Line "+" " + "is " + length);
	}

	public static void main(String[] args) {
		System.out.println("Welcome To Line Comparision Problem");
		LineComparision line = new LineComparision();
		line.line_Length();

	}
}