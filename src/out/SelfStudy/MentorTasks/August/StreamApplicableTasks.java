package out.SelfStudy.MentorTasks.August;

import java.util.Arrays;

import java.util.LinkedHashMap;
import java.util.Map;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamApplicableTasks {
    public static void main(String[] args) {

        System.out.println("Find Max from int Array ");
        int[] array = {6, 8, 3, 5, 1, 9};

        System.out.println(Arrays.stream(array).max().getAsInt());

        System.out.println("Find Factorial");

        int n = 5;

        System.out.println(factorial(7));

        System.out.println("First Unique Character");

        String s = "suucceesas";

        System.out.println(firstUniqueChar(s));

        System.out.println("Stream Applicable Task / Frequency of Array Elements");

        String [ ] stringArray= {"Apple", "Banana", "apple", "Cherry", "Apple"};

        System.out.println(FrequencyofArrayElemnts(stringArray));

        System.out.println("Array of Digits");

        System.out.println(Arrays.toString(ArrayOfDigits(49035)));






    }

    private static int[] ArrayOfDigits(int i) {

        String s =String.valueOf(i);

        return s.chars().map(Character::getNumericValue).toArray();

    }

    private static Map<String, Long> FrequencyofArrayElemnts(String[] stringArray) {

        return Arrays.stream(stringArray).collect(Collectors.groupingBy( s -> s, Collectors.counting() ));
    }

    private static char firstUniqueChar(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        char[] c= s.toCharArray();

        int[] frequencyArray = new int[c.length];
            int count=1;
        for (int i = 0; i < c.length; i++) {
            count=1;
            for (int j = 0; j < c.length; j++) {
                if ((c[i]==c[j]) && i!=j){
                    count++;
                    frequencyArray[i]=count;

                }else{
                    frequencyArray[i]=count;
                }
            }
        }
        char f=' ';

        for (int i = 0; i < frequencyArray.length; i++) {
            if (frequencyArray[i]==1){
                f= c[i];
                break;
            }
        }

        return f;

    }


        private static int factorial ( int n){
            return IntStream.range(1, n + 1).reduce((a, b) -> a * b).getAsInt();
        }
    }

