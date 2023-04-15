package out.SelfStudy.MentorTasks.september;

public class EkaterinaSolution {
    public static void main(String[] args) {

        System.out.println(stairs(5));

    }
    public static int stairs(int n){
        if (n == 1)
            return 1;

        int[] ways=new int[n+1];// we include 0 as a step and will add it to n to count it
        ways[0]=1;
        ways[1]=1;
        ways[2]=2;// assign 2 to avoid extra conditions since 2-3 will return -1
        for (int i = 3; i <=n ; i++) {
            ways[i]=ways[i-1]+ways[i-2]+ways[i-3];// we cover all possible steps
            //ways[3]=2+1+0//3  ways[4]=3+2+1//6=> 6+1 step for 0    //
        }
        return ways[n];//we return the last element
    }

}
