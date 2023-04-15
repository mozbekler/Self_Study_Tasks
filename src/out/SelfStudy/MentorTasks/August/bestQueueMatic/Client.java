package out.SelfStudy.MentorTasks.August.bestQueueMatic;

public class Client {

    private String name;
    private char processType;

    public Client(String name, char processType) {
        this.name = name;
        this.processType = processType;
    }

    public String getName() {
        return name;
    }

    public char getProcessType() {
        return processType;
    }
}
