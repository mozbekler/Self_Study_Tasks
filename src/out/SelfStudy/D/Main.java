package out.SelfStudy.D;

public class Main {
    public static void main(String[] args) {
      
        System.out.println("Main thread is starting");
      
        Task task = new Task("child1");
        Thread thread = new Thread(task);
      
        thread.start();
      
        for (int i = 0; i < 10; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Main thread is interrupted");
            }
        }
        System.out.println("Main thread is terminating");
    }
}