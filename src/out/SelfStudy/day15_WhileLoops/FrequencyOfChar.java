package out.SelfStudy.day15_WhileLoops;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {

        System.out.println("Please enter a STRING");
        Scanner scanner=new Scanner(System.in);
        String str = scanner.next();
        System.out.println("Please enter a character");
        char ch= scanner.next().charAt(0);

        int count=0;

        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)==ch){
                count++;
            }
        }

        System.out.println("There are "+count +" "+ch+" in your string: "+str);



    }
}
/*
Create a class named FrequencyOfChar and Write a program that asks user to entera string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */