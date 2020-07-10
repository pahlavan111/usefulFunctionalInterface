import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {

        // it has one abstract method named apply
        // it has one input and one output type
        // apply method catch input type and return outPut type

        Function<Character,Integer> turnCharToInt = (c) -> (int)c;
        int res =  turnCharToInt.apply('A');
        System.out.println(res);


        // it has one default method named andThen
        // when u use it your entrance Type is first function input type and the outPut is second Function output that you entered for andThen method as an input

        Function<String,Integer> getStrLength = String::length;
        Function<Integer,Boolean> isGreaterThan10 = integer -> integer>10;

        boolean result = getStrLength.andThen(isGreaterThan10).apply("sajjjjjjjjjjjjjlam");
        System.out.println(result);
    }
}
