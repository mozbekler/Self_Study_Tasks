package out.SelfStudy.day15_WhileLoops;

import java.util.Scanner;

public class CydeoLoginWhile {
    public static void main(String[] args) {
        String userName="Cydeo";
        String password="Cydeo123";

        Scanner scanner =new Scanner(System.in);

        String givenUserName="" ;

        String givenPW="";
        int count=0;


        while(!(givenUserName.equals(userName) || givenPW.equals(password))){
            System.out.println("Please enter your username and password");
            givenUserName = scanner.next();
            givenPW=scanner.next();
            count++;

            if (givenUserName.equals(userName) && givenPW.equals(password)){
                System.out.println("You are successfully logged in");
                break;
            }else{
                System.out.println("Wrong username or password. The number of attempts that you can try: " + (3-count));
                if (count==3){
                    System.out.println("Your account is locked because of 3 unsuccessful attempts");
                    break;
                }
            }
        }
    }
}
