package out.SelfStudy.day15_WhileLoops;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        int a=19;
        int b=5;
        int quotient=0;

        while (a>=b){
            a=a-b;
            quotient++;
        }

        System.out.println("Quotient : "+quotient);
        System.out.println("Remainder : "+a);

    }
}
/*
Create a class named DivideTwoNumbers and Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.
 */