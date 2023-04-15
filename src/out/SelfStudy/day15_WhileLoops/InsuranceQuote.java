package out.SelfStudy.day15_WhileLoops;

import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {

        System.out.println("Please enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        char gender;

        System.out.println(" Please enter your gender: M/F");
        gender = scanner.next().toUpperCase().charAt(0);

        while (!(gender=='M' || gender=='F')){
            System.out.println("Please enter a valid value for gender. Invalid value for gender: "+ gender);
            gender = scanner.next().toUpperCase().charAt(0);
        }

        String isMarried;

        System.out.println("Are you married? Yes/No");
        isMarried=scanner.next().trim().toLowerCase();

        while(!(isMarried.equals("yes") || isMarried.equals("no"))){
            System.out.println("Please enter a valid answer for your marriage status. (yes/no). Your answer was: "+ isMarried);
            isMarried=scanner.next().trim().toLowerCase();
        }


        int age;
        System.out.println("Please enter your age: ");
        age=scanner.nextInt();

        while(!(age>0 || age<120)){
            System.out.println("Please enter again. Invalid age value: "+age);
            age=scanner.nextInt();
        }

        int mileage;
        System.out.println("How many miles do you drive per day? Please enter a value greater than 5. ");
        mileage=scanner.nextInt();

        while(!(mileage>5)){
            System.out.println("Please enter your daily mileage again. Mileage can not be smaller than 5. Invalid value: "+mileage);
            mileage=scanner.nextInt();
        }

        int fullOrLiability;
        System.out.println("Would you like full coverage or liability insurance. (1) for full coverage, (2) for liability insurance. ");
        fullOrLiability=scanner.nextInt();

        while(!(fullOrLiability==1 || fullOrLiability==2)){
            System.out.println("Enter 1 for \"full coverage\", 2 for \"liability insurance\"");
            fullOrLiability=scanner.nextInt();
        }



        String claims;
        System.out.println("Did you have any accidents or claims in past 5 years? (yes/no)");
        claims=scanner.next().toLowerCase();

        while(!( claims.equals("yes") || claims.equals("no") )){
            System.out.println("Invalid entry. Did you have any accidents or claims in past 5 years? (yes/no)");
            claims=scanner.nextLine().toLowerCase();
        }

        String antiTheft;
        System.out.println("Does your car have anti-theft device. (yes/no)");
        antiTheft=scanner.next().trim().toLowerCase();

        while(!(antiTheft.equals("yes") || antiTheft.equals("no"))){
            System.out.println("Invalid entry. ");
            System.out.println("Does your car have anti-theft device. (yes/no");
            antiTheft=scanner.next().trim().toLowerCase();
        }

        double insuranceQuote=0;

        if (fullOrLiability==2){ //liability
            if (age<25){
                insuranceQuote+=90;
            }else{
                insuranceQuote+=50;
            }

            if (mileage<=10){
                insuranceQuote+=10;
            } else if (mileage<=50) {
                insuranceQuote+=30;
            }else{
                insuranceQuote+=50;
            }
        }else{ // full Coverage
            if (age<25){
                insuranceQuote+=160;
            }else{
                insuranceQuote+=120;
            }

            if (mileage<=10){
                insuranceQuote+=20;
            } else if (mileage<=50) {
                insuranceQuote+=40;
            }else{
                insuranceQuote+=70;
            }
        }

        double extras=0;

        if (antiTheft=="yes"){
            extras-=5;
        }

        if (claims.equals("yes")){
            extras+=15;
        }else{
            extras-=10;
        }

        if (isMarried.equals("yes")){
            extras-=5;
        }


        insuranceQuote=insuranceQuote*(100+extras)/100;

        System.out.println("Your extra charge or discount is: %" +extras);

        System.out.println("Your insurance quote: £"+insuranceQuote);



    }
}
/*
10. Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the following info:
	    		1. Ask the user to enter your name
	    		2. Ask the user to enter your gender
	    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				3. Ask the user if he/she is married(Yes/No)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				4. Ask user to enter your age
						(age can not be negative or greater than 120)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				5. Ask user to enter how many miles he/she drives in a day
						(mileage can not be negative or less than 5)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				6. Ask the user if he/she wants full coverage or liability insurance?

				7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

				8. Ask the user if his/her car has an anti-theft device (Yes/No)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			Calculate the price of the insurance and display all the info of the user

				Insurance Quote calculation:
					starting prices for liability:
						age < 25 ===> 90
						age >= 25 ==> 50

						miles <= 10 ====> $10
					    miles > 10 and miles <= 50 ==> $30
					    miles > 50 ===>  $50

					starting prices for full coverage:
						age < 25 ===> 160
						age >= 25 ==> 120

						miles <= 10 ====> $20
					    miles > 10 and miles <= 50 ==> $40
					    miles > 50 ===>  $70


				    If the car has anti-theft device ==> 5% discount
				    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
				    If he/she never had any accidents or claims in past 5 years ==> 10% discount
				    If he/she is married ==> 5% discount
 */