package out.SelfStudy.codeWars;



import java.util.*;

public class LoopSize {
    public static void main(String[] args) {

        String str= "56 65 74 100 99 68 86 180 90";

        orderWeight(str);

    }
    public static String orderWeight(String strng) {



        List<String> list=new ArrayList<>(Arrays.asList(strng.split("")));

        System.out.println(list);

        return null;
    }
}
