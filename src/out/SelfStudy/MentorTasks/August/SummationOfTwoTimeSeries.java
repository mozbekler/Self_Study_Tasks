package out.SelfStudy.MentorTasks.August;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SummationOfTwoTimeSeries {
    public static void main(String[] args) {
        
        Map<Integer, Double> map1 = new HashMap<>();
        Map<Integer, Double> map2 = new HashMap<>();

        map1.put(1,1.0);
        map1.put(2,1.5);
        map1.put(3,2.0);

        map2.put(2,1.0);
        map2.put(3,2.5);
        map2.put(5,1.0);


        System.out.println(summationOfMaps(map1,map2));

    }

    private static Map<Integer,Double> summationOfMaps(Map<Integer, Double> map1,Map<Integer, Double> map2) {

        for (Map.Entry<Integer, Double> eachEntry : map1.entrySet()) {
            for (Map.Entry<Integer, Double> eachEntry2 : map2.entrySet()) {
                if (eachEntry2.getKey().equals(eachEntry.getKey())){
                    map1.put(eachEntry.getKey(),eachEntry.getValue()+eachEntry2.getValue());
                }
            }
        }


        for (Map.Entry<Integer, Double> eachEntry2 : map2.entrySet()) {
            if (!map1.containsKey(eachEntry2.getKey())){
                map1.put(eachEntry2.getKey(), eachEntry2.getValue());
            }
        }




        return map1;
    }
}
