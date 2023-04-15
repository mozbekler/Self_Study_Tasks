package out.SelfStudy.day06_ifStatements;

public class Cigarettes {

    public static void main(String[] args) {

        int age;

        age=10;

        boolean isNotEligible = age<18;

        if (isNotEligible){
            System.out.println("You are not eligible to buy Cigarettes. ");
        }

    }




}

/*

2. A variable named age is declared and given, Write a program that
can check if the person is eligible to buy cigarettes
Ex:
age = 20
output:
You are not eligible to buy Cigarettes
Hint: Assume that a number between 1 ~ 7 is given to the variable

 */