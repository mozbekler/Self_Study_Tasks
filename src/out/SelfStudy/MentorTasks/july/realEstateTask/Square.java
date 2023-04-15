package out.SelfStudy.MentorTasks.july.realEstateTask;

public class Square extends LandShapes{

    private double length;

    public Square(String name,double length) {
        super(name);
        setLength(length);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    @Override
    public double getArea() {
        return getLength()*getLength();
    }

    @Override
    public String toString() {
        return "Square{" +
                "name=" + getName() +
                ", length=" + getLength() +
                ", area=" + getArea() +
                '}';
    }
}
