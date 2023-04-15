package out.SelfStudy.D;

public class Solution {

	public static void main(String[] args) {

		System.out.println(run("5h",11,25));

	}

	public static String run(String startPosition, int R, int C) {
		/*
		* Write your code below; return type and arguments should be according to the problem's requirements
		*/

		int row = startPosition.toLowerCase().charAt(0);
		int column = startPosition.charAt(1) - 96;

		R = R % 8;
		C = C % 8;

		row = (row + R - 48) % 9 +1;
		//row = (row % 9) + 1;
		char col = (char)(((column + C) % 9) + 97);
		//char col = (char) column;

		String endPosition = "" + row + col;
		return endPosition;
	}
}