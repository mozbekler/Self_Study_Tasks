package out.SelfStudy.MentorTasks.july.realEstateTask;

public abstract class LandShapes {

private String name;

    public LandShapes(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                '}';
    }
}
