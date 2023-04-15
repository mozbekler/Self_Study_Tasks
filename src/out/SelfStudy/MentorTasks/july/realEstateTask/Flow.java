package out.SelfStudy.MentorTasks.july.realEstateTask;

import java.util.Scanner;


public class Flow {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the required area");

        double requiredArea = scanner.nextDouble();

        for (Square each : Database.squareShapedApartments) {
            if (each.getArea() > requiredArea) {
                System.out.println(each);
            }
        }

        for (Rectangle each : Database.rectangleShapedApartments) {
            if (each.getArea() > requiredArea) {
                System.out.println(each);
            }

        }

        for (Circle each : Database.circleShapedApartments) {
            if (each.getArea() > requiredArea) {
                System.out.println(each);
            }
        }










    }
}
