package out.SelfStudy.AlgorithmProblems;

public class TotalAmountOfPoints {
    public static void main(String[] args) {


        int a=points(new String[]
                {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"});

        System.out.println(a);
    }

    private static int points(String[] games) {
        int points= 0;

        for(String each: games){
            if(Integer.parseInt(each.substring(0,1))>Integer.parseInt(each.substring(2))){
                points+=3;
            } else if (Integer.valueOf(each.substring(0,1))==Integer.valueOf(each.substring(2))) {
                points++;
            }
        }
        return points;
    }


}
