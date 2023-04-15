package out.SelfStudy.HackerRankTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Candies {
    public static void main(String[] args) {


//        List<Integer> arr2 = new ArrayList<>(Arrays.asList(2, 4, 3, 5, 2, 6, 4, 5));
//
//        candies(8, arr2);

//        List<Integer> arr0 = new ArrayList<>(Arrays.asList(1,2,2));
//
//        candies(3, arr0);

        List<Integer> arr1 = new ArrayList<>(Arrays.asList(1,7,8,9,2,1));

        candies(6, arr1);




    }

    public static long candies(int n, List<Integer> arr) {
        // Write your code here
        long result = 0;

        int[] candies = new int[n];

        for (int i = 0; i < n; i++) {
            candies[i] = 1;
        }

            int i = 1;


        while (i > 0  && i < n){
            if (arr.get(i) > arr.get(i - 1)) {
                candies[i] = candies[i - 1] + 1;
            } else if ((i+1)<n && arr.get(i) > arr.get(i + 1)) {
                candies[i] = candies[i + 1] + 1;
            }
            i++;
        }



        for (int j = 0; j < n; j++) {
            result = result + candies[j];
        }

        for (int each : candies) {
            System.out.println(each);
        }

        System.out.println("RESULT: "+ result);

        return result;
    }
}
