package out.SelfStudy.flipgrid;

public class StaticVsNonStatic {

    public static double pi;
    public double radius;


    static {
        pi=3.14;
    }

    public StaticVsNonStatic(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {

        StaticVsNonStatic circle1= new StaticVsNonStatic(5);




    }
}
