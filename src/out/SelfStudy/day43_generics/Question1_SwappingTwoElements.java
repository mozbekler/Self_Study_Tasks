package out.SelfStudy.day43_generics;

import java.util.Arrays;

public class Question1_SwappingTwoElements {
    public static void main(String[] args) {

        Integer[] a ={1,2,3,4};
        swap(a,0,2);
        System.out.println(Arrays.toString(a));

    }

    public static Object [] swap(Object[] array, int index1, int index2){

        Object tempObject= array[index2];

        array[index2]=array[index1];
        array[index1]=tempObject;

        return array;

    }
}
