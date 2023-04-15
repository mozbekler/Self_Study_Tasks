package out.SelfStudy.day03_Tasks;

public class Circle {

    public static void main(String[] args) {

        double radius;
        double area;
        double perimeter;
        double pi=3.14;

        radius=5;
        area=Math.PI*radius*radius;
        perimeter=2*Math.PI*radius;

        System.out.println("Area of the square is "+area+ " unit square.");
        System.out.println("Perimeter of the square is "+perimeter+" units.");



    }


}

/*

Create a class named Circle and declare the following variables:
				radius
				area
				perimeter

	4.1 Write a program that can calculate the area and perimeter of a circle with any given radius
			Ex:
			      radius = 5

			output:
			       Area of the square is 78.5
			       Perimeter of the square is 31.4
 */