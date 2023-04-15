package out.SelfStudy.day15_WhileLoops;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {



        System.out.println("Would you like to reserve a room?");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();

        while(!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
            System.out.println("Please enter a valid answer : yes  or no");
            answer=scanner.next();
        }

        int roomChoice=1;


        if (answer.equalsIgnoreCase("yes")){
            System.out.println("Which type of room would you like to reserve Options: \n" +
                    "(1): King Bed\n" +
                    "(2): Queen Bed\n" +
                    "(3): Single Bed" );
            roomChoice=scanner.nextInt();


        } else if (answer.equalsIgnoreCase("no")) {
            System.out.println("Have a nice day");
            System.exit(0);
        }

        while(!(roomChoice==1 || roomChoice==2 || roomChoice==3)){
            System.out.println("Please enter a valid answer : \n" +
                    "(1): King Bed ==> 120$\n" +
                    "(2): Queen Bed ==> 100$\n" +
                    "(3): Single Bed ==> 80$" );
            roomChoice=scanner.nextInt();

        }

        String chosen="";

        switch (roomChoice){
            case 1: chosen="King Bed ==> 120$";
            break;
            case 2: chosen="Queen Bed ==> 100$";
            break;
            case 3: chosen="Single Bed ==> 80$";
        }

        System.out.println("You have chosen: " + chosen);








    }
}
/*
8. Create a class called RommReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)
 */