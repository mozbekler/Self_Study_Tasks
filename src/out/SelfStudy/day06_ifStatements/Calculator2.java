package out.SelfStudy.day06_ifStatements;

public class Calculator2 {

    public static void main(String[] args) {

        double n1 = 23.6, n2 = 85.6;
        char mathOperator = '4';

        if  (mathOperator != '+' && mathOperator != '-' && mathOperator!= '*' && mathOperator!= '/'){
            System.out.println("invalid operator");}


        if (mathOperator == '*') {
            System.out.println( n1 * n2 );
        }
        if (mathOperator == '+') {
            System.out.println( n1 + n2);
        }
        if (mathOperator == '-') {
            System.out.println( n1 - n2 );
        }
        if (mathOperator == '/') {
            System.out.println( n1 / n2 );
        }
    }
}
