package out.SelfStudy.day15_WhileLoops;

import java.util.Scanner;

public class UntilNegative {
    public static void main(String[] args) {

        System.out.println(ANSI_YELLOW+"This program is going to find the sum of all numbers (including the last negative number) that you will enter until you enter a negative number.\nPlease enter the numbers:");

        Scanner scanner = new Scanner(System.in);
        int input=0;
        int output=0;

        while(input>=0){
            input=scanner.nextInt();
            output+=input;
        }

        System.out.println(output);

    }

    public static final String ANSI_YELLOW = "\u001B[33m";
}
/*
Create a class named UntilNegative and Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
 */