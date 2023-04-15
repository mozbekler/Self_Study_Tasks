package out.SelfStudy.MentorTasks.April_May;

public class LeapYear {

    public static void main(String[] args) {

        int year=2105;

        if ((year%=400)==0){
            System.out.println("Leap year");
        } else if ((year%=100)==0) {
            System.out.println("Not leap year");
        } else if ((year%4)==0) {
            System.out.println("Leap year");
        }else{
            System.out.println("Not leap year");
        }
    }
}
