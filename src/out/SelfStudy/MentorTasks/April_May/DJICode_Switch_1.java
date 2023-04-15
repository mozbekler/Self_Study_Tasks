package out.SelfStudy.MentorTasks.April_May;

public class DJICode_Switch_1 {

    public static void main(String[] args) {
        char grade = 'A';

        switch (grade){
            case 'A':
                System.out.println("Excellent");
            case 'B':
                System.out.println("Good");
            case 'C':
                System.out.println("Can be improved!");
                break;
            default:
                System.out.println("No comment");

                //I want to print only "Excellent" if grade is 'A', "Good" if grade is 'B', "Can be improved!" if grade is 'C',
                //for any other grades "No comment".
                //But this code prints "Excellent", "Good", "Can be improved!" together for grade 'A'
                //This Dirty Java Code needs a RANGER to fix!
        }
    }
}

