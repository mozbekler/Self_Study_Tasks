package out.SelfStudy.RobloxTiming;

import java.util.Scanner;

public class RobloxTiming {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the number of coins that you earned in TTRS this week:  ");
        int TTRSCoins = in.nextInt();

        System.out.println("Please enter the number of pages that you studied from your book this week:  ");
        int mathsAndEnglishBookPage = in.nextInt();

        System.out.println("Please enter the number of ayats that you read from the Quran this week:  ");
        int ayat = in.nextInt();

        int robloxMin = 20 + TTRSCoins/100 + mathsAndEnglishBookPage + ayat;


        System.out.println("Congratulations. You can play "+ robloxMin +" minutes of mobile phone game this weekend.");







    }

}
