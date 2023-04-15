package out.SelfStudy.D;

import java.util.HashMap;
import java.util.Map;

import static java.util.Arrays.sort;

public class diffblueArray {

    public static void main(String[] args) {

        int[] testArray = {3, 9, 50, 99, 15, 7, 98, 65};
        int result = distClosestNumbers(testArray);
        System.out.println(result);
        // Expected result is 1 (the 2 closest numbers are 98 and 99)


    }
    static int distClosestNumbers(int[] numbers) {

        int [] arr = new int [numbers.length];

        int num1;
        int num2;

        for (int i = 0; i < numbers.length; i++) {

        }

        if(numbers.length < 1) return -1;


        
        int ptr1=0;
        int ptr2=1;
        int temp;
        int  difference = Integer.MAX_VALUE;
        while(ptr2<numbers.length){


            temp= numbers[ptr2] - numbers[ptr1];
            if(temp < difference){
                difference = temp;
            }
            ptr1++;
            ptr2++;
        }
        return difference;
    }


    public class Dictionary {
        String sourceLanguage;
        String targetLanguage;
        Map<String, String> entries;

        public String getSourceLanguage() {
            return sourceLanguage;
        }

        public void setSourceLanguage(String sourceLanguage) {
            this.sourceLanguage = sourceLanguage;
        }

        public String getTargetLanguage() {
            return targetLanguage;
        }

        public void setTargetLanguage(String targetLanguage) {
            this.targetLanguage = targetLanguage;
        }

        public Map<String, String> getEntries() {
            return entries;
        }

        public void setEntries(Map<String, String> entries) {
            this.entries = entries;
        }
    }

//    public Dictionary invert(Dictionary dictionary) {
//
//        Dictionary newDictionary = new Dictionary();
//
//        Map<String, String> invertedDictionary = new HashMap<>();
//
//        for(  Map.Entry<String, String> each :  dictionary.entries.entrySet(){
//
//            invertedDictionary.put(   ,each.getKey());
//
//        }
//
//        newDictionary.setSourceLanguage(“french”);
//        newDictionary.settargetLanguage(“english”);
//        newDictionary.setEntries(invertedDictionary);
//
//        return newDictionary;
//    }
}
