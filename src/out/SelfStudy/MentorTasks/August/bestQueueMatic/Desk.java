package out.SelfStudy.MentorTasks.August.bestQueueMatic;

import java.util.ArrayList;

public class Desk {

    private String name;
    private ArrayList<Integer> occupationTime;

    public Desk(String name) {
        this.name = name;
    }

    public Desk(String name, ArrayList<Integer> occupationTime) {
        this.name = name;
        this.occupationTime = occupationTime;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getOccupationTime() {
        return occupationTime;
    }
}
