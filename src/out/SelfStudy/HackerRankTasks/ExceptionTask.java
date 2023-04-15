package out.SelfStudy.HackerRankTasks;

public class ExceptionTask {
    public static void main(String[] args) throws Exception {

        String S ="A";

        try {
            int s = Integer.parseInt(S);
            System.out.println(s);
        }catch (Exception e){
            System.out.println("Bad String");
        }







    }
}
