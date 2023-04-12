package com.revature;

import java.util.Random;
import java.util.function.*;

public class FI {
    public static void main(String[] args) {
         consumerExample();
         predicateExample();
         functionExample();
         supplierExample();
    }

    public static void consumerExample() {
        // Consumer that takes in a single string and prints that string 10 times
        Consumer<String> printABunch = (value) -> {
            for(int i = 0; i < 10; i ++) {
                System.out.println(value);
            }
        };

        // BiConsumer takes in 2 values and doesn't return anything:
        BiConsumer<String, Integer> printABunch2 = (value, times) -> {
            for(int i = 0; i < times; i ++) {
                System.out.println(value);
            }
        };

        // Invoke the accept method to call these:
        printABunch.accept("Hello World");
        printABunch2.accept("Hello World 2", 5);
    }

    public static void predicateExample() {
        // Predicates take in a single value and return a boolean
        Predicate<Integer> isEven = (value) -> (value % 2 == 0);
        // take the sum of 2 values and return whether the sum is even:
        BiPredicate<Integer, Integer> isEven2 = (value1, value2) -> ((value1 + value2) % 2 == 0);
        BiPredicate<Integer, Integer> isDivisible = (value1, value2) -> (value1 % value2 == 0);

        // Invoke the .test method:
        System.out.println(isEven.test(5)); // false
        System.out.println(isEven.test(6)); // true
        System.out.println(isEven2.test(4,5)); // false
        System.out.println(isDivisible.test(20,5)); // true
        System.out.println(isDivisible.test(20,6)); // false
    }

    public static void functionExample() {
        // Functions take in a single value and return a value
        Function<String, String> greet = (name) -> "Hello " + name;
        //        param1   param2  return value
        BiFunction<String, String, String> greet2 = (name1, name2) -> "Hello " + name1 + " and " + name2;

        System.out.println(greet.apply("Mario"));
        System.out.println(greet2.apply("Mario", "Luigi"));
    }

    public static void supplierExample() {
        // Suppliers don't take in any arguments, just return something
        Supplier<Integer> random = () -> {
            Random generator = new Random();
            // return a random value between 0 and 99 (100 - 1)
            return generator.nextInt(100);
        };

        for(int i = 0; i < 10; i ++) {
            // invoke the .get method:
            System.out.println(random.get());
        }
    }
}
