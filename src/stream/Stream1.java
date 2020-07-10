package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(13);
        list.add(2);
        list.add(25);
        list.add(25);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(31);
        list.add(21);
        list.add(45);
        list.add(19);

        Stream<Integer> stream = list.stream();
        // forEach in stream has an Consumer Entrance
        // forEach is a end Method and we cant add other method after foreach
        //   stream.forEach(s -> System.out.println(s));

        //filter has predicate entrance and its a middle method
        // sorted has comparator entrance
        // .sorted()  or .sorted((a, b) -> a - b)  Ascending sort
        // .sorted((a, b) -> b - a)  Descending sort

        //.limit(3) show 3 first objects
        //.skip(3)  dont show 3 first objects
        stream.filter(i -> i > 10).sorted((a, b) -> b - a).skip(3).forEach(System.out::println);

        //----------------------------------------------------------

        Stream<Integer> stream1 = list.stream();
        //map change an object to other  , its argument is a function
        // .distinct() delete repeated objects
        // .count is endMethod and returns a long

       Long count = stream1.map(i -> i.doubleValue()).distinct().count();
       System.out.println("count is : "+ count);

       //-------------------------------------

        Stream<Integer> stream2 = list.stream();

        List<Integer> mList = stream2.filter(integer -> integer>=10).distinct().sorted().collect(Collectors.toList());
        mList.stream().forEach(System.out::println);


        //-----------------------------------------------

        Stream<Integer> stream3 = list.stream();

        // .anyMatch  .allMatch   .noneMatch   has Predicate entrance and returns boolean

        boolean res = stream3.anyMatch(integer -> integer==10);
        System.out.println(res);


        //-------------------------------------------------------------------

        Stream<Integer> stream4 = list.stream();

        // .findAny()   returns an Optional
        // .findFirst()   returns an Optional

        Optional<Integer> optional = stream4.findAny();
        optional.ifPresent(integer -> System.out.println(integer));
    }

}
