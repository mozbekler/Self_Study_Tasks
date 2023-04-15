package out.SelfStudy.day14_overloading_loops;

public class Palindrome {
    public static void main(String[] args) {

        String input="Level";
        String reverse="";

        for (int i =input.length()-1; i >=0 ; i--) {

            reverse+=input.charAt(i);
        }

        if (reverse.equalsIgnoreCase(input)){
            System.out.println("the word is a palindrome");
        }else{
            System.out.println("the word is not a palindrome");
        }

    }
}
/*
7. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true
 */