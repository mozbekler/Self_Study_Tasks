package out.SelfStudy.MentorTasks.August;

import java.util.*;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

    String str=null;

    frequencyOfChars(str);


    }


    public static void frequencyOfChars(String s){

        Map<String,Integer> map = new LinkedHashMap<>();

        ArrayList<String> list = new ArrayList<>();

        try {
            list.addAll(Arrays.asList(s.split("")));
        } catch (Exception e){
            System.out.println("null");
            System.exit(0);
        }


        for (String s1 : list) {
         map.put(s1, Collections.frequency(list,s1));
        }

        if (s.isEmpty()){
            System.out.println("empty map");
        }  else {
            System.out.println(map);
        }


    }



}
