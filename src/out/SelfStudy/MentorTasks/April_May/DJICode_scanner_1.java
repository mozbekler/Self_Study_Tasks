package out.SelfStudy.MentorTasks.April_May;
import java.util.Scanner;
public class DJICode_scanner_1 {

    public static void main(String[] args) {
        Scanner scanMe = new Scanner(System.in);
        String name, lastName;

        System.out.println("Please write your name:");
        name = scanMe.next();

        scanMe.nextLine();

        System.out.println("Please write your last name:");
        lastName = scanMe.nextLine();

        System.out.print(name + " " + lastName);

        //I want to get name and last name of user from terminal
        //But this code only takes the name, not the last name
        //It directly jumps to the 17. line without waiting user to input the last name
        //This Dirty Java Code needs a RANGER to fix!
    }
}

