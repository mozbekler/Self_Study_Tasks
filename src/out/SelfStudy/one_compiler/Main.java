package out.SelfStudy.one_compiler;

import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String input1 = input.next();
        String solution = sortVowels(input1);
        System.out.println(solution);
    }

    public static String sortVowels(String input) {

        input = input.toLowerCase();
        char[] array = input.toCharArray();
        List<Character> vowels = new ArrayList<>();
        List<Integer> indexesOfVowels = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'a' || array[i] == 'e' || array[i] == 'i' || array[i] == 'o' || array[i] == 'u') {
                vowels.add(array[i]);
                indexesOfVowels.add(i);
            }
        }

        List<Character> sortedVowels = vowels.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        for (int i = 0; i < indexesOfVowels.size(); i++) {
            array[indexesOfVowels.get(i)] = sortedVowels.get(i);
        }

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            builder.append(array[i]);
        }

        return builder.toString();
    }
}