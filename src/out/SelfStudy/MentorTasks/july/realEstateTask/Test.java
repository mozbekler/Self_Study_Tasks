package out.SelfStudy.MentorTasks.july.realEstateTask;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Rectangle rectangle=new Rectangle("Seyirevleri",3,5);

        ArrayList<Rectangle> rectangles= new ArrayList<>();

        rectangles.add(rectangle);

        System.out.println(rectangles);


        System.out.println(rectangle.getArea());





    }
}
