package out.SelfStudy;

public class Android {

    public static void main(String[] args) {


  //      System.out.println(fibonacci(3));
        System.out.println(mystery(2437,875));


    }

    public static int fibonacci(int num) {
        if (num == 0) return 0;
        if (num == 1) return 1;

        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static boolean hasEqualSum(int num1, int num2, int num3) {
        return (num1 + num2 == num3);


    }

    public static boolean shouldWeWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) return false;
        return barking && (hourOfDay < 8 || hourOfDay > 22);

    }

    public static String printEqual(int num1, int num2, int num3) {
        if (num1 < 0 || num2 < 0 || num3 < 0) return "Invalid value";
        if (num1 == num2 && num2 == num3) return "All numbers are equal";
        if (num1 != num2 && num2 != num3 && num1 != num3) return "All numbers are different";
        return "Neither all are equal or different";
    }

    public static int twelvesMaximum(int n) {
        if (n < 12) return 12;
        return n;
    }

    public static String describing(int n) {
        if (n == 1) return "ONE";
        if (n == 2) return "TWO";
        if (n == 3) return "THREE";
        if (n == 4) return "FOUR";
        if (n == 5) return "FIVE";
        if (n == 6) return "SIX";
        if (n == 7) return "SEVEN";
        if (n == 8) return "EIGHT";
        if (n == 9) return "NINE";
        if (n == 10) return "TEN";
        return "OTHER";

    }
    public static String largestNumber(int n) {
        if (n == 0) return "-1";

        String result="";

        for (int i = 0; i < n; i++) {
            result=result + "9";
        }

        return result;
    }

    public static int mystery (int a, int b){
        if (a == b) return a;
        if (a > b) {
            a = a-b;
            return mystery(a,b);
        }
        else  {
            b = b-a;
            return mystery(a,b);
        }




    }

    public static int addNumbers(float a, float b) {
        float sum = a+b;
        return (int) sum;
    }



}
