package out.SelfStudy.day06_ifStatements;

public class NumberOfDays {

    public static void main(String[] args) {

        int month =5;

        if (month == 1 || month == 3 || month ==5 ||  month ==7 || month == 8 || month == 10 || month == 12){
            System.out.println("31 days");} if (month == 4 || month == 6 || month ==9 || month == 11){
            System.out.println("30 days");} if (month==2){
                System.out.println("28 days");}

    }
}
/*

2. An integer variable named month is declared and given, Write a
program that can print the number of days in the given month
Ex:
Given:
number = 1
output:
31 days
Hints:
Months that has 31 days are: 1, 3, 5, 7, 8, 10, 12
Months that has 30 days are: 4, 6, 9, 11
Month that has 28 days: 2

 */