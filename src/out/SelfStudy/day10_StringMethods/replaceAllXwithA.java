package out.SelfStudy.day10_StringMethods;

import java.util.Scanner;

public class replaceAllXwithA {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a word");

        String word = input.next();

        word=word.replace("x","a");

        word=word.replace("X","a");

        System.out.println(word);


        input.close();
    }
}
/*
3. Write a program that asks user to enter a word. and replace all the x or X with character a
	                    Input:
	                        xcodeX
	                    Output:
	                        acodea
 */