package out.SelfStudy.AlgorithmProblems;

public class Sainsburys {
	public static void main(String[] args) {

//		System.out.println(run("2b", 25, 36));

		System.out.println(isValid("4242424242426742"));

	}

	public static String run(String startPosition, int R, int C) {
		/*
		 * Write your code below; return type and arguments should be according to the problem's requirements
		 */
		int row = startPosition.charAt(0) - 49;
		int col = startPosition.charAt(1) - 97;

		row += R;
		col += C;

		row = row % 8;
		col = col % 8;

		row += 49;
		col += 97;

		System.out.println(row);
		System.out.println(col);

		String endPosition = "" + (char) row + (char) col;
		return endPosition;
	}

	public static boolean isValid(String cardNumber) {

		int total = 0;

		for (int i = 0; i < cardNumber.length(); i++) {
			int digit = cardNumber.charAt(i) - '0';

			if (i%2 == 0) {
				digit *= 2;

				if (digit > 9) {
					digit = (digit % 10) + (digit / 10);
				}
			}
//			System.out.println(digit);
			total += digit;
			System.out.println(total);
		}

		return total % 10 == 0;
	}
}
