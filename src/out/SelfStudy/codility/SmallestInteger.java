package out.SelfStudy.codility;

import java.util.*;

public class SmallestInteger {
    public static void main(String[] args) {

int[] array={ -1, -3, -6, -4, -1, -2,-7};

        System.out.println(solution(array));


    }
    public static int solution(int[] A) {

        List<Integer> listA= new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
           if (A[i]>0){
               listA.add(A[i]);
           }
        }

        Collections.sort(listA);

        int first=0;

        if (listA.size()==0){
            first=1;
        }

        for (int i = 0; i < listA.size()-1; i++) {
            if (listA.get(i)>0 & listA.get(i+1)-listA.get(i)>1){
                first= listA.get(i)+1;
            }
        }

        if (first==0){
            first=listA.get(listA.size()-1)+1;
        }



        return first;
    }



}
/*
This is a demo task.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
 */