package out.SelfStudy.MentorTasks.july.realEstateTask;

public class Rectangle extends LandShapes {

    private double length, width;

    public Rectangle(String name, double length, double width) {
        super(name);
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return getLength()*getWidth();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name=" + getName() +
                ", length=" + getLength() +
                ", width=" + getWidth() +
                ", area=" + getArea() +
                '}';
    }
}
