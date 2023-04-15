package out.SelfStudy.MentorTasks.April_May;

public class NullPointerException {

    public static void main(String[] args) {

        String myString = null;
        printLength(myString);                              // The printLength() method calls the length() method of a String without
    }                                                       // per`forming a null check prior to calling the method. Since the value
                                                            // of the string passed from the main() method is null, running the above
                                                            // code causes a NullPointerException
    private static void printLength(String str) {
        System.out.println(str.length());
    }
}

/*
Write a code that throws NullPointerException
 */



