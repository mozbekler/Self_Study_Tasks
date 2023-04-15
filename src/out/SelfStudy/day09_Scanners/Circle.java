package out.SelfStudy.day09_Scanners;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the radius of the circle?");

        int radius = input.nextInt();

        double area;
        double perimeter;

                area=Math.PI*radius*radius;
        perimeter=2*Math.PI*radius;

        if (radius<0){
            System.out.println("Invalid value");
        } else{
            System.out.println("perimeter = " + perimeter +" units");
            System.out.println("area = " + area +" unit square");
        }



        input.close();
    }
}
/*
2. Create a class named Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius
 */