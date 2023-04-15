package out.SelfStudy.Barclays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task {
    public static void main(String[] args) {

        String line= "Add|Dog\n" +
                "Get|Dog\n" +
                "Remove|Dog\n" +
                "Has|Dog";
        String function = line.substring(0,line.indexOf("|"));
        String value = line.substring(line.indexOf("|")+1);
//        System.out.println(function);
//        System.out.println(value);



        List<String> list = new ArrayList<>();

        if (function.equals("Add")){
            list.add(value);
            System.out.println(value);
        } else if(function.equals("Get")){
            if(value != null){
                System.out.println(value);
            }else{
                System.out.println("NULL");
            }
        } else if (function.equals("Has")){
            if (value != null){
                System.out.println("True");
            }else{
                System.out.println("False");}
        } else if(function.equals("Remove")){
               list.remove(value);
        }else if(function.equals("Remove")){
            System.out.println(list.size());
            list = null;
        }

    }


}
