package out.SelfStudy.MentorTasks.August.bestQueueMatic;

import out.SelfStudy.flipgrid.StaticVsNonStatic;

import java.util.ArrayList;
import java.util.Arrays;

public class DataGenerator {

    public static void createClient() {
        Client client1 = new Client("Drogba", 'A');
        Client client2 = new Client("Cantona", 'A');
        Client client3 = new Client("Ronaldinho", 'B');
        Client client4 = new Client("Zidane", 'C');
        Client client5 = new Client("Cruyff", 'D');
        Client client6 = new Client("Ronaldo", 'B');
        Client client7 = new Client("Baggio", 'C');

        StaticConstants.CLIENT_LIST.addAll(Arrays.asList(client1, client2, client3, client4, client5, client6, client7));

    }


    public static void createDesks() {
        Desk desk1 = new Desk("Desk1", new ArrayList<>());
        Desk desk2 = new Desk("Desk2",new ArrayList<>());
        Desk desk3 = new Desk("Desk3",new ArrayList<>());

        StaticConstants.DESK_MAP.put(desk1.getName(),desk1.getOccupationTime());
        StaticConstants.DESK_MAP.put(desk2.getName(),desk2.getOccupationTime());
        StaticConstants.DESK_MAP.put(desk3.getName(),desk3.getOccupationTime());

        addOccupationTime();


    }

    private static void addOccupationTime() {

    }


}




