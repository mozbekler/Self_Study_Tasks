package out.SelfStudy.day06_ifStatements;

public class CharacterIdentity {

    public static void main(String[] args) {

        char ch;
        ch='z';  //Special characters from 33 to 47, 58 to 64, 91 to 96 and greater than 123
                // digits are from 48 to 57, alphabetic 65 to 90 and 97 to 122


        if (ch>=33 && ch<=47 || ch>=58 && ch<=64 || ch>=91 && ch<=96 || ch>=123){
            System.out.println("Special Character");}

        if (ch>=48 && ch<=57){
            System.out.println("Digits");}

        if (ch>=65 && ch<=90 || ch>=97 && ch<=122){
            System.out.println("Alphabetic Character");}



    }
}
/*
 and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character


			ch = '1'

		output:
			digit

		HINT: You may wanna check out the numbers of the chracters on ASCII table


 */