package out.SelfStudy.MentorTasks.June;

import java.time.LocalDate;


public class DateTimeTest {

    public static void main(String[] args) {

        LocalDate grad_date= LocalDate.of(2023,1,1);

        System.out.println(grad_date.isAfter(LocalDate.of(2022,12,31)));





    }
}
