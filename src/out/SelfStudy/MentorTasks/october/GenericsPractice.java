package out.SelfStudy.MentorTasks.october;

import out.SelfStudy.day43_generics.Question5.Node;

import java.util.*;
import java.util.stream.Collectors;

public class GenericsPractice {

    public static void main(String[] args) {

        List<String> list2 = new ArrayList<>(Arrays.asList("A","AAA", "BBB"));


        List<Object> newList= new ArrayList<>(list2);

        Node node = new Node();



        //System.out.println(newList);

        printList(newList);
        printList(Collections.singletonList(list2));


        System.out.println(Arrays.toString(Days.values()));

        list2.stream().filter(p->p.contains("a")).limit(3);

        List<Integer> numberList= new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            numberList.add(i);
        }


        System.out.println(numberList.stream().skip(10).collect(Collectors.partitioningBy(n->n%2==1)));

        //System.out.println("numberList.stream().filter(car -> car < 2015) = " + numberList.stream().filter(car -> car < 2015));

       // System.out.println(numberList.stream().reduce(Integer::sum).get());

       // numberList.stream().

        System.out.println(numberList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

           List<Integer> takeWhileList=numberList.stream().takeWhile(p -> p == 20).collect(Collectors.toList());

        System.out.println(takeWhileList);




    }

    public static void printList(List<Object> list){

        System.out.println(list);

    }
}
