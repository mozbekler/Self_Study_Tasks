package out.SelfStudy.HackerRankTasks;

import java.util.Scanner;

public class NestedLogic {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

        String dateReturned = in.nextLine();
        String dateDue = in.nextLine();

        System.out.println(calculateFine(dateReturned,dateDue));


        in.close();


    }

    public static int calculateFine(String dateReturned, String dateDue) {
        int fine = 0;
        String[] dateOne = dateReturned.split(" ");
        String[] dateTwo = dateDue.split(" ");
        int DR = Integer.parseInt(dateOne[0]);
        int DD = Integer.parseInt(dateTwo[0]);
        int MR = Integer.parseInt(dateOne[1]);
        int MD = Integer.parseInt(dateTwo[1]);
        int YR = Integer.parseInt(dateOne[2]);
        int YD = Integer.parseInt(dateTwo[2]);
        if (YD > YR) return fine;
        if (YD == YR && MD > MR) return fine;
        if (YD == YR && MD == MR && DD > DR) return fine;

        if (YR > YD) fine = 10000;
        else {
            if (MR > MD) fine = 500 * (MR - MD);
            else {
                if (DR > DD) fine = 15 * (DR - DD);
            }
        }

        return fine;
    }


}