package out.SelfStudy.D;

import java.util.Scanner;

public class LBTTCalculator {
    public static void main(String[] args) {
        double purchasePrice, lbttDue = 0.0;
        boolean isFirstTimeBuyer;

        Scanner input = new Scanner(System.in);

        // Get the purchase price and first-time buyer status from the user
        System.out.print("Enter the purchase price of the property: £");
        purchasePrice = input.nextDouble();

        System.out.print("Is this the buyer's first-time purchase? (true/false): ");
        isFirstTimeBuyer = input.nextBoolean();

        // Calculate the LBTT due
        lbttDue = calculateLBTT(purchasePrice,isFirstTimeBuyer);

        // Print the LBTT due
        System.out.println("LBTT due: £" + lbttDue);
    }

    public static double calculateLBTT(double purchasePrice, boolean isFirstTimeBuyer) {
        double  lbttDue = 0.0;

        // Calculate the LBTT due
        if (isFirstTimeBuyer && purchasePrice <= 175000) {
            lbttDue = 0.0;
        } else if (isFirstTimeBuyer && purchasePrice > 175000 && purchasePrice <= 250000) {
            lbttDue = (purchasePrice - 175000) * 0.02;
        } else if (purchasePrice <= 145000) {
            lbttDue = 0.0;
        } else if (purchasePrice > 145000 && purchasePrice <= 250000) {
            lbttDue = (purchasePrice - 145000) * 0.02;
        } else if (purchasePrice > 250000 && purchasePrice <= 325000) {
            lbttDue = ((purchasePrice - 250000) * 0.05) + 2100;
        } else if (purchasePrice > 325000 && purchasePrice <= 750000) {
            lbttDue = ((purchasePrice - 325000) * 0.1) + 8950;
        } else if (purchasePrice > 750000) {
            lbttDue = ((purchasePrice - 750000) * 0.12) + 64250;
        }

        return lbttDue;
    }
}
