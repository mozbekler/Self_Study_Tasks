package out.SelfStudy.day28_encapsulation;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        String pw="j5aaaaaaa";
        char[] pwChar=pw.toCharArray();
        System.out.println(Arrays.toString(pwChar));

       isStrongPassword(pw);



    }
    public static void isStrongPassword(String password){
        char[] pwChar=password.toCharArray();

        if  (pwChar.length<8){
            System.err.println("less than 8 chars");
        }

        int countLetter=0;

        for (char value : pwChar) {
            if (Character.isLetter(value)) {
                countLetter++;
            }
        }

        if (countLetter<1){
            System.err.println("Count letter: "+countLetter);
        }
        int countDigit=0;

        for (char value : pwChar) {
            if (Character.isDigit(value)) {
                countDigit++;
            }
        }

        if (countDigit<1){
            System.err.println("count digit: "+ countDigit);
        }

        int countSpecialChar=0;

        for (char c : pwChar) {
            if (!(Character.isLetterOrDigit(c))){
                countSpecialChar++;
            }
        }

        if (countSpecialChar<1){
            System.err.println("special Char: "+ countSpecialChar);
        }

        int countSpace=0;

        for (char value : pwChar) {
            if (Character.isSpaceChar(value)){
                countSpace++;
            }
        }

        if (countSpace>0){
            System.err.println("countspeace: "+ countSpace);
        }

        System.out.println(countLetter);
        System.out.println(countDigit);
        System.out.println(countSpace);

    }
}
