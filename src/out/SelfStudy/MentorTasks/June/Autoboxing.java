package out.SelfStudy.MentorTasks.June;

import java.util.ArrayList;

public class Autoboxing {
    public static void main(String[] args) {

        //  value assigned to a variable
        int num1  = 200;
        Integer num2 = num1;  // Autoboxing

        System.out.println(num2);

        System.out.println("----------------");

        // Value Passed as a prameter

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(5);   // turn int 5 into Uppercase Integer 5
        //          5 is int literal
    }
}
