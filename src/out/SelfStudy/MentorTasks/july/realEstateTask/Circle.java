package out.SelfStudy.MentorTasks.july.realEstateTask;

public class Circle extends LandShapes{

    private double radius;
    private final static double PI=3.14;

    public Circle(String name,double radius) {
        super(name);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI*getRadius()*getRadius();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name=" + getName() +
                ", radius=" + getRadius() +
                ", area=" + getArea() +
                '}';
    }
}
