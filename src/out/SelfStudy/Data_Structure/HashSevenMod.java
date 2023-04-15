package out.SelfStudy.Data_Structure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class HashSevenMod {
    public static void main(String[] args) {

        Integer [] arr ={1,45,5,34,23,5,82,12,35,21,8,9 };

       // printSevenMod(arr);
        List<Integer> col = new ArrayList<>();

         fromArrayToCollection(arr, col);

        System.out.println(col);

        int sumOfFirstTwo = col.get(0) + col.get(1);

        System.out.println(sumOfFirstTwo);


    }


    public static void printSevenMod(Integer[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] % 7);
        }
    }

    // Can accept all types of arrays and collections as soon as they are the same type.
// You do not have to cast before type-based actions
    public static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
        for (T o : a) {
            c.add(o);
        }
    }

}
