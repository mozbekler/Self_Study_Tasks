package out.SelfStudy.MentorTasks.April_May;

import java.util.Arrays;

public class CapitalizeAllWords {

    public static void main(String[] args) {
      String input= "How can mirrors be real if our eyes aren't real";

      String [] words=input.trim().split(" ");

      String output="";


        for (int i = 0; i < words.length; i++) {
            String currentWord=words[i];
            if (currentWord.charAt(0)>='A' &&currentWord.charAt(0) <='Z'){
                output+=currentWord+" ";
            }else{
                output+=currentWord.replace(currentWord.charAt(0), (char) (currentWord.charAt(0)-32))+" ";
            }

        }


        System.out.println(Arrays.toString(words));

        System.out.println(output);

        {

            System.out.println(capitalizeWord("How can mirrors be real if our eyes aren't real"));

        }



    }
    public static String capitalizeWord(String str){

        String words[]=str.split("\\s");
        String capitalizeWord="";
        for(String w:words){
            String first=w.substring(0,1);
            String afterFirst=w.substring(1);
            capitalizeWord+=first.toUpperCase()+afterFirst+" ";
        }
        return capitalizeWord.trim();


    }
}
/*
Given a string, write a method that capitalizes the first chars
of each word and returns the new string.

Example:
Input: “How can mirrors be real if our eyes aren't real”
Output: “How Can Mirrors Be Real If Our Eyes Aren't Real”

 */