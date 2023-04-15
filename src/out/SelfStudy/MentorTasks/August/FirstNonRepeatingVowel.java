package out.SelfStudy.MentorTasks.August;

import java.util.*;

public class FirstNonRepeatingVowel {

    public static void main(String[] args) {
        String str = "google";

        indexOfFirstNonRepeatingVowel(str);





    }

    private static void indexOfFirstNonRepeatingVowel(String str) {

        Map<Character,Integer> map = new LinkedHashMap<>();

        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i <str.length() ; i++) {
            list.add(str.charAt(i));
        }

        for (Character character : list) {
            if (character.equals('a') || character.equals('e') || character.equals('i') || character.equals('o') || character.equals('u')){
                map.put(character, Collections.frequency(list,character));
            }

        }

        for (Map.Entry<Character, Integer> eachEntry : map.entrySet()) {
            if (eachEntry.getValue()==1){
                System.out.println(str.indexOf(eachEntry.getKey()));
                System.exit(0);
            }
        }

        for (Map.Entry<Character, Integer> eachEntry : map.entrySet()) {
            if (eachEntry.getValue() != 1){
                System.out.println(-1);
            }
        }





    }


}
