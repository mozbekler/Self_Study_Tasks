package out.SelfStudy.day14_overloading_loops;

public class LettersDigitsChars {

    public static void main(String[] args) {
        String input = "mn@#123Ab!";
        char c;

        String letters="";
        String characters="";
        String digits="";


        for (int i = 0; i <=input.length()-1; i++) {

            c=input.charAt(i);

            if(c>='!' && c<'0' || c>=':' && c<'A' || c>='[' && c< 'a' ){
                characters+=c;

            }
            if(c>='A' && c<='Z' || c>= 'a' && c<='z'){
                letters+=c;
            }
            if(c>='0' && c<='9'){
                digits+=c;
            }


        }
        System.out.println("letters: "+letters);
        System.out.println("digits = " + digits);
        System.out.println("characters = " + characters);
    }



}
/*
 write a program that can retrieve the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */