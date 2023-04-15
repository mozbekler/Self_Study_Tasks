package out.SelfStudy.codility;

import java.util.*;

public class PairArray {
    public static void main(String[] args) {

        int[] A ={1,2,2,3,1,3,1000000,1000000,2,2};

        System.out.println(solution(A));



    }

    private static boolean solution(int[] A) {

        if (A.length%2==1) {return false;}


            List<Integer> list = new ArrayList<>();

            for (int j : A) {
            list.add(j);
            }


        Set<Integer> distinct = new HashSet<>(list);


            for (Integer integer : distinct) {
                int count= Collections.frequency(list,integer);
                if (count%2==1)  return false;

            }


            return true;

    }
}
