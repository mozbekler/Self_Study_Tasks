package out.SelfStudy.MentorTasks.August.bestQueueMatic;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        DataGenerator.createClient();
        DataGenerator.createDesks();




        findLastClientDeskAndWaitTime(StaticConstants.DESK_MAP,StaticConstants.CLIENT_LIST);




    }

    public static String[] findLastClientDeskAndWaitTime(LinkedHashMap<String, ArrayList<Integer>> deskMap, Queue<Client> clients){
        ArrayList<Integer> totalTime = new ArrayList<>();

        for (int i = 0; i < deskMap.entrySet().size(); i++) {
            totalTime.add(i,0);
        }


        for (int i = 0; i < deskMap.entrySet().size(); i++) {
            int smallestTotalTime=2147483647;
            if (totalTime.get(i)<smallestTotalTime){
                smallestTotalTime=totalTime.get(i);
            }

            if (totalTime.get(i)==smallestTotalTime){
               // deskMap.values().add(clients)
            }
        }





        String[] str= {"aaaa"};



        return  str;
        }









}

