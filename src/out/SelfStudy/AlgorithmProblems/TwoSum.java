package out.SelfStudy.AlgorithmProblems;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int nums[] = {2,7,11,15,22,23,56,78,34,67,23,8,1,9,3,7,3,8,2,98};
        int target = 99;

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i]+nums[j]==target){
                    int[] result = {i,j};
                    System.out.println(Arrays.toString(result));

            }
        }

        }



    }


}
/*
Problem: Two Sum
• Given an array of integers nums and an integer target, return indices of the two
numbers such that they add up to target.
• You may assume that each input would have exactly one solution, and you
may not use the same element twice.
• You can return the answer in any order.
• No solution will return empty array.
Example:
Input: nums = [2, 7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */