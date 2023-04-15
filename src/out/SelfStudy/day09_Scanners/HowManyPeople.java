package out.SelfStudy.day09_Scanners;

import java.util.Scanner;

public class HowManyPeople {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many people do you live with?");

        byte num = input.nextByte();

        String result="";

        if (num>=0){
           result = (num<3)? "Live with less than 3 people" :(num<=6)? "Live with 3 - 6 people" : "Live with more than 6 people";
        }else{result="Invalid number";

        }


        System.out.println(result);

        input.close();
    }
}
/*
Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"
 */