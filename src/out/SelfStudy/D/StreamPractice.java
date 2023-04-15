package out.SelfStudy.D;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {

        System.out.println(Stream.of(3, 5, 7).filter(integer -> integer > 5).collect(Collectors.toList()));

        System.out.println(Stream.of(3, 5, 7).anyMatch(integer -> integer %2 == 0 && integer %3 == 0));

        System.out.println(Stream.of(3, 5, 7).noneMatch(integer -> integer %2 == 0 && integer %3 == 0));

        System.out.println(Stream.of(3, 5, 7).takeWhile(integer -> integer %2 == 0).collect(Collectors.toList()));

        System.out.println(Stream.of(3, 5, 7).dropWhile(integer -> integer %2 == 0).collect(Collectors.toList()));

        System.out.println(Stream.of(3, 5, 7).map(Object::toString).collect(Collectors.joining(", ")));

        List<String> list = Stream.of("A", "B", "C", "D").collect(Collectors.toUnmodifiableList());

        //list.add("E"); //java.lang.UnsupportedOperationException

        Map<Boolean, List<Integer>> partBy = Stream.of(1, 4, 5)
                .collect(Collectors.partitioningBy(integer -> integer % 2 == 0));

        System.out.println(partBy);

        Map<Object, List<Integer>> groupBy = Stream.of(4, 4, 5,6,7,8,9,0,11)
                .collect(Collectors.groupingBy(integer -> integer%3));

        System.out.println(groupBy);





    }
}
