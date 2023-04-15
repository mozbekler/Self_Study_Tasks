package out.SelfStudy.HackerRankTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class SortingTask {
    public static void main(String[] args) throws IOException {
       // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //int n = Integer.parseInt(bufferedReader.readLine().trim());

        //String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i <5; i++) {

            a.add((int)(Math.random()*100));
        }

        System.out.println(a);

        // Write your code here
        int n =4;
        int temp=0;
        int numSwaps=0;


        for (int j = 1; j < a.size(); j++) {
            for (int i = j-1; i < a.size(); i++) {
                if (a.get(j)<a.get(i)){
                    temp=a.get(i);
                    a.set(i,a.get(j));
                    a.set(j,temp);
                    numSwaps++;
                }
            }
        }


        System.out.println("Array is sorted in "+ numSwaps +" swaps.");
        System.out.println("First Element: "+a.get(0));
        System.out.println("Last Element: "+a.get(a.size()-1));


        //bufferedReader.close();
    }
}
