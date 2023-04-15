package out.SelfStudy.MentorTasks.April_May;

import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {

        String[] myArray = new String[3];

        String input= "I am a DJR";

        int i=0;
        for (String each:myArray
             ) {
            myArray[i]=input;
            i++;
        }


       /*for (int i = 0; i < myArray.length; i++) {
            myArray[i]=("I am a DJR");
        }*/

        System.out.println(Arrays.toString(myArray));

    }
}
/*
Given a String array
String[] myArray = new String[3];
Assign “I am a DJR” to all elements of this array In a FOR EACH loop

 */