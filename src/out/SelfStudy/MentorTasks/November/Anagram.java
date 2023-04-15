package out.SelfStudy.MentorTasks.November;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Anagram {
    public static void main(String[] args) {





    }
    public boolean isAnagram(String s, String t) {

        Map<Character, Integer> sMap = new TreeMap<>();


        for (int i = 0; i < s.length(); i++) {

            if (sMap.containsKey(s.charAt(i))){
                sMap.put(s.charAt(i),sMap.get(s.charAt(i))+1);
            } else{
                sMap.put(s.charAt(i),1);
            }
        }

        for (int i = 0; i < t.length(); i++) {

            if (sMap.containsKey(t.charAt(i))){
                sMap.put(t.charAt(i),sMap.get(t.charAt(i))-1);
            } else{
                return false;
            }
        }

        for (Integer value : sMap.values()) {
            if (value!=0) return false;
        }


        return true;

    }

}
