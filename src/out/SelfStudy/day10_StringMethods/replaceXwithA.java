package out.SelfStudy.day10_StringMethods;

import java.util.Scanner;

public class replaceXwithA {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a word staring with letter x");

        String word = input.next();

        String word2;

        if (word.startsWith("x")){
            System.out.println(word.replaceFirst("x","a"));

        }else{
            System.out.println("Invalid word");
        }

    input.close();
    }
}
/*
2. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
	                    Input:
	                        xcodex
	                    Output:
	                        acodex
 */