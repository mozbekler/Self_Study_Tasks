package out.SelfStudy.day15_WhileLoops;

import java.util.Scanner;

public class CydeoLogin {

    public static void main(String[] args) {

        String userName="Cydeo";
        String password="Cydeo123";

        System.out.println("Please enter your username and password");

        Scanner scanner =new Scanner(System.in);

        String givenUserName = scanner.next();

        String givenPW=scanner.next();

        for (int i = 0; i < 2; i++) {
            if (!(givenUserName.equals(userName) || givenPW.equals(password))){
                System.out.println("Wrong username or password, please try again. ");
                givenUserName = scanner.next();
                givenPW=scanner.next();
                if (i==1){
                    System.out.println("Your account is locked because of 3 unsuccessful attempts");
                }
            } else{
                System.out.println("Logged in");
                break;
            }
        }










    }
}
/*
you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is lucked."

 */