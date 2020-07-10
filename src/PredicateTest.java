import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {


        // it has one abstract method that returns a boolean

        Predicate<Integer> equalToFive = (i) -> i == 5;
        Boolean res = equalToFive.test(6);
        System.out.println(res);


        //using method reference to test method of predicate
        Predicate<String> itsEmpty = String::isEmpty;
        Boolean res2 =itsEmpty.test("");
        System.out.println(res2);


        // predicate has some default methods

        //first define 2 Predicates
        Predicate<String> checkNotEmpty = s -> !s.isEmpty();
        Predicate<String> checkLength = s -> s.length()>10;

        //and
        boolean result = checkNotEmpty.and(checkLength).test("ddd");
        System.out.println("result is: "+ result);

        //or
        boolean orResult = checkLength.or(checkNotEmpty).test("e");
        System.out.println("result is: "+ orResult);

        //negate
        boolean negResult = checkNotEmpty.negate().test("");
        System.out.println("result is: "+ negResult);
        
    }
}
