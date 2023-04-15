package out.SelfStudy.day10_StringMethods;

import java.util.Scanner;

public class ly {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a word");

        String word = input.next();

        if (word.trim().toLowerCase().endsWith("ly")){
            System.out.println("really???");
        }else{
            System.out.println("never mind");
        }


    }
}
/*
4. ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
 */