package out.SelfStudy.MentorTasks.April_May;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        Random rand = new Random();
        int upperbound =100;

        int int_random = rand.nextInt(upperbound);

        Scanner input =new Scanner(System.in);
        System.out.println("Please enter a number");
        int num= input.nextInt();

        while(!(num==int_random)){
            if(num<int_random){
                System.out.println("Your number is lower than the actual number. Please guess again");
                num= input.nextInt();
            }if (num>int_random){
                System.out.println("Your number is bigger than the actual number. Please guess again");
                num= input.nextInt();
            }
        }

        if(num==int_random){
            System.out.println("Congratulations !£££££££££££$$$$$$$$$$$\n The number is "+num);
        }




    }
}
