package out.SelfStudy.day07_multipleIf_NestedIf;

public class CrewAndPassenger {

    public static void main(String[] args) {

        int totalNumber = 150; // totalNumber of people on the ship can be 50 or 75 or 100.
        int crew = 0;
        int passenger = 0;
        String output = "";

        if (totalNumber == 50 || totalNumber == 75 || totalNumber == 100) {
            if (totalNumber == 50) {
                crew = 20;
                passenger = totalNumber - crew;
            } else if (totalNumber == 75) {
                crew = 25;
                passenger = totalNumber - crew;
            } else {
                crew = 30;
                passenger = totalNumber - crew;
            }

        } else {
            output = "Invalid Number";
        }


        if (output == "Invalid Number") {
            System.out.println(output);
        } else {
            System.out.println("Total: " + totalNumber + " ====> " + crew + " crew , " + passenger + " passengers.");
        }


    }

}


/*
Given a number of people on the ship (int number), determine how many need to be crew members and how many can be passengers. Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT


 */
