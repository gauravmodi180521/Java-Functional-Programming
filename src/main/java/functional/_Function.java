package functional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = incrementByOne(1);
        System.out.println(increment);

        // Function
        // Takes one arguments and produces one result

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = multiplyByTenFunction.apply(increment2);
        System.out.println(multiply);

        Function<Integer,Integer> addOneAndMultiplybyTen =
                incrementByOneFunction.andThen(multiplyByTenFunction);
        System.out.println(addOneAndMultiplybyTen.apply(1));

        // BiFunction
        // Takes two arguments and produces one result

        System.out.println(incrementByOneAndmultiply(4,10));

        System.out.println(incrementByOneAndmultiplyFunction.apply(5,100));
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number+1;

    static Function<Integer, Integer> multiplyByTenFunction = number -> number*10;

    static BiFunction<Integer, Integer, Integer>  incrementByOneAndmultiplyFunction =
            (numberToIncrementByOne, numberToMultiplyBy) -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

    static int incrementByOne(int number){
        return number + 1;
    }

    static int incrementByOneAndmultiply(int number, int numMultiplyby){
        return (number + 1) * numMultiplyby;
    }
}
