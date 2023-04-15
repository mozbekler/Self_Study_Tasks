package out.SelfStudy.day15_WhileLoops;

import java.util.ArrayList;
import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        ArrayList<Integer> list=new ArrayList<>();

        System.out.println("Please enter 5 numbers");

        list.add(scanner.nextInt());
        list.add(scanner.nextInt());
        list.add(scanner.nextInt());
        list.add(scanner.nextInt());
        list.add(scanner.nextInt());

        int positive=0;
        int negative=0;
        int zero=0;


        for (Integer each : list) {
          if (each>0){
              positive++;
          } else if (each<0){
              negative++;
            }else{
              zero++;
            }
        }

        System.out.println("There are "+positive+" positive "+negative+" negative and "+zero+" zero in your list.");
    }
}
/*
2. Create a class named PositiveNegative and write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */