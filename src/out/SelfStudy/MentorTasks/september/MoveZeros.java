package out.SelfStudy.MentorTasks.september;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MoveZeros {
    public static void main(String[] args) {

        //Iskender's solution for removing duplicates from a LinkedList object by applying Iterator interface. A good approach for consuming Iterator interface
        List<Integer> list = new LinkedList<>();
        list.addAll(Arrays.asList(1, 1, 3, 4, 4, 4, 5, 6, 6));
        System.out.println(list);
        Iterator<Integer> it = list.iterator();

        Integer before = it.next();
        while(it.hasNext()) {
            Integer after = it.next();
            if (before.equals(after)) {
                it.remove();
            } else {
                before = after;
            }
        }
        System.out.println(list);

        /*Iskenders second solution
        int[] arr = {1, 0, 2, 0, 0, 7, 0};
        int index = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
        while (index < n) {
            arr[index++] = 0;
        }
        System.out.println(Arrays.toString(arr));

         */



    }
    private static int[] moveAllZerosToTheEnd2(int[] arr) {
        int i = 0, j = 1;
        while (j < arr.length){
            if (arr[i] == 0 && arr[j] != 0){
                arr[i] = arr[j];
                arr[j] = 0;
                j++;
                i++;
            }else {
                j++;
                if (arr[i] != 0){
                    i++;
                }
            }
        }
        return arr;
    }


}
