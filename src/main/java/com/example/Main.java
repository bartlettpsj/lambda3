package main.java.com.example;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {

    static BinaryOperator<Integer> sum = (a, b) -> a + b;
    static Function<Integer, String> func = (a) -> a.toString();

    static int doStuff(Function<Integer, String> funk1, int number) {
        var result = funk1.apply(number);
        var answer = Integer.parseInt(result);
        return answer;
    }

    public static void main(String[] args) {
        // Try Lambda very bsic
        System.out.printf("Result: %s\n", func.apply(786));

        // Playing with Streams
        String[] strings = { "apple", "banana", "pear", "peach" };
        var stringStream = Stream.of(strings);
        System.out.println("Count: " + stringStream.filter(str -> str.startsWith("p")).count());


        var x = sum.apply(1,sum.apply(2, 3));
        System.out.printf("The sum is %d\n", x);

        var result = doStuff(func, 123);
        System.out.printf("The doStuff returned %d\n", result);
    }

}
