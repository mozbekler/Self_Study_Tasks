package out.SelfStudy.codeWars;

import java.util.ArrayList;
import java.util.Arrays;


public class PigLatin {

    public static void main(String[] args) {

        System.out.println(pigIt("Pig latin is cool"));

        System.out.println("igPay atinlay siay oolcay".equals(pigIt("Pig latin is cool")));


    }


    public static String pigIt(String str) {

        String[] arr= str.split(" ");

        String firstLetter="";

        for (int i = 0; i < arr.length; i++) {
            if (!((arr[i].charAt(0)>=65 && arr[i].charAt(0)<=90) ||(arr[i].charAt(0)>=97 && arr[i].charAt(0)<=122))){
                continue;
            }

            firstLetter=arr[i].substring(0,1);
            arr[i]=arr[i]+firstLetter+"ay";
            arr[i]=arr[i].replaceFirst(firstLetter,"");
        }
        String result="";
        for (int i = 0; i < arr.length; i++) {
            result+=arr[i]+" ";
        }
        result=result.substring(0,result.length()-1);

        return result;

      
    }



}