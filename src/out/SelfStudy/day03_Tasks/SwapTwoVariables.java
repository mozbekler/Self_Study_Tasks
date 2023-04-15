package out.SelfStudy.day03_Tasks;

public class SwapTwoVariables {
    public static void main(String[] args) {
        int x,
                y,
                z;

        x=10;
        y=15;

        x= y;
        z= 20;
        y= z;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
/*

Create a class named SwapTwoVariables1 and declare the following variables:
			x
			y
			z

	6.1 Write a program that swap variables x & y’ values by using a temporary variable z
		Ex:
		      x = 10
		      y = 15

		output:
		          x = 15
		          y = 20
 */