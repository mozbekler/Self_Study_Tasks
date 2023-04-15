package out.SelfStudy.day10_StringMethods;

import java.util.Arrays;

public class ArrayMethod {

    public static void main(String[] args) {

        int[] arr={10, 20, 30, 40, 50};

        int [] arr2=insert(arr,2,100);

        System.out.println(Arrays.toString(arr2));
    }

    public static int[] insert (int array[],int index,int element){ //arr = {10, 20, 30, 40, 50};

        int insert[]=new int[array.length+1]; // insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}

        for (int i = 0; i <index ; i++) {

            insert[i]=array[i];

            }

        insert[index]=element;

        for (int i = index; i < array.length ; i++) {

            insert[i+1]=array[i];
        }



        return insert;
    }


}
/*
Insert Task:         1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element. the method inserts the given element to the given index of the array and returns the new array                 Ex:                     arr = {10, 20, 30, 40, 50};                      insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}           1.2 Create the same function for double array, char array and string array

 */