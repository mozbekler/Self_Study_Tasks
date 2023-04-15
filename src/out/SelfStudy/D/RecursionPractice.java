package out.SelfStudy.D;

public class RecursionPractice {
    public static void main(String[] args) {

        System.out.println(exponent(3,2));
        System.out.println(fibonacci(5));

    }

    public static int exponent(int x, int n){
        if (n == 0) return 1;
        else return x*exponent(x,n-1);
    }

    public static int fibonacci(int x){
        if (x <= 2) return x;
        else return fibonacci(x-1) + fibonacci(x-2);
    }
}
