package out.SelfStudy.codeWars;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Parser {

    public static void main(String[] args) {

        System.out.println(parseInt("one million"));


    }

    public static int parseInt(String numStr) {

        int result=0;

        if (numStr.contains("million")){
            return 1000000;
        }

        numStr= numStr.replaceAll(" and","");
        numStr= numStr.replaceAll("-"," ");
        numStr= numStr.replaceAll("  "," ");

        numStr= numStr.replaceAll("ninety","90");
        numStr= numStr.replaceAll("eighty","80");
        numStr= numStr.replaceAll("seventy","70");
        numStr= numStr.replaceAll("sixty","60");
        numStr= numStr.replaceAll("fifty","50");
        numStr= numStr.replaceAll("forty","40");
        numStr= numStr.replaceAll("thirty","30");
        numStr= numStr.replaceAll("twenty","20");

        numStr= numStr.replaceAll("nineteen","19");
        numStr= numStr.replaceAll("eighteen","18");
        numStr= numStr.replaceAll("seventeen","17");
        numStr= numStr.replaceAll("sixteen","16");
        numStr= numStr.replaceAll("fifteen","15");
        numStr= numStr.replaceAll("fourteen","14");
        numStr= numStr.replaceAll("thirteen","13");
        numStr= numStr.replaceAll("twelve","12");
        numStr= numStr.replaceAll("eleven","11");
        numStr= numStr.replaceAll("ten","10");

        numStr= numStr.replaceAll("zero","0");
        numStr= numStr.replaceAll("one","1");
        numStr= numStr.replaceAll("two","2");
        numStr= numStr.replaceAll("three","3");
        numStr= numStr.replaceAll("four","4");
        numStr= numStr.replaceAll("five","5");
        numStr= numStr.replaceAll("six","6");
        numStr= numStr.replaceAll("seven","7");
        numStr= numStr.replaceAll("eight","8");
        numStr= numStr.replaceAll("nine","9");

        numStr= numStr.replaceAll("hundred","100");
        numStr= numStr.replaceAll("thousand","1000");


        List<String> numList = new ArrayList<>();
        numList= Arrays.asList(numStr.split(" "));
        List<Integer> intList = new ArrayList<>();
        for (String s : numList) {
            intList.add(Integer.valueOf(s));
        }

        System.out.println(numList);
        System.out.println(intList);



        int thousands=0;
        int hundreds=0;


        


    /*if (!(numStr.contains("hundred")) && !(numStr.contains("thousand"))){
        for (int i = 0; i < intList.size(); i++) {
            hundreds += intList.get(i);
        }
    }

     */

        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) == 100) {
                intList.set(i, intList.get(i - 1) * intList.get(i));
                intList.remove(i-1);
            }
        }

        System.out.println(intList);

        //if (intList.indexOf(1000)==1) {thousands=intList.get(0);}

        for (int i = 0; i < intList.size(); i++) {


             if (intList.get(i) == 1000) {
                for (int j = 0; j < i; j++) {
                    thousands = thousands+intList.get(j);
                }
                for (int j = intList.size() - 1; j > i; j--) {
                    hundreds += intList.get(j);
                }
            }
        }

        if (!intList.contains(1000)){
            for (Integer integer : intList) {
                hundreds+=integer;
            }
        }
        //System.out.println(thousands);
        //System.out.println(hundreds);
       //System.out.println(intList);

        result=thousands*1000+hundreds;


        return result;
    }
}