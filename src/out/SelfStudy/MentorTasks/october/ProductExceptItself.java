package out.SelfStudy.MentorTasks.october;

import java.sql.Array;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class ProductExceptItself {
    public static void main(String[] args) {

        int nums[]={1,2,3,4};

        System.out.println(Arrays.toString(productExceptSelf(nums)));



    }
    public static int[] productExceptSelf(int[] nums) {


        int head=0;
        int tail= nums.length-1;
        int temp=1;

        if (nums.length%2==0){
            while(head<nums.length/2){
                temp=temp*nums[head]*nums[tail];
                head++;
                tail--;


            }
        }






        return nums;
    }

}
