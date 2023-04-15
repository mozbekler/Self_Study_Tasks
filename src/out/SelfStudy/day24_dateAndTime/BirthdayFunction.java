package out.SelfStudy.day24_dateAndTime;



import java.time.LocalDate;

public class BirthdayFunction {
    public static void main(String[] args) {

        System.out.println(birthDay(1993,6,16));



    }

    public static String birthDay(int year,int month,int day){

        LocalDate birthDay= LocalDate.of(year,month,day);
        LocalDate today=LocalDate.now();
        String output;

        if (birthDay.getMonthValue()==today.getMonthValue() && birthDay.getDayOfMonth()== today.getDayOfMonth()){
            output="Happy Birthday \nYou are " + (today.getYear()- birthDay.getYear())+" years old";
        }else{
            output="Today is not your birthday.";
        }




        return output;

    }
}
/*
Create a function named birthday, that takes three int arguments:
  1. year
  2. month
  3. day

the function should be able to print the age and "Happy birthday" if today is the birthday
otherwise the function will print "Today is not your birthday.
      ex:
          birthday(1993, 6, 16);
      output:
            Happy Birthday
            You are 29 years old


 */