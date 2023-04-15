package out.SelfStudy.MentorTasks.June;

import java.util.ArrayList;
import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        String str="Was it a car or a cat I saw     ";

        boolean a=isPalindrome(str);

        System.out.println(a);
        System.out.println("-----------------------------");

        String[] array= {"abc","car","cool","Was it a car or a cat I saw     "};

        System.out.println(findPalindromes(array));


    }
    public static boolean isPalindrome(String str) {

        String[] list = str.trim().toLowerCase().split("");

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(list));

        arrayList.removeIf(p -> p.equals(" "));


        for (int i = 0; i < arrayList.size(); i++) {
            if (!arrayList.get(i).equalsIgnoreCase(arrayList.get(arrayList.size() - (i + 1)))) { //radar
                return false;
            }
        }

        return true;
    }

    public static ArrayList<String> findPalindromes(String[] array){

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));

        arrayList.removeIf(p-> !isPalindrome(p));

        return arrayList;
    }


}
