package out.SelfStudy.MentorTasks.september;

public class StaircaseVariationJump {
    public static void main(String[] args) {

        System.out.println(cat(6)); // 7+4+2

        System.out.println(findStep(20));

    }

    public static int findStep(int n)
    {
        if ( n == 0)
            return 1;
        else if (n < 0)
            return 0;

        else
            return findStep(n - 3) + findStep(n - 2)
                    + findStep(n - 1); //1+1+2
    }


    public static int cat(int input) {


        if (input==0) return 1;
        if(input<0)  return 0;
        else return cat(input-3)+cat(input-2)+cat(input-1);


    }





}


