package out.SelfStudy.day14_overloading_loops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Please enter the number to find the sum of all numbers between 1 to the given number:");

        int r = input.nextInt();
        int sum=0;

        for (int i = 0; i <=r; i++) {
            sum =sum+i;

        }

        System.out.println(sum);
    }
}
/*
3. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275
 */