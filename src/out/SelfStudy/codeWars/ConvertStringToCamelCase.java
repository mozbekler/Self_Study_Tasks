package out.SelfStudy.codeWars;

import java.util.Arrays;

public class ConvertStringToCamelCase {
    public static void main(String[] args) {

        String input = "the_stealth_warrior";

        System.out.println(toCamelCase(input));

        String [] array=input.split("_");

        System.out.println(Arrays.toString(array));

        String newString=array[0];


        for (int i = 1; i < array.length; i++) {
            array[i]=array[i].substring(0,1).toUpperCase()+array[i].substring(1);
            newString+=array[i];
        }


        System.out.println(newString);

    }
    public static String toCamelCase(String s){

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i)=='_' ||s.charAt(i)=='-' ){

                s=s.substring(0,i+1)+s.substring(i+1,i+2).toUpperCase()+s.substring(i+2);


            }

        }


        s=s.replace("_","");

        s=s.replace("-","");



        return s;
    }

}
