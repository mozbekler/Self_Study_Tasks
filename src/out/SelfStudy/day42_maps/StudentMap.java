package out.SelfStudy.day42_maps;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class StudentMap {
    public static void main(String[] args) {

        Map<String, int[]> studentMap =new LinkedHashMap<>();

        studentMap.put("Mehmet", new int[]{80, 90, 76});
        studentMap.put("Sebiha", new int[]{80, 90, 86});
        studentMap.put("Binnur", new int[]{90, 90, 96});
        studentMap.put("Ali", new int[]{90, 70, 96});
        studentMap.put("Nuray", new int[]{100, 100, 100});

        for (Map.Entry<String, int[]> eachEntry : studentMap.entrySet()) {
            System.out.println(eachEntry.getKey()+" : "+Arrays.toString(eachEntry.getValue()));
        }







    }
}
/*
Create a map that can contain the student name (String) and student scores (int[]) as a pair (Assume that each student has 5 scores and make the student name unique)
		1.1 add at least 5 paris into the map
		1.2 Write a program that can display each student name and scores

 */