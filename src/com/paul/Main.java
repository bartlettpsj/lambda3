package com.paul;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Main {

    static BinaryOperator<Integer> sum = (a, b) -> a + b;
    static Function<Integer, String> func = (a) -> a.toString();

    static int doStuff(Function<Integer, String> funk1, int number) {
        var result = funk1.apply(number);
        var answer = Integer.parseInt(result);
        return answer;
    }

    public static void main(String[] args) {
        var s = func.apply(786);
        System.out.printf("Result: %s\n", s);

        String[] strings = { "apple", "banana", "peach" };

        var x = sum.apply(1,sum.apply(2, 3));
        System.out.printf("The sum is %d\n", x);

        var result = doStuff(func, 123);
        System.out.printf("The doStuff returned %d\n", result);
    }

}
