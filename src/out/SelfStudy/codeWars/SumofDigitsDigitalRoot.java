package out.SelfStudy.codeWars;

public class SumofDigitsDigitalRoot {

    public static void main(String[] args) {

        System.out.println(digital_root(15514998));

    }

    public static int digital_root(int n) {
        int digit=0;
        int sum=0;
        if (n<10) return n;
        else{
            while (n>0){
                digit=n%10;
                sum=sum+digit;
                n=n/10;
            }
         n=sum;
           return digital_root(n);
        }

    }
}
/*
int m=n;
        if (n<10) return n;
        else {


            while (m > 0) {
                digit = m % 10;
                 n= n + digit;
                 m = m / 10;
            }
            if (n>9){
                digital_root(n);
            }
            else return n;


        }
    return n;
 */