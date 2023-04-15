package out.SelfStudy;

public class Test {

    public static void main(String[] args) {

    }

    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            fb(i);
        }
    }

    public static void fb(int n) {
        if (n % 15 == 0) {
            System.out.println("FizzBuzz");
        } else if (n % 3 == 0) {
            System.out.println("Fizz");
        } else if (n % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(n);
        }
    }

}
