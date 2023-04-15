package out.SelfStudy.hackAJob;

public class Solution {
	public static void main(String[] args) {

		System.out.println(run(1,5));

	}

	public static String run(int N, int M) {
		/*
		* Write your code below; return type and arguments should be according to the problem's requirements
		*/
		StringBuilder sequence = new StringBuilder();


		for(int i = N; i <= M; i++){
			if (i % 15 == 0) sequence.append("FizzBuzz").append(",");
			else if (i % 3 == 0) sequence.append("Fizz").append(",");
			else if (i % 5 == 0) sequence.append("Buzz").append(",");
			else sequence.append(i).append(",");
		}
		
		String result = sequence.toString().substring(0,sequence.length()-1);

		return result;
	}
}
