package out.SelfStudy.codility;


public class EqualSumOfDigits {
    public static void main(String[] args) {

        System.out.println(solution(50000));


    }

    public static int solution(int N) {
        int digit = 0;
        int sum = 0;

        int sum2 = 0;
        int solution = 0;
        int N2 = N;


        while (N2 > 0) {
            digit = N2 % 10;
            sum = sum + digit;
            N2 = N2 / 10;
        }

        for (int i = N + 1; i < 2147483647; i++) {

            String s = String.valueOf(i);
            String[] arr = s.split("");

            for (String s1 : arr) {
                sum2 += Integer.valueOf(s1);

            }
            if (sum == sum2) {
                solution = i;
                break;
            } else sum2 = 0;
        }


        return solution;

    }

}
